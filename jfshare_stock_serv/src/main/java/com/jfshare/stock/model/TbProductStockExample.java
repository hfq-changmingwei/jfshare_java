package com.jfshare.stock.model;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class TbProductStockExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public TbProductStockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> createTimeCriteria;

        protected List<Criterion> lastUpdateTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            createTimeCriteria = new ArrayList<Criterion>();
            lastUpdateTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getCreateTimeCriteria() {
            return createTimeCriteria;
        }

        protected void addCreateTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            createTimeCriteria.add(new Criterion(condition, value, "com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler"));
            allCriteria = null;
        }

        protected void addCreateTimeCriterion(String condition, DateTime value1, DateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            createTimeCriteria.add(new Criterion(condition, value1, value2, "com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getLastUpdateTimeCriteria() {
            return lastUpdateTimeCriteria;
        }

        protected void addLastUpdateTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            lastUpdateTimeCriteria.add(new Criterion(condition, value, "com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler"));
            allCriteria = null;
        }

        protected void addLastUpdateTimeCriterion(String condition, DateTime value1, DateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            lastUpdateTimeCriteria.add(new Criterion(condition, value1, value2, "com.jfshare.mybatis.typehandler.JodaDateTime2TimestampTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || createTimeCriteria.size() > 0
                || lastUpdateTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(createTimeCriteria);
                allCriteria.addAll(lastUpdateTimeCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNull() {
            addCriterion("sku_num is null");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNotNull() {
            addCriterion("sku_num is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNumEqualTo(String value) {
            addCriterion("sku_num =", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotEqualTo(String value) {
            addCriterion("sku_num <>", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThan(String value) {
            addCriterion("sku_num >", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThanOrEqualTo(String value) {
            addCriterion("sku_num >=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThan(String value) {
            addCriterion("sku_num <", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThanOrEqualTo(String value) {
            addCriterion("sku_num <=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLike(String value) {
            addCriterion("sku_num like", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotLike(String value) {
            addCriterion("sku_num not like", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumIn(List<String> values) {
            addCriterion("sku_num in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotIn(List<String> values) {
            addCriterion("sku_num not in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumBetween(String value1, String value2) {
            addCriterion("sku_num between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotBetween(String value1, String value2) {
            addCriterion("sku_num not between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andActiveCountIsNull() {
            addCriterion("active_count is null");
            return (Criteria) this;
        }

        public Criteria andActiveCountIsNotNull() {
            addCriterion("active_count is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCountEqualTo(Integer value) {
            addCriterion("active_count =", value, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountNotEqualTo(Integer value) {
            addCriterion("active_count <>", value, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountGreaterThan(Integer value) {
            addCriterion("active_count >", value, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_count >=", value, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountLessThan(Integer value) {
            addCriterion("active_count <", value, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountLessThanOrEqualTo(Integer value) {
            addCriterion("active_count <=", value, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountIn(List<Integer> values) {
            addCriterion("active_count in", values, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountNotIn(List<Integer> values) {
            addCriterion("active_count not in", values, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountBetween(Integer value1, Integer value2) {
            addCriterion("active_count between", value1, value2, "activeCount");
            return (Criteria) this;
        }

        public Criteria andActiveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("active_count not between", value1, value2, "activeCount");
            return (Criteria) this;
        }

        public Criteria andLockCountIsNull() {
            addCriterion("lock_count is null");
            return (Criteria) this;
        }

        public Criteria andLockCountIsNotNull() {
            addCriterion("lock_count is not null");
            return (Criteria) this;
        }

        public Criteria andLockCountEqualTo(Integer value) {
            addCriterion("lock_count =", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountNotEqualTo(Integer value) {
            addCriterion("lock_count <>", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountGreaterThan(Integer value) {
            addCriterion("lock_count >", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_count >=", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountLessThan(Integer value) {
            addCriterion("lock_count <", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountLessThanOrEqualTo(Integer value) {
            addCriterion("lock_count <=", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountIn(List<Integer> values) {
            addCriterion("lock_count in", values, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountNotIn(List<Integer> values) {
            addCriterion("lock_count not in", values, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountBetween(Integer value1, Integer value2) {
            addCriterion("lock_count between", value1, value2, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_count not between", value1, value2, "lockCount");
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

        public Criteria andCreateTimeEqualTo(DateTime value) {
            addCreateTimeCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(DateTime value) {
            addCreateTimeCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(DateTime value) {
            addCreateTimeCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(DateTime value) {
            addCreateTimeCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(DateTime value) {
            addCreateTimeCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(DateTime value) {
            addCreateTimeCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<DateTime> values) {
            addCreateTimeCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<DateTime> values) {
            addCreateTimeCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(DateTime value1, DateTime value2) {
            addCreateTimeCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(DateTime value1, DateTime value2) {
            addCreateTimeCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(DateTime value) {
            addLastUpdateTimeCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(DateTime value) {
            addLastUpdateTimeCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(DateTime value) {
            addLastUpdateTimeCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(DateTime value) {
            addLastUpdateTimeCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(DateTime value) {
            addLastUpdateTimeCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(DateTime value) {
            addLastUpdateTimeCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<DateTime> values) {
            addLastUpdateTimeCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<DateTime> values) {
            addLastUpdateTimeCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(DateTime value1, DateTime value2) {
            addLastUpdateTimeCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(DateTime value1, DateTime value2) {
            addLastUpdateTimeCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIsNull() {
            addCriterion("last_update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIsNotNull() {
            addCriterion("last_update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdEqualTo(Integer value) {
            addCriterion("last_update_user_id =", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotEqualTo(Integer value) {
            addCriterion("last_update_user_id <>", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdGreaterThan(Integer value) {
            addCriterion("last_update_user_id >", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_update_user_id >=", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLessThan(Integer value) {
            addCriterion("last_update_user_id <", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_update_user_id <=", value, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdIn(List<Integer> values) {
            addCriterion("last_update_user_id in", values, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotIn(List<Integer> values) {
            addCriterion("last_update_user_id not in", values, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("last_update_user_id between", value1, value2, "lastUpdateUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_update_user_id not between", value1, value2, "lastUpdateUserId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_product_stock
     *
     * @mbggenerated do_not_delete_during_merge Mon Oct 19 21:52:45 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_product_stock
     *
     * @mbggenerated Mon Oct 19 21:52:45 CST 2015
     */
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