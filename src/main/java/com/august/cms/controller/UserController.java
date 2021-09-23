package com.august.cms.controller;

import com.alibaba.fastjson.JSONObject;
import com.august.cms.req.UserLoginReq;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.UserInfoResp;
import com.august.cms.resp.UserLoginResp;
import com.august.cms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
     * @param userId
     * @return
     */
    @GetMapping("/userInfo/{userId}")
        public CommonResp getUserInfo(@PathVariable Integer userId){
        CommonResp<Object> resp = new CommonResp<>();
        List<UserInfoResp> userInfo = userService.getUserInfo(userId);
        resp.setData(userInfo);
        return resp;
    }
}
