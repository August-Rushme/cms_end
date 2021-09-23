package com.august.cms.service;
import com.august.cms.Dto.MenuDto;
import com.august.cms.resp.MenusResp;
import net.minidev.json.JSONUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
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

}
