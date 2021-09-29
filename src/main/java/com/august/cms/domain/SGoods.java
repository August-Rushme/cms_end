package com.august.cms.domain;

public class SGoods {
    private Integer goodsId;

    private String goodsName;

    private Integer type;

    private String goodsImg;

    private Integer catsId;

    private String goodsPriceOld;

    private Integer goodsPriceNew;

    private Integer goodsDelete;

    private String goodsInfo;

    private Integer goodsNumber;

    private String goodsSrc;

    private Integer parentId;

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

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", type=").append(type);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", catsId=").append(catsId);
        sb.append(", goodsPriceOld=").append(goodsPriceOld);
        sb.append(", goodsPriceNew=").append(goodsPriceNew);
        sb.append(", goodsDelete=").append(goodsDelete);
        sb.append(", goodsInfo=").append(goodsInfo);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsSrc=").append(goodsSrc);
        sb.append(", parentId=").append(parentId);
        sb.append("]");
        return sb.toString();
    }
}