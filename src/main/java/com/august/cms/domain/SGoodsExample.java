package com.august.cms.domain;

import java.util.ArrayList;
import java.util.List;

public class SGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SGoodsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCatsIdIsNull() {
            addCriterion("cats_id is null");
            return (Criteria) this;
        }

        public Criteria andCatsIdIsNotNull() {
            addCriterion("cats_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatsIdEqualTo(Integer value) {
            addCriterion("cats_id =", value, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdNotEqualTo(Integer value) {
            addCriterion("cats_id <>", value, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdGreaterThan(Integer value) {
            addCriterion("cats_id >", value, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cats_id >=", value, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdLessThan(Integer value) {
            addCriterion("cats_id <", value, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cats_id <=", value, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdIn(List<Integer> values) {
            addCriterion("cats_id in", values, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdNotIn(List<Integer> values) {
            addCriterion("cats_id not in", values, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdBetween(Integer value1, Integer value2) {
            addCriterion("cats_id between", value1, value2, "catsId");
            return (Criteria) this;
        }

        public Criteria andCatsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cats_id not between", value1, value2, "catsId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldIsNull() {
            addCriterion("goods_price_old is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldIsNotNull() {
            addCriterion("goods_price_old is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldEqualTo(String value) {
            addCriterion("goods_price_old =", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotEqualTo(String value) {
            addCriterion("goods_price_old <>", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldGreaterThan(String value) {
            addCriterion("goods_price_old >", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldGreaterThanOrEqualTo(String value) {
            addCriterion("goods_price_old >=", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldLessThan(String value) {
            addCriterion("goods_price_old <", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldLessThanOrEqualTo(String value) {
            addCriterion("goods_price_old <=", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldLike(String value) {
            addCriterion("goods_price_old like", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotLike(String value) {
            addCriterion("goods_price_old not like", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldIn(List<String> values) {
            addCriterion("goods_price_old in", values, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotIn(List<String> values) {
            addCriterion("goods_price_old not in", values, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldBetween(String value1, String value2) {
            addCriterion("goods_price_old between", value1, value2, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotBetween(String value1, String value2) {
            addCriterion("goods_price_old not between", value1, value2, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewIsNull() {
            addCriterion("goods_price_new is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewIsNotNull() {
            addCriterion("goods_price_new is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewEqualTo(Integer value) {
            addCriterion("goods_price_new =", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewNotEqualTo(Integer value) {
            addCriterion("goods_price_new <>", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewGreaterThan(Integer value) {
            addCriterion("goods_price_new >", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_price_new >=", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewLessThan(Integer value) {
            addCriterion("goods_price_new <", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewLessThanOrEqualTo(Integer value) {
            addCriterion("goods_price_new <=", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewIn(List<Integer> values) {
            addCriterion("goods_price_new in", values, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewNotIn(List<Integer> values) {
            addCriterion("goods_price_new not in", values, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewBetween(Integer value1, Integer value2) {
            addCriterion("goods_price_new between", value1, value2, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_price_new not between", value1, value2, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteIsNull() {
            addCriterion("goods_delete is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteIsNotNull() {
            addCriterion("goods_delete is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteEqualTo(Integer value) {
            addCriterion("goods_delete =", value, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteNotEqualTo(Integer value) {
            addCriterion("goods_delete <>", value, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteGreaterThan(Integer value) {
            addCriterion("goods_delete >", value, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_delete >=", value, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteLessThan(Integer value) {
            addCriterion("goods_delete <", value, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("goods_delete <=", value, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteIn(List<Integer> values) {
            addCriterion("goods_delete in", values, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteNotIn(List<Integer> values) {
            addCriterion("goods_delete not in", values, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("goods_delete between", value1, value2, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_delete not between", value1, value2, "goodsDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNull() {
            addCriterion("goods_info is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIsNotNull() {
            addCriterion("goods_info is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoEqualTo(String value) {
            addCriterion("goods_info =", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotEqualTo(String value) {
            addCriterion("goods_info <>", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThan(String value) {
            addCriterion("goods_info >", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_info >=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThan(String value) {
            addCriterion("goods_info <", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLessThanOrEqualTo(String value) {
            addCriterion("goods_info <=", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoLike(String value) {
            addCriterion("goods_info like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotLike(String value) {
            addCriterion("goods_info not like", value, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIn(List<String> values) {
            addCriterion("goods_info in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotIn(List<String> values) {
            addCriterion("goods_info not in", values, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoBetween(String value1, String value2) {
            addCriterion("goods_info between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoNotBetween(String value1, String value2) {
            addCriterion("goods_info not between", value1, value2, "goodsInfo");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcIsNull() {
            addCriterion("goods_src is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcIsNotNull() {
            addCriterion("goods_src is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcEqualTo(String value) {
            addCriterion("goods_src =", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcNotEqualTo(String value) {
            addCriterion("goods_src <>", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcGreaterThan(String value) {
            addCriterion("goods_src >", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcGreaterThanOrEqualTo(String value) {
            addCriterion("goods_src >=", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcLessThan(String value) {
            addCriterion("goods_src <", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcLessThanOrEqualTo(String value) {
            addCriterion("goods_src <=", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcLike(String value) {
            addCriterion("goods_src like", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcNotLike(String value) {
            addCriterion("goods_src not like", value, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcIn(List<String> values) {
            addCriterion("goods_src in", values, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcNotIn(List<String> values) {
            addCriterion("goods_src not in", values, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcBetween(String value1, String value2) {
            addCriterion("goods_src between", value1, value2, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andGoodsSrcNotBetween(String value1, String value2) {
            addCriterion("goods_src not between", value1, value2, "goodsSrc");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}