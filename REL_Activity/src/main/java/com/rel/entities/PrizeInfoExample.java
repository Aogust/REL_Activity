package com.rel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrizeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizeInfoExample() {
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

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(Object value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(Object value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(Object value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(Object value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(Object value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(Object value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<Object> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<Object> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(Object value1, Object value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(Object value1, Object value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityUidIsNull() {
            addCriterion("activity_uid is null");
            return (Criteria) this;
        }

        public Criteria andActivityUidIsNotNull() {
            addCriterion("activity_uid is not null");
            return (Criteria) this;
        }

        public Criteria andActivityUidEqualTo(Object value) {
            addCriterion("activity_uid =", value, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidNotEqualTo(Object value) {
            addCriterion("activity_uid <>", value, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidGreaterThan(Object value) {
            addCriterion("activity_uid >", value, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidGreaterThanOrEqualTo(Object value) {
            addCriterion("activity_uid >=", value, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidLessThan(Object value) {
            addCriterion("activity_uid <", value, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidLessThanOrEqualTo(Object value) {
            addCriterion("activity_uid <=", value, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidIn(List<Object> values) {
            addCriterion("activity_uid in", values, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidNotIn(List<Object> values) {
            addCriterion("activity_uid not in", values, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidBetween(Object value1, Object value2) {
            addCriterion("activity_uid between", value1, value2, "activityUid");
            return (Criteria) this;
        }

        public Criteria andActivityUidNotBetween(Object value1, Object value2) {
            addCriterion("activity_uid not between", value1, value2, "activityUid");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(Object value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(Object value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(Object value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(Object value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(Object value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(Object value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<Object> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<Object> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(Object value1, Object value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(Object value1, Object value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeUidIsNull() {
            addCriterion("prize_uid is null");
            return (Criteria) this;
        }

        public Criteria andPrizeUidIsNotNull() {
            addCriterion("prize_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeUidEqualTo(Object value) {
            addCriterion("prize_uid =", value, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidNotEqualTo(Object value) {
            addCriterion("prize_uid <>", value, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidGreaterThan(Object value) {
            addCriterion("prize_uid >", value, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidGreaterThanOrEqualTo(Object value) {
            addCriterion("prize_uid >=", value, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidLessThan(Object value) {
            addCriterion("prize_uid <", value, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidLessThanOrEqualTo(Object value) {
            addCriterion("prize_uid <=", value, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidIn(List<Object> values) {
            addCriterion("prize_uid in", values, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidNotIn(List<Object> values) {
            addCriterion("prize_uid not in", values, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidBetween(Object value1, Object value2) {
            addCriterion("prize_uid between", value1, value2, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPrizeUidNotBetween(Object value1, Object value2) {
            addCriterion("prize_uid not between", value1, value2, "prizeUid");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(Object value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(Object value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(Object value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(Object value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(Object value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(Object value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<Object> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<Object> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(Object value1, Object value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(Object value1, Object value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNull() {
            addCriterion("prize_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNotNull() {
            addCriterion("prize_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountEqualTo(Integer value) {
            addCriterion("prize_amount =", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotEqualTo(Integer value) {
            addCriterion("prize_amount <>", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThan(Integer value) {
            addCriterion("prize_amount >", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_amount >=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThan(Integer value) {
            addCriterion("prize_amount <", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("prize_amount <=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIn(List<Integer> values) {
            addCriterion("prize_amount in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotIn(List<Integer> values) {
            addCriterion("prize_amount not in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountBetween(Integer value1, Integer value2) {
            addCriterion("prize_amount between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_amount not between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIsNull() {
            addCriterion("remain_amount is null");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIsNotNull() {
            addCriterion("remain_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainAmountEqualTo(Integer value) {
            addCriterion("remain_amount =", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotEqualTo(Integer value) {
            addCriterion("remain_amount <>", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountGreaterThan(Integer value) {
            addCriterion("remain_amount >", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain_amount >=", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountLessThan(Integer value) {
            addCriterion("remain_amount <", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountLessThanOrEqualTo(Integer value) {
            addCriterion("remain_amount <=", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIn(List<Integer> values) {
            addCriterion("remain_amount in", values, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotIn(List<Integer> values) {
            addCriterion("remain_amount not in", values, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountBetween(Integer value1, Integer value2) {
            addCriterion("remain_amount between", value1, value2, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("remain_amount not between", value1, value2, "remainAmount");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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