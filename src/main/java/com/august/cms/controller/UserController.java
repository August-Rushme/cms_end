package com.august.cms.controller;


import com.alibaba.fastjson.JSONObject;
import com.august.cms.req.UserLoginReq;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.UserLoginResp;
import com.august.cms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @Resource
    private RedisTemplate redisTemplate;
    /**
     * 登录
     */
     @PostMapping("/login")
     public CommonResp login(@Valid @RequestBody UserLoginReq req){
         req.setUserPassword(DigestUtils.md5DigestAsHex(req.getUserPassword().getBytes()));
         CommonResp<UserLoginResp> resp = new CommonResp<>();
         UserLoginResp userLoginResp = userService.login(req);
         String token = UUID.randomUUID().toString();
         LOG.info("生成一个24h的登录token：{}，并放入redis中", token);
         userLoginResp.setToken(token);
         redisTemplate.opsForValue().set(token, JSONObject.toJSONString(userLoginResp), 3600 * 24, TimeUnit.SECONDS);
         resp.setData(userLoginResp);
         return resp;
     }

}
