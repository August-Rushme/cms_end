package com.august.cms.service;


import com.august.cms.domain.SGoods;
import com.august.cms.domain.SGoodsExample;
import com.august.cms.mapper.SGoodsMapper;
import com.august.cms.req.GoodsReq;
import com.august.cms.resp.GoodsResp;
import com.august.cms.resp.PageResp;
import com.august.cms.utils.CopyUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/29 16:23
 * @lastEditors: August
 * @version:1.0
 */
@Service
public class GoodsService {
    @Resource
    SGoodsMapper sGoodsMapper;
    public PageResp<GoodsResp> getGoodsList(GoodsReq req) {
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        SGoodsExample sGoodsExample = new SGoodsExample();
        SGoodsExample.Criteria criteria = sGoodsExample.createCriteria();
        criteria.andTypeEqualTo(2);
        return getGoodsRespPageResp(page, sGoodsExample);

    }

    private PageResp<GoodsResp> getGoodsRespPageResp(Page<Object> page, SGoodsExample sGoodsExample) {
        List<SGoods> sGoods = sGoodsMapper.selectByExample(sGoodsExample);
        List<GoodsResp> goods = CopyUtils.copyList(sGoods, GoodsResp.class);
        PageResp<GoodsResp> pageResp = new PageResp<>();
        pageResp.setTotal(page.getTotal());
        pageResp.setList(goods);
        return  pageResp;
    }

    public PageResp<GoodsResp> getGoodsSortList(GoodsReq req) {
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        SGoodsExample sGoodsExample = new SGoodsExample();
        SGoodsExample.Criteria criteria = sGoodsExample.createCriteria();
        criteria.andTypeEqualTo(1);
        return getGoodsRespPageResp(page, sGoodsExample);
    }

    public void save(SGoods req) {
        sGoodsMapper.insertSelective(req);
    }

    public void update(SGoods req) {
        sGoodsMapper.updateByPrimaryKeySelective(req);
    }

    public void removeByIds(Integer id) {
        sGoodsMapper.deleteByPrimaryKey(id);
    }

    public PageResp<GoodsResp> searchList(GoodsReq req) {
        SGoodsExample sGoodsExample = new SGoodsExample();
        SGoodsExample.Criteria criteria = sGoodsExample.createCriteria();
        criteria.andGoodsNameLike("%" + req.getQuery() + "%");
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<SGoods> goods = sGoodsMapper.selectByExample(sGoodsExample);
        List<GoodsResp> goodsResps = CopyUtils.copyList(goods, GoodsResp.class);
        PageResp<GoodsResp> pageResp = new PageResp<>();
        pageResp.setList(goodsResps);
        pageResp.setTotal(page.getTotal());
        return pageResp;
    }
}
