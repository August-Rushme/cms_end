package com.august.cms.controller;

import com.august.cms.Dto.MenuDto;
import com.august.cms.resp.CommonResp;
import com.august.cms.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 8:15
 * @lastEditors: August
 * @version:1.0
 */
@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {
    @Resource
    MenuService menuService;
    private static final Logger LOG = LoggerFactory.getLogger(MenuService.class);
    @GetMapping("/list")
    public CommonResp getMenus(Integer userId){
        CommonResp<Object> resp = new CommonResp<>();
        List<MenuDto> menus = menuService.getCurrentUserMenus(userId);
        resp.setData(menus);
        return resp;
    }
}
