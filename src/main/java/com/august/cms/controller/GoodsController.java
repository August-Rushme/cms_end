package com.august.cms.controller;

import com.august.cms.Dto.MenuDto;
import com.august.cms.domain.Role;
import com.august.cms.domain.SGoods;
import com.august.cms.req.GoodsReq;
import com.august.cms.req.RoleReq;
import com.august.cms.req.UserReq;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.GoodsResp;
import com.august.cms.resp.PageResp;
import com.august.cms.resp.UserResp;
import com.august.cms.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/29 16:23
 * @lastEditors: August
 * @version:1.0
 */
@RestController
@RequestMapping("/api/v1/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    /**
     * 获取商品列表
     * @param req
     * @return
     */
    @PostMapping("/list")
    public CommonResp getMenus(@RequestBody GoodsReq req){
        CommonResp<Object> resp = new CommonResp<>();
        PageResp<GoodsResp> goodsList = goodsService.getGoodsList(req);
        resp.setData(goodsList);
        return resp;
    }
    @PostMapping("/list/search")
    public CommonResp searchList(@RequestBody @Validated GoodsReq req){
        System.out.println(req.getQuery());
        CommonResp<Object> resp = new CommonResp<>();
        PageResp<GoodsResp> goodsPageResp = goodsService.searchList(req);
        resp.setData(goodsPageResp);
        return resp;
    }
    /**
     * 获取商品分类列表
     * @param req
     * @return
     */
    @PostMapping("/list/sort")
    public CommonResp getMenusSort(@RequestBody GoodsReq req){
        CommonResp<Object> resp = new CommonResp<>();
        PageResp<GoodsResp> goodsSortList = goodsService.getGoodsSortList(req);
        resp.setData(goodsSortList);
        return resp;
    }
    /**
     * 添加商品
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@RequestBody SGoods req){
        CommonResp<Object> resp = new CommonResp<>();
        goodsService.save(req);
        resp.setMessage("添加成功");
        return resp;
    }
    /**
     * 编辑商品
     * @param req
     * @return
     */
    @PostMapping("/update")
    public CommonResp update(@RequestBody SGoods req){
        CommonResp<Object> resp = new CommonResp<>();
        goodsService.update(req);
        resp.setMessage("编辑成功");
        return resp;
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable("id") Integer id) {
        CommonResp<Object> resp = new CommonResp<>();
        goodsService.removeByIds(id);
        resp.setMessage("删除成功");
        return resp;
    }
}
