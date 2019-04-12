package com.lh.entity;

import java.util.ArrayList;
import java.util.List;

public class MsSleeperExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public MsSleeperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
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
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
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

        public Criteria andSleeperidIsNull() {
            addCriterion("sleeperId is null");
            return (Criteria) this;
        }

        public Criteria andSleeperidIsNotNull() {
            addCriterion("sleeperId is not null");
            return (Criteria) this;
        }

        public Criteria andSleeperidEqualTo(Long value) {
            addCriterion("sleeperId =", value, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidNotEqualTo(Long value) {
            addCriterion("sleeperId <>", value, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidGreaterThan(Long value) {
            addCriterion("sleeperId >", value, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidGreaterThanOrEqualTo(Long value) {
            addCriterion("sleeperId >=", value, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidLessThan(Long value) {
            addCriterion("sleeperId <", value, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidLessThanOrEqualTo(Long value) {
            addCriterion("sleeperId <=", value, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidIn(List<Long> values) {
            addCriterion("sleeperId in", values, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidNotIn(List<Long> values) {
            addCriterion("sleeperId not in", values, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidBetween(Long value1, Long value2) {
            addCriterion("sleeperId between", value1, value2, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andSleeperidNotBetween(Long value1, Long value2) {
            addCriterion("sleeperId not between", value1, value2, "sleeperid");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardNo =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardNo <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardNo >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardNo >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardNo <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardNo <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardNo like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardNo not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardNo in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardNo not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardNo between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardNo not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLikecityIsNull() {
            addCriterion("likeCity is null");
            return (Criteria) this;
        }

        public Criteria andLikecityIsNotNull() {
            addCriterion("likeCity is not null");
            return (Criteria) this;
        }

        public Criteria andLikecityEqualTo(String value) {
            addCriterion("likeCity =", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityNotEqualTo(String value) {
            addCriterion("likeCity <>", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityGreaterThan(String value) {
            addCriterion("likeCity >", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityGreaterThanOrEqualTo(String value) {
            addCriterion("likeCity >=", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityLessThan(String value) {
            addCriterion("likeCity <", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityLessThanOrEqualTo(String value) {
            addCriterion("likeCity <=", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityLike(String value) {
            addCriterion("likeCity like", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityNotLike(String value) {
            addCriterion("likeCity not like", value, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityIn(List<String> values) {
            addCriterion("likeCity in", values, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityNotIn(List<String> values) {
            addCriterion("likeCity not in", values, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityBetween(String value1, String value2) {
            addCriterion("likeCity between", value1, value2, "likecity");
            return (Criteria) this;
        }

        public Criteria andLikecityNotBetween(String value1, String value2) {
            addCriterion("likeCity not between", value1, value2, "likecity");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_sleeper
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 11 19:30:00 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_sleeper
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
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