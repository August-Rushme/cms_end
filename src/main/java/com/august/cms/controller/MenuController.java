package com.august.cms.controller;

import com.august.cms.Dto.MenuDto;
import com.august.cms.domain.Menu;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.MenusResp;
import com.august.cms.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
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

    /**
     * 获取当前用户的树状菜单
     * @param userId
     * @return
     */
    @GetMapping("/list")
    public CommonResp getMenus(Integer userId){
        CommonResp<Object> resp = new CommonResp<>();
        List<MenuDto> menus = menuService.getCurrentUserMenus(userId);
        resp.setData(menus);
        return resp;
    }

    /**
     * 获取所有的菜单信息
     * @return
     */
    @GetMapping("/menusList")
    public CommonResp getAllMenus(){
        CommonResp<Object> resp = new CommonResp<>();
        List<MenusResp> menusAll = menuService.tree();
        resp.setData(menusAll);
        return resp;
    }

    /**
     * 添加菜单
     * @param menu
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Validated @RequestBody Menu menu) {
        menu.setCreatedat(LocalDateTime.now());
        menu.setUpdatedat(LocalDateTime.now());
        CommonResp<Object> resp = new CommonResp<>();
        menuService.save(menu);
        resp.setMessage("添加菜单成功");
        return resp;
    }
    @PostMapping("/update")
    public CommonResp update(@Validated @RequestBody Menu menu) {
        menu.setUpdatedat(LocalDateTime.now());
        CommonResp<Object> resp = new CommonResp<>();
        menuService.updateById(menu);
        resp.setMessage("编辑菜单成功");
        return resp;
    }

    /**
     * 删除某一个菜单
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable("id") Integer id){
        CommonResp<Object> resp = new CommonResp<>();
        Integer count = menuService.count(id);
        if (count>0){
            resp.setMessage("删除失败，请先删除子菜单");
            resp.setSuccess(false);
            return resp;
        }
        menuService.removeById(id);
        // 同步删除中间关联表中的menu_id
        menuService.removeRoleMenuId(id);
        resp.setMessage("删除成功");
        return resp;

    }

}
