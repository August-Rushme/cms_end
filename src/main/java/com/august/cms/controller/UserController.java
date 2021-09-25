package com.august.cms.controller;

import com.alibaba.fastjson.JSONObject;
import com.august.cms.domain.UserInfo;
import com.august.cms.domain.UserRole;
import com.august.cms.req.RoleIdsReq;
import com.august.cms.req.UserLoginReq;
import com.august.cms.req.UserReq;
import com.august.cms.resp.*;
import com.august.cms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author August
 * @date 2021/9/17 17:00
 * @lastEditors: August
 * @version:1.0
 */

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private UserService userService;
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    /**
     * 登录
     *
     * @param req
     * @return
     */
    @PostMapping("/login")
    public CommonResp login(@Valid @RequestBody UserLoginReq req) {
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp<UserLoginResp> resp = new CommonResp<>();
        UserLoginResp userLoginResp = userService.login(req);
        String token = UUID.randomUUID().toString();
        LOG.info("生成一个24h的登录token：{}，并放入redis中", token);
        userLoginResp.setToken(token);
        redisTemplate.opsForValue().set(token, JSONObject.toJSONString(userLoginResp), 3600 * 24, TimeUnit.SECONDS);
        resp.setData(userLoginResp);
        return resp;
    }
    /**
     * 用户菜单
     */
    @GetMapping("/menu")
    public CommonResp login(Integer userId){
        CommonResp<Object> resp = new CommonResp<>();
        List menuList = userService.getMenuList(userId);
        resp.setData(menuList);
        return  resp;
    }
    /**
     * 用户权限
     */
    @GetMapping("/authority")
        public CommonResp getAuthorities(Integer userId){
        CommonResp<Object> resp = new CommonResp<>();
        String userAuthorityInfo = userService.getUserAuthorityInfo(userId);
        String[] authorityInfoArray = StringUtils.tokenizeToStringArray(userAuthorityInfo, ",");
        resp.setData(authorityInfoArray);
        return resp;
    }

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/userInfo/{id}")
        public CommonResp getUserInfo(@PathVariable("id") Integer id){
        CommonResp<Object> resp = new CommonResp<>();
        List<UserInfoResp> userInfo = userService.getUserInfo(id);
        Assert.notNull(userInfo, "找不到该用户");
        resp.setData(userInfo);
        return resp;
    }

    /**
     * 获取用户列表
     * @param req
     * @return
     */
    @GetMapping("/list")
    public CommonResp list(UserReq req) {
        CommonResp<Object> resp = new CommonResp<>();
        PageResp<UserResp> rolePageResp = userService.getList(req);
        resp.setData(rolePageResp);
        return resp;
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Validated @RequestBody UserInfo user) {
        CommonResp<Object> resp = new CommonResp<>();
        user.setCreatedat(LocalDateTime.now());
        user.setUpdatedat(LocalDateTime.now());
        user.setStatuts("true");
        userService.save(user);
        resp.setMessage("添加用户成功");
        return resp;
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping("/update")
    public CommonResp update(@Validated @RequestBody UserInfo user) {
        CommonResp<Object> resp = new CommonResp<>();
        user.setUpdatedat(LocalDateTime.now());
        userService.update(user);
        resp.setMessage("更新用户成功");
        return resp;
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public CommonResp delete( @PathVariable("id") Integer id) {
        CommonResp<Object> resp = new CommonResp<>();
        userService.removeByIds(id);
        // 删除中间表
        userService.removeUserRoleById(id);
        resp.setMessage("删除成功");
        return resp;
    }
    @Transactional
    @PostMapping("/role/{userId}")
    public CommonResp rolePermission(@PathVariable("userId") Integer userId, @RequestBody RoleIdsReq req) {
        CommonResp<Object> resp = new CommonResp<>();
        List<Integer> roleIds = req.getRoleIds();
        List<UserRole> userRoles = new ArrayList<>();
        roleIds.forEach(r -> {
            UserRole userRole = new UserRole();
            userRole.setRoleId(r);
            userRole.setUserId(userId);
            userRoles.add(userRole);
        });
        // 先删除再添加
        userService.removeUserRoleById(userId);
        userService.saveRole(userRoles);
        resp.setMessage("添加成功");
        return resp;
    }
}
