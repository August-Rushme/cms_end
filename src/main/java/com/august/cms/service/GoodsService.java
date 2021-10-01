package com.august.cms.service;


import com.august.cms.Dto.GoodsDto;
import com.august.cms.Dto.MenuDto;
import com.august.cms.domain.SGoods;
import com.august.cms.domain.SGoodsExample;
import com.august.cms.mapper.SGoodsMapper;
import com.august.cms.req.GoodsReq;
import com.august.cms.resp.GoodsResp;
import com.august.cms.resp.MenusResp;
import com.august.cms.resp.PageResp;
import com.august.cms.utils.CopyUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        List<SGoods> sGoods = sGoodsMapper.selectByExampleWithBLOBs(sGoodsExample);
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
        criteria.andTypeEqualTo(2);
        criteria.andGoodsNameLike("%" + req.getQuery() + "%");
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<SGoods> goods = sGoodsMapper.selectByExampleWithBLOBs(sGoodsExample);
        List<GoodsResp> goodsResps = CopyUtils.copyList(goods, GoodsResp.class);
        PageResp<GoodsResp> pageResp = new PageResp<>();
        pageResp.setList(goodsResps);
        pageResp.setTotal(page.getTotal());
        return pageResp;
    }

    public List<GoodsDto> getGoodsTreeList() {
        List<GoodsResp> goods= getAllGoodsList();
        // 转树状结构
        List<GoodsResp> goodsTree = buildTreeMenu(goods);
        // 实体转DTO
        return convert(goodsTree);
    }
    private List<GoodsDto> convert(List<GoodsResp> goodsTree) {
        ArrayList<GoodsDto> goodsDto = new ArrayList<>();
        goodsTree.forEach(m->{
            GoodsDto dto = new GoodsDto();
            dto.setGoodsId(m.getGoodsId());
            dto.setGoodsName(m.getGoodsName());
            dto.setGoodsImg(m.getGoodsImg());
            dto.setGoodsInfo(m.getGoodsInfo());
            dto.setType(m.getType());
            dto.setGoodsPriceNew(m.getGoodsPriceNew());
            dto.setGoodsPriceOld(m.getGoodsPriceOld());
            dto.setGoodsSrc(m.getGoodsSrc());
            if(m.getChildren().size()>0){}
            // 子节点调用当前方法进行再次转换
            dto.setChildren(convert(m.getChildren()));
            goodsDto.add(dto);
        });
        return goodsDto;
    }
    private List<GoodsResp> buildTreeMenu(List<GoodsResp> goods) {
        List<GoodsResp> finalGoods = new ArrayList<>();
        // 先各自寻找到各自的子节点
        for (GoodsResp good : goods) {

            for (GoodsResp e : goods) {
                if (good.getGoodsId().equals(e.getParentId())) {
                    good.getChildren().add(e);
                }
            }

            // 提取出父节点
            if (good.getParentId() == 0) {
                finalGoods .add(good);
            }

        }
        return finalGoods ;
    }

    private List<GoodsResp> getAllGoodsList() {
        List<SGoods> goods = sGoodsMapper.selectByExample(null);
        List<GoodsResp> goodsResps = CopyUtils.copyList(goods, GoodsResp.class);
        return  goodsResps;
    }

    public PageResp<GoodsResp> getGoodsSortSearchList(GoodsReq req) {
        SGoodsExample sGoodsExample = new SGoodsExample();
        SGoodsExample.Criteria criteria = sGoodsExample.createCriteria();
        criteria.andTypeEqualTo(1);
        criteria.andGoodsNameLike("%" + req.getQuery() + "%");
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<SGoods> goods = sGoodsMapper.selectByExampleWithBLOBs(sGoodsExample);
        List<GoodsResp> goodsResps = CopyUtils.copyList(goods, GoodsResp.class);
        PageResp<GoodsResp> pageResp = new PageResp<>();
        pageResp.setList(goodsResps);
        pageResp.setTotal(page.getTotal());
        return pageResp;
    }
}
