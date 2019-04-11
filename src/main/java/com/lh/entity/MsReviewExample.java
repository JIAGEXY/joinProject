package com.lh.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsReviewExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public MsReviewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
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
     * This method corresponds to the database table ms_review
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
     * This method corresponds to the database table ms_review
     *
     * @mbggenerated Thu Apr 11 19:30:00 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_review
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
     * This class corresponds to the database table ms_review
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

        public Criteria andReviewidIsNull() {
            addCriterion("reviewId is null");
            return (Criteria) this;
        }

        public Criteria andReviewidIsNotNull() {
            addCriterion("reviewId is not null");
            return (Criteria) this;
        }

        public Criteria andReviewidEqualTo(Long value) {
            addCriterion("reviewId =", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotEqualTo(Long value) {
            addCriterion("reviewId <>", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThan(Long value) {
            addCriterion("reviewId >", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewId >=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThan(Long value) {
            addCriterion("reviewId <", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThanOrEqualTo(Long value) {
            addCriterion("reviewId <=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidIn(List<Long> values) {
            addCriterion("reviewId in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotIn(List<Long> values) {
            addCriterion("reviewId not in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidBetween(Long value1, Long value2) {
            addCriterion("reviewId between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotBetween(Long value1, Long value2) {
            addCriterion("reviewId not between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNull() {
            addCriterion("likeNum is null");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNotNull() {
            addCriterion("likeNum is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumEqualTo(Integer value) {
            addCriterion("likeNum =", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotEqualTo(Integer value) {
            addCriterion("likeNum <>", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThan(Integer value) {
            addCriterion("likeNum >", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeNum >=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThan(Integer value) {
            addCriterion("likeNum <", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("likeNum <=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumIn(List<Integer> values) {
            addCriterion("likeNum in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotIn(List<Integer> values) {
            addCriterion("likeNum not in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumBetween(Integer value1, Integer value2) {
            addCriterion("likeNum between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("likeNum not between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumIsNull() {
            addCriterion("unLikeNum is null");
            return (Criteria) this;
        }

        public Criteria andUnlikenumIsNotNull() {
            addCriterion("unLikeNum is not null");
            return (Criteria) this;
        }

        public Criteria andUnlikenumEqualTo(Integer value) {
            addCriterion("unLikeNum =", value, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumNotEqualTo(Integer value) {
            addCriterion("unLikeNum <>", value, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumGreaterThan(Integer value) {
            addCriterion("unLikeNum >", value, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unLikeNum >=", value, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumLessThan(Integer value) {
            addCriterion("unLikeNum <", value, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumLessThanOrEqualTo(Integer value) {
            addCriterion("unLikeNum <=", value, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumIn(List<Integer> values) {
            addCriterion("unLikeNum in", values, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumNotIn(List<Integer> values) {
            addCriterion("unLikeNum not in", values, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumBetween(Integer value1, Integer value2) {
            addCriterion("unLikeNum between", value1, value2, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUnlikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("unLikeNum not between", value1, value2, "unlikenum");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andArtidIsNull() {
            addCriterion("artId is null");
            return (Criteria) this;
        }

        public Criteria andArtidIsNotNull() {
            addCriterion("artId is not null");
            return (Criteria) this;
        }

        public Criteria andArtidEqualTo(Long value) {
            addCriterion("artId =", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotEqualTo(Long value) {
            addCriterion("artId <>", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidGreaterThan(Long value) {
            addCriterion("artId >", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidGreaterThanOrEqualTo(Long value) {
            addCriterion("artId >=", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidLessThan(Long value) {
            addCriterion("artId <", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidLessThanOrEqualTo(Long value) {
            addCriterion("artId <=", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidIn(List<Long> values) {
            addCriterion("artId in", values, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotIn(List<Long> values) {
            addCriterion("artId not in", values, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidBetween(Long value1, Long value2) {
            addCriterion("artId between", value1, value2, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotBetween(Long value1, Long value2) {
            addCriterion("artId not between", value1, value2, "artid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_review
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
     * This class corresponds to the database table ms_review
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