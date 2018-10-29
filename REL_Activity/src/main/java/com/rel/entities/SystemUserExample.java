package com.rel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemUserExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIidIsNull() {
            addCriterion("IID is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("IID is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("IID =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("IID <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("IID >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IID >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("IID <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("IID <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("IID in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("IID not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("IID between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("IID not between", value1, value2, "iid");
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

        public Criteria andUserNameEqualTo(Object value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(Object value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(Object value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(Object value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(Object value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(Object value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<Object> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<Object> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(Object value1, Object value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(Object value1, Object value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(Object value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(Object value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(Object value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(Object value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(Object value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(Object value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<Object> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<Object> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(Object value1, Object value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(Object value1, Object value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Object value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Object value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Object value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Object value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Object value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Object value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Object> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Object> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Object value1, Object value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Object value1, Object value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameIsNull() {
            addCriterion("public_number_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameIsNotNull() {
            addCriterion("public_number_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameEqualTo(Object value) {
            addCriterion("public_number_name =", value, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameNotEqualTo(Object value) {
            addCriterion("public_number_name <>", value, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameGreaterThan(Object value) {
            addCriterion("public_number_name >", value, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameGreaterThanOrEqualTo(Object value) {
            addCriterion("public_number_name >=", value, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameLessThan(Object value) {
            addCriterion("public_number_name <", value, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameLessThanOrEqualTo(Object value) {
            addCriterion("public_number_name <=", value, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameIn(List<Object> values) {
            addCriterion("public_number_name in", values, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameNotIn(List<Object> values) {
            addCriterion("public_number_name not in", values, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameBetween(Object value1, Object value2) {
            addCriterion("public_number_name between", value1, value2, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andPublicNumberNameNotBetween(Object value1, Object value2) {
            addCriterion("public_number_name not between", value1, value2, "publicNumberName");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(Object value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(Object value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(Object value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(Object value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(Object value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(Object value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<Object> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<Object> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(Object value1, Object value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(Object value1, Object value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andContentPersonIsNull() {
            addCriterion("content_person is null");
            return (Criteria) this;
        }

        public Criteria andContentPersonIsNotNull() {
            addCriterion("content_person is not null");
            return (Criteria) this;
        }

        public Criteria andContentPersonEqualTo(Object value) {
            addCriterion("content_person =", value, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonNotEqualTo(Object value) {
            addCriterion("content_person <>", value, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonGreaterThan(Object value) {
            addCriterion("content_person >", value, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonGreaterThanOrEqualTo(Object value) {
            addCriterion("content_person >=", value, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonLessThan(Object value) {
            addCriterion("content_person <", value, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonLessThanOrEqualTo(Object value) {
            addCriterion("content_person <=", value, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonIn(List<Object> values) {
            addCriterion("content_person in", values, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonNotIn(List<Object> values) {
            addCriterion("content_person not in", values, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonBetween(Object value1, Object value2) {
            addCriterion("content_person between", value1, value2, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentPersonNotBetween(Object value1, Object value2) {
            addCriterion("content_person not between", value1, value2, "contentPerson");
            return (Criteria) this;
        }

        public Criteria andContentNumberIsNull() {
            addCriterion("content_number is null");
            return (Criteria) this;
        }

        public Criteria andContentNumberIsNotNull() {
            addCriterion("content_number is not null");
            return (Criteria) this;
        }

        public Criteria andContentNumberEqualTo(Integer value) {
            addCriterion("content_number =", value, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberNotEqualTo(Integer value) {
            addCriterion("content_number <>", value, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberGreaterThan(Integer value) {
            addCriterion("content_number >", value, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_number >=", value, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberLessThan(Integer value) {
            addCriterion("content_number <", value, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("content_number <=", value, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberIn(List<Integer> values) {
            addCriterion("content_number in", values, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberNotIn(List<Integer> values) {
            addCriterion("content_number not in", values, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberBetween(Integer value1, Integer value2) {
            addCriterion("content_number between", value1, value2, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andContentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("content_number not between", value1, value2, "contentNumber");
            return (Criteria) this;
        }

        public Criteria andKeyPathIsNull() {
            addCriterion("key_path is null");
            return (Criteria) this;
        }

        public Criteria andKeyPathIsNotNull() {
            addCriterion("key_path is not null");
            return (Criteria) this;
        }

        public Criteria andKeyPathEqualTo(Object value) {
            addCriterion("key_path =", value, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathNotEqualTo(Object value) {
            addCriterion("key_path <>", value, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathGreaterThan(Object value) {
            addCriterion("key_path >", value, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathGreaterThanOrEqualTo(Object value) {
            addCriterion("key_path >=", value, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathLessThan(Object value) {
            addCriterion("key_path <", value, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathLessThanOrEqualTo(Object value) {
            addCriterion("key_path <=", value, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathIn(List<Object> values) {
            addCriterion("key_path in", values, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathNotIn(List<Object> values) {
            addCriterion("key_path not in", values, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathBetween(Object value1, Object value2) {
            addCriterion("key_path between", value1, value2, "keyPath");
            return (Criteria) this;
        }

        public Criteria andKeyPathNotBetween(Object value1, Object value2) {
            addCriterion("key_path not between", value1, value2, "keyPath");
            return (Criteria) this;
        }

        public Criteria andIsRefreshIsNull() {
            addCriterion("is_refresh is null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshIsNotNull() {
            addCriterion("is_refresh is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshEqualTo(Integer value) {
            addCriterion("is_refresh =", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshNotEqualTo(Integer value) {
            addCriterion("is_refresh <>", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshGreaterThan(Integer value) {
            addCriterion("is_refresh >", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_refresh >=", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshLessThan(Integer value) {
            addCriterion("is_refresh <", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshLessThanOrEqualTo(Integer value) {
            addCriterion("is_refresh <=", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshIn(List<Integer> values) {
            addCriterion("is_refresh in", values, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshNotIn(List<Integer> values) {
            addCriterion("is_refresh not in", values, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshBetween(Integer value1, Integer value2) {
            addCriterion("is_refresh between", value1, value2, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshNotBetween(Integer value1, Integer value2) {
            addCriterion("is_refresh not between", value1, value2, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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