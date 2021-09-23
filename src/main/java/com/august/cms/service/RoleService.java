package com.august.cms.service;

import com.august.cms.domain.Role;
import com.august.cms.domain.RoleExample;
import com.august.cms.domain.UserRole;
import com.august.cms.domain.UserRoleExample;
import com.august.cms.mapper.RoleMapper;
import com.august.cms.mapper.UserRoleMapper;
import com.august.cms.req.UserLoginReq;
import com.august.cms.resp.RoleResp;
import com.august.cms.utils.CopyUtils;
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

    /**
     * 获取角色
     */
    public List<RoleResp> getRole(Integer userId){

        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        System.out.println(userRoles);
        UserRole userRole = userRoles.get(0);
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteriaRole = roleExample.createCriteria();
        criteriaRole.andIdEqualTo(userRole.getRoleId());
        List<Role> roles = roleMapper.selectByExample(roleExample);
        List<RoleResp> roleResps = CopyUtils.copyList(roles, RoleResp.class);
        return  roleResps;

    }
}
