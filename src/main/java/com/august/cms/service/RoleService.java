package com.august.cms.service;

import com.august.cms.domain.*;
import com.august.cms.mapper.RoleMapper;
import com.august.cms.mapper.RoleMenuMapper;
import com.august.cms.mapper.UserRoleMapper;
import com.august.cms.req.RoleReq;
import com.august.cms.req.UserLoginReq;
import com.august.cms.resp.PageResp;
import com.august.cms.resp.RoleResp;
import com.august.cms.utils.CopyUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 8:50
 * @lastEditors: August
 * @version:1.0
 */
@Service
public class RoleService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Resource
    RoleMapper roleMapper;
    @Resource
    UserRoleMapper userRoleMapper;
    @Resource
    RoleMenuMapper roleMenuMapper;

    /**
     * 获取角色
     * @param userId
     * @return
     */
    public List<RoleResp> getRole(Integer userId){

        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = userRoles.get(0);
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteriaRole = roleExample.createCriteria();
        criteriaRole.andIdEqualTo(userRole.getRoleId());
        List<Role> roles = roleMapper.selectByExample(roleExample);
        List<RoleResp> roleResps = CopyUtils.copyList(roles, RoleResp.class);
        return  roleResps;

    }

    public RoleResp getRoleById(Integer id) {
        Role role = roleMapper.selectByPrimaryKey(id);
        RoleResp resp = CopyUtils.copy(role, RoleResp.class);
        return resp;
    }

    public List<Integer> getMenusId(Integer id) {
        List<Integer> menuIds = roleMapper.getMenuIds(id);
        return  menuIds;
    }

    /**
     * 搜索
     * @param req
     * @return
     */
    public PageResp<Role> searchList(RoleReq req) {
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        System.out.println(req.getQuery());
        criteria.andNameLike("%" + req.getQuery() + "%");
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<Role> roles = roleMapper.selectByExample(roleExample);
        System.out.println(roles);
        PageInfo<Role> rolePageInfo = new PageInfo<>(roles);
        PageResp<Role> pageResp = new PageResp<>();
        pageResp.setList(roles);
        pageResp.setTotal(rolePageInfo.getTotal());
        return pageResp;

    }


    public void save(Role role) {
        roleMapper.insertSelective(role);
    }


    public int update(Role role) {
        int i = roleMapper.updateByPrimaryKey(role);
        return i;
    }

    public void removeByIds(Integer id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 删除user_role中对应的role_id
     * @param id
     */
    public void removeUserRoleId(Integer id){
        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andRoleIdEqualTo(id);
        userRoleMapper.deleteByExample(userRoleExample);


    }

    /**
     * 删除role_menus中对应的role_id
     * @param id
     */
    public void removeRoleMenuId(Integer id) {
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        criteria.andRoleIdEqualTo(id);
        roleMenuMapper.deleteByExample(roleMenuExample);
    }

    public void saveMenus(List<RoleMenu> roleMenus) {
        roleMenus.forEach(roleMenu->{
            roleMenuMapper.insertSelective(roleMenu);
        });
    }
}
