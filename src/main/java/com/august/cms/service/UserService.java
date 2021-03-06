package com.august.cms.service;
import com.august.cms.domain.*;
import com.august.cms.exception.BusinessException;
import com.august.cms.exception.BusinessExceptionCode;
import com.august.cms.mapper.*;
import com.august.cms.req.RoleReq;
import com.august.cms.req.UserLoginReq;
import com.august.cms.req.UserReq;
import com.august.cms.resp.*;
import com.august.cms.utils.CopyUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author August
 * @date 2021/9/17 16:59
 * @lastEditors: August
 * @version:1.0
 */
@Service
public class UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Resource
    UserInfoMapper userInfoMapper;
    @Resource
    MenuMapper menuMapper;
    @Resource
    RoleService roleService;
    @Resource
    UserRoleMapper userRoleMapper;


    /**
     * 查找用户名
     *
     * @param userName
     * @return
     */
    public UserInfo selectByUserName(String userName) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
       criteria.andUsernameEqualTo(userName);
        List<UserInfo> userList = userInfoMapper.selectByExample(userInfoExample);
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        } else {
            return userList.get(0);
        }
    }
    /**
     * 登录
     */
    public UserLoginResp login(UserLoginReq req) {
        UserInfo userDb = selectByUserName(req.getUserName());
        if (ObjectUtils.isEmpty(userDb)) {
            // 用户名不存在
            LOG.info("用户名不存在, {}", req.getUserName());
            throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
        } else {
            if (userDb.getPassword().equals(req.getPassword())) {
                // 登录成功
                UserLoginResp userLoginResp = CopyUtils.copy(userDb, UserLoginResp.class);
                userLoginResp.setId(userDb.getId());
                userLoginResp.setUserName(userDb.getUsername());
                return userLoginResp;
            } else {
                // 密码不对
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", req.getPassword(), userDb.getPassword());
                throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
            }
        }

    }
    /**
     * 获取用户菜单
     */
     public List<MenusResp> getMenuList(Integer userId){
         List<Integer> menuIds = userInfoMapper.getMenuIds(userId);
         MenuExample menuExample = new MenuExample();
         MenuExample.Criteria criteria = menuExample.createCriteria();
         criteria.andIdIn(menuIds);
         List<Menu>  list = menuMapper.selectByExample(menuExample);
         List<MenusResp> menus = CopyUtils.copyList(list, MenusResp.class);
         return  menus;
     }
    /**
     * 获取用户的权限
     */
    public String getUserAuthorityInfo(Integer userId) {
        String authority = "";
        // 获取角色编码
        List<RoleResp> roles = roleService.getRole(userId);
        if (roles.size() > 0) {
            String roleCodes = roles.stream().map(r -> "ROLE_" + r.getCode()).collect(Collectors.joining(","));
            authority = roleCodes.concat(",");
        }
        // 获取菜单编码
        List<Integer> menuIds = userInfoMapper.getMenuIds(userId);
        if (menuIds.size() > 0) {
            List<MenusResp> menus = getMenuList(userId);
            String menuPerms = menus.stream().map(m -> m.getPermission()).collect(Collectors.joining(","));
            authority = authority.concat(menuPerms);
        }
        return authority;
    }

    /**
     * 根据id获取用户信息
     * @param userId
     * @return
     */
    public List<UserInfoResp> getUserInfo(Integer userId){
        UserInfoResp userInfoResp = new UserInfoResp();
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andIdEqualTo(userId);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        List<RoleResp> role = roleService.getRole(userId);
        List<UserInfoResp> userInfoResps = CopyUtils.copyList(userInfos, UserInfoResp.class);
        userInfoResps.forEach(u->{
            u.setRole(role);
        });
        return userInfoResps;
    }

    /**
     * 获取用户列表
     * @param req
     * @return
     */
    public PageResp<UserResp> getList(UserReq req) {
        System.out.println(req);
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<UserInfo> usersList = userInfoMapper.selectByExample(null);
        System.out.println(usersList);
        List<UserResp> users = CopyUtils.copyList(usersList, UserResp.class);
        users.forEach(u->{
            u.setRoles(roleService.getRole(u.getId()));
        });
        PageInfo<UserResp> userPageInfo = new PageInfo<>(users);
        PageResp<UserResp> pageResp = new PageResp<>();
        pageResp.setList(users);
        pageResp.setTotal(page.getTotal());
        return pageResp;
    }

    public void save(UserInfo user) {
        userInfoMapper.insert(user);
    }

    public void update(UserInfo user) {
        userInfoMapper.updateByPrimaryKeySelective(user);
    }

    public void removeByIds(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    public void removeUserRoleById(Integer id) {
        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        userRoleMapper.deleteByExample(userRoleExample);

    }


    public void saveRole(List<UserRole> userRoles) {
        userRoles.forEach(role->{
            userRoleMapper.insertSelective(role);
        });
    }

    /**
     * 搜索
     * @param req
     * @return
     */
    public PageResp<UserInfo> searchList(UserReq req) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        System.out.println(req.getQuery());
        criteria.andUsernameLike("%" + req.getQuery() + "%");
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        PageInfo<UserInfo> userInfoPageInfo = new PageInfo<>(userInfos);
        PageResp<UserInfo> pageResp = new PageResp<>();
        pageResp.setList(userInfos);
        pageResp.setTotal(page.getTotal());
        return pageResp;

    }

}
