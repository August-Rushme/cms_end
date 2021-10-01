package com.august.cms.resp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author August
 * @date 2021/9/29 16:31
 * @lastEditors: August
 * @version:1.0
 */
public class GoodsResp {
    private Integer goodsId;

    private String goodsName;

    private Integer type;

    private Integer catsId;

    private String goodsPriceOld;

    private Integer goodsPriceNew;

    private Integer goodsDelete;

    private String goodsInfo;

    private Integer goodsNumber;

    private String goodsSrc;

    private Integer parentId;

    private String goodsImg;

    private List<GoodsResp> children = new ArrayList<>();

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCatsId() {
        return catsId;
    }

    public void setCatsId(Integer catsId) {
        this.catsId = catsId;
    }

    public String getGoodsPriceOld() {
        return goodsPriceOld;
    }

    public void setGoodsPriceOld(String goodsPriceOld) {
        this.goodsPriceOld = goodsPriceOld;
    }

    public Integer getGoodsPriceNew() {
        return goodsPriceNew;
    }

    public void setGoodsPriceNew(Integer goodsPriceNew) {
        this.goodsPriceNew = goodsPriceNew;
    }

    public Integer getGoodsDelete() {
        return goodsDelete;
    }

    public void setGoodsDelete(Integer goodsDelete) {
        this.goodsDelete = goodsDelete;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsSrc() {
        return goodsSrc;
    }

    public void setGoodsSrc(String goodsSrc) {
        this.goodsSrc = goodsSrc;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public List<GoodsResp> getChildren() {
        return children;
    }

    public void setChildren(List<GoodsResp> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "GoodsResp{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", type=" + type +
                ", catsId=" + catsId +
                ", goodsPriceOld='" + goodsPriceOld + '\'' +
                ", goodsPriceNew=" + goodsPriceNew +
                ", goodsDelete=" + goodsDelete +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", goodsNumber=" + goodsNumber +
                ", goodsSrc='" + goodsSrc + '\'' +
                ", parentId=" + parentId +
                ", goodsImg='" + goodsImg + '\'' +
                ", children=" + children +
                '}';
    }
}
