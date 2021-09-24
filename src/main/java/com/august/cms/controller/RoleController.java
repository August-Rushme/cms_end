package com.august.cms.controller;

import com.august.cms.domain.Role;
import com.august.cms.domain.RoleMenu;
import com.august.cms.req.MenuIdsReq;
import com.august.cms.req.RoleReq;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.PageResp;
import com.august.cms.resp.RoleResp;
import com.august.cms.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    /**
     * 获取角色和对应的菜单id
     * @param id
     * @return
     */
    @GetMapping("/info/{id}")
    public CommonResp getInfo(@PathVariable("id") Integer id){
        CommonResp<Object> resp = new CommonResp<>();
        RoleResp role = roleService.getRoleById(id);
        // 获取角色相关联的菜单id
        List<Integer> menusIds = roleService.getMenusId(id);
        role.setMenuIds(menusIds);
        resp.setData(role);
        return resp;
    }
    @PostMapping("/list/search")
    public CommonResp searchList(@RequestBody @Validated RoleReq req){
        CommonResp<Object> resp = new CommonResp<>();
        PageResp<Role> rolePageResp = roleService.searchList(req);
        resp.setData(rolePageResp);
        return resp;
    }
    @PostMapping("/save")
    public CommonResp save(@RequestBody Role role){
        CommonResp<Object> resp = new CommonResp<>();
        role.setCreated(LocalDateTime.now());
        role.setUpdated(LocalDateTime.now());
        role.setStatu(1);
        roleService.save(role);
        resp.setMessage("添加成功");
        return resp;
    }
    @PostMapping("/update")
    public CommonResp update(@Validated @RequestBody Role role){
        CommonResp<Object> resp = new CommonResp<>();
        role.setUpdated(LocalDateTime.now());
        int i = roleService.update(role);
        if (i==0){
            resp.setMessage("编辑失败");
            return  resp;
        }
        resp.setMessage("编辑成功");
        return resp;
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public CommonResp delete(@PathVariable("id") Integer id) {
        CommonResp<Object> resp = new CommonResp<>();
        roleService.removeByIds(id);
        // 删除中间表
        roleService.removeUserRoleId(id);
        roleService.removeRoleMenuId(id);
        resp.setMessage("删除成功");
        return resp;
    }
    @PostMapping("/perm/{roleId}")
    @Transactional
    public CommonResp givePermission(@PathVariable("roleId") Integer roleId, @RequestBody MenuIdsReq req) {
        List<Integer> menuIds = req.getMenuIds();
        System.out.println(menuIds);
        CommonResp<Object> resp = new CommonResp<>();
        List<RoleMenu> roleMenus = new ArrayList<>();
        menuIds.forEach(menuId -> {
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setMenuId(menuId);
            roleMenu.setRoleId(roleId);
            roleMenus.add(roleMenu);
        });
        // 先删除原来的记录，再保存新的
        roleService.removeRoleMenuId(roleId);
        roleService.saveMenus(roleMenus);
        resp.setMessage("分配权限成功");
        return resp;
    }

}
