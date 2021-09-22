package com.august.cms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNull() {
            addCriterion("user_realname is null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNotNull() {
            addCriterion("user_realname is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameEqualTo(String value) {
            addCriterion("user_realname =", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotEqualTo(String value) {
            addCriterion("user_realname <>", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThan(String value) {
            addCriterion("user_realname >", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_realname >=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThan(String value) {
            addCriterion("user_realname <", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("user_realname <=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLike(String value) {
            addCriterion("user_realname like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotLike(String value) {
            addCriterion("user_realname not like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIn(List<String> values) {
            addCriterion("user_realname in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotIn(List<String> values) {
            addCriterion("user_realname not in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameBetween(String value1, String value2) {
            addCriterion("user_realname between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotBetween(String value1, String value2) {
            addCriterion("user_realname not between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatIsNull() {
            addCriterion("user_createdAt is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatIsNotNull() {
            addCriterion("user_createdAt is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatEqualTo(Date value) {
            addCriterion("user_createdAt =", value, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatNotEqualTo(Date value) {
            addCriterion("user_createdAt <>", value, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatGreaterThan(Date value) {
            addCriterion("user_createdAt >", value, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("user_createdAt >=", value, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatLessThan(Date value) {
            addCriterion("user_createdAt <", value, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatLessThanOrEqualTo(Date value) {
            addCriterion("user_createdAt <=", value, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatIn(List<Date> values) {
            addCriterion("user_createdAt in", values, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatNotIn(List<Date> values) {
            addCriterion("user_createdAt not in", values, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatBetween(Date value1, Date value2) {
            addCriterion("user_createdAt between", value1, value2, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserCreatedatNotBetween(Date value1, Date value2) {
            addCriterion("user_createdAt not between", value1, value2, "userCreatedat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatIsNull() {
            addCriterion("user_updateAt is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatIsNotNull() {
            addCriterion("user_updateAt is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatEqualTo(Date value) {
            addCriterion("user_updateAt =", value, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatNotEqualTo(Date value) {
            addCriterion("user_updateAt <>", value, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatGreaterThan(Date value) {
            addCriterion("user_updateAt >", value, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatGreaterThanOrEqualTo(Date value) {
            addCriterion("user_updateAt >=", value, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatLessThan(Date value) {
            addCriterion("user_updateAt <", value, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatLessThanOrEqualTo(Date value) {
            addCriterion("user_updateAt <=", value, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatIn(List<Date> values) {
            addCriterion("user_updateAt in", values, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatNotIn(List<Date> values) {
            addCriterion("user_updateAt not in", values, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatBetween(Date value1, Date value2) {
            addCriterion("user_updateAt between", value1, value2, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserUpdateatNotBetween(Date value1, Date value2) {
            addCriterion("user_updateAt not between", value1, value2, "userUpdateat");
            return (Criteria) this;
        }

        public Criteria andUserEnableIsNull() {
            addCriterion("user_enable is null");
            return (Criteria) this;
        }

        public Criteria andUserEnableIsNotNull() {
            addCriterion("user_enable is not null");
            return (Criteria) this;
        }

        public Criteria andUserEnableEqualTo(String value) {
            addCriterion("user_enable =", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableNotEqualTo(String value) {
            addCriterion("user_enable <>", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableGreaterThan(String value) {
            addCriterion("user_enable >", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableGreaterThanOrEqualTo(String value) {
            addCriterion("user_enable >=", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableLessThan(String value) {
            addCriterion("user_enable <", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableLessThanOrEqualTo(String value) {
            addCriterion("user_enable <=", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableLike(String value) {
            addCriterion("user_enable like", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableNotLike(String value) {
            addCriterion("user_enable not like", value, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableIn(List<String> values) {
            addCriterion("user_enable in", values, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableNotIn(List<String> values) {
            addCriterion("user_enable not in", values, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableBetween(String value1, String value2) {
            addCriterion("user_enable between", value1, value2, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserEnableNotBetween(String value1, String value2) {
            addCriterion("user_enable not between", value1, value2, "userEnable");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneIsNull() {
            addCriterion("user_cellphone is null");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneIsNotNull() {
            addCriterion("user_cellphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneEqualTo(Long value) {
            addCriterion("user_cellphone =", value, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneNotEqualTo(Long value) {
            addCriterion("user_cellphone <>", value, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneGreaterThan(Long value) {
            addCriterion("user_cellphone >", value, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("user_cellphone >=", value, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneLessThan(Long value) {
            addCriterion("user_cellphone <", value, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneLessThanOrEqualTo(Long value) {
            addCriterion("user_cellphone <=", value, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneIn(List<Long> values) {
            addCriterion("user_cellphone in", values, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneNotIn(List<Long> values) {
            addCriterion("user_cellphone not in", values, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneBetween(Long value1, Long value2) {
            addCriterion("user_cellphone between", value1, value2, "userCellphone");
            return (Criteria) this;
        }

        public Criteria andUserCellphoneNotBetween(Long value1, Long value2) {
            addCriterion("user_cellphone not between", value1, value2, "userCellphone");
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