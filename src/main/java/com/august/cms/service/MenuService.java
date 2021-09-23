package com.august.cms.service;
import com.august.cms.Dto.MenuDto;
import com.august.cms.domain.Menu;
import com.august.cms.domain.MenuExample;
import com.august.cms.domain.RoleMenuExample;
import com.august.cms.mapper.MenuMapper;
import com.august.cms.mapper.RoleMenuMapper;
import com.august.cms.resp.MenusResp;
import com.august.cms.utils.CopyUtils;
import net.minidev.json.JSONUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.crypto.spec.IvParameterSpec;
import java.util.ArrayList;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 11:33
 * @lastEditors: August
 * @version:1.0
 */
@Service
public class MenuService {
    @Resource
    UserService userService;
    @Resource
    MenuMapper menuMapper;
    @Resource
    RoleMenuMapper roleMenuMapper;

    /**
     * 获取当前用户的树状菜单
     * @param userId
     * @return
     */
    public List<MenuDto> getCurrentUserMenus(Integer userId) {
        List<MenusResp> menus = userService.getMenuList(userId);
      // 转树状结构
        List<MenusResp> menuTree = buildTreeMenu(menus);
        // 实体转DTO
        return convert(menuTree);
    }

    /**
     * 实体转DTO
     * @param menuTree
     * @return
     */
    private List<MenuDto> convert(List<MenusResp> menuTree) {
        ArrayList<MenuDto> menusDto = new ArrayList<>();
        menuTree.forEach(m->{
            MenuDto dto = new MenuDto();
            dto.setId(m.getId());
            dto.setIcon(m.getIcon());
            dto.setName(m.getName());
            dto.setSort(m.getSort());
            dto.setType(m.getType());
            dto.setPath(m.getPath());
            if(m.getChildren().size()>0){}
            // 子节点调用当前方法进行再次转换
            dto.setChildren(convert(m.getChildren()));
            menusDto.add(dto);
        });
        return menusDto;
    }

    /**
     * 转树状结构
     * @param menus
     * @return
     */
    private List<MenusResp> buildTreeMenu(List<MenusResp> menus) {
        List<MenusResp> finalMenus = new ArrayList<>();
        // 先各自寻找到各自的子节点
        for (MenusResp menu : menus) {

            for (MenusResp e : menus) {
                if (menu.getId().equals(e.getParentId())) {
                    menu.getChildren().add(e);
                }
            }

            // 提取出父节点
            if (menu.getParentId() == 0) {
                finalMenus.add(menu);
            }

        }
        return finalMenus;

    }

    /**
     * 获取所有菜单信息
     * @return
     */
    public List<MenusResp> tree() {
        // 获取所有菜单信息
        List<Menu> menusAll = menuMapper.selectByExample(null);
        List<MenusResp> menusAllResp = CopyUtils.copyList(menusAll, MenusResp.class);
        //转树状结构
        return  buildTreeMenu(menusAllResp);
    }

    /**
     * 添加菜单
     * @param menu
     */
    public void save(Menu menu) {
        menuMapper.insertSelective(menu);
    }

    /**
     * 更新菜单
     * @param menu
     */
    public void updateById(Menu menu) {
        menuMapper.updateByPrimaryKey(menu);
    }


    public Integer count(Integer id) {
        Integer count = 0;
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        count = menus.size();
        return count;
    }

    public void removeById(Integer id) {
        menuMapper.deleteByPrimaryKey(id);
    }

    public void removeRoleMenuId(Integer id) {
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        criteria.andMenuIdEqualTo(id);
        roleMenuMapper.deleteByExample(roleMenuExample);
    }
}
