package com.august.cms.controller;

import com.august.cms.req.UserLoginReq;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.RoleResp;
import com.august.cms.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 9:18
 * @lastEditors: August
 * @version:1.0
 */
@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Resource
    RoleService roleService;
    private static final Logger LOG = LoggerFactory.getLogger(RoleController.class);
    /**
     * 获取角色
     */
    @PostMapping("/list")
    public CommonResp getRole(Integer userId){
        CommonResp<Object> resp = new CommonResp<>();
        List<RoleResp> role = roleService.getRole(userId);
        resp.setData(role);
        return  resp;
    }
}
