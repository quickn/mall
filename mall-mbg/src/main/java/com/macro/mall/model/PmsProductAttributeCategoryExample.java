package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class PmsProductAttributeCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductAttributeCategoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("productAttributeCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("productAttributeCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("productAttributeCategoryId =", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("productAttributeCategoryId <>", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("productAttributeCategoryId >", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("productAttributeCategoryId >=", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("productAttributeCategoryId <", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("productAttributeCategoryId <=", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("productAttributeCategoryId in", values, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("productAttributeCategoryId not in", values, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("productAttributeCategoryId between", value1, value2, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("productAttributeCategoryId not between", value1, value2, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameIsNull() {
            addCriterion("attributeCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameIsNotNull() {
            addCriterion("attributeCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameEqualTo(String value) {
            addCriterion("attributeCategoryName =", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameNotEqualTo(String value) {
            addCriterion("attributeCategoryName <>", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameGreaterThan(String value) {
            addCriterion("attributeCategoryName >", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("attributeCategoryName >=", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameLessThan(String value) {
            addCriterion("attributeCategoryName <", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("attributeCategoryName <=", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameLike(String value) {
            addCriterion("attributeCategoryName like", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameNotLike(String value) {
            addCriterion("attributeCategoryName not like", value, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameIn(List<String> values) {
            addCriterion("attributeCategoryName in", values, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameNotIn(List<String> values) {
            addCriterion("attributeCategoryName not in", values, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameBetween(String value1, String value2) {
            addCriterion("attributeCategoryName between", value1, value2, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andattributeCategoryNameNotBetween(String value1, String value2) {
            addCriterion("attributeCategoryName not between", value1, value2, "attributeCategoryName");
            return (Criteria) this;
        }

        public Criteria andAttributeCountIsNull() {
            addCriterion("attributeCount is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCountIsNotNull() {
            addCriterion("attributeCount is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCountEqualTo(Integer value) {
            addCriterion("attributeCount =", value, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountNotEqualTo(Integer value) {
            addCriterion("attributeCount <>", value, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountGreaterThan(Integer value) {
            addCriterion("attributeCount >", value, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("attributeCount >=", value, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountLessThan(Integer value) {
            addCriterion("attributeCount <", value, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountLessThanOrEqualTo(Integer value) {
            addCriterion("attributeCount <=", value, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountIn(List<Integer> values) {
            addCriterion("attributeCount in", values, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountNotIn(List<Integer> values) {
            addCriterion("attributeCount not in", values, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountBetween(Integer value1, Integer value2) {
            addCriterion("attributeCount between", value1, value2, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andAttributeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("attributeCount not between", value1, value2, "attributeCount");
            return (Criteria) this;
        }

        public Criteria andParamCountIsNull() {
            addCriterion("paramCount is null");
            return (Criteria) this;
        }

        public Criteria andParamCountIsNotNull() {
            addCriterion("paramCount is not null");
            return (Criteria) this;
        }

        public Criteria andParamCountEqualTo(Integer value) {
            addCriterion("paramCount =", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotEqualTo(Integer value) {
            addCriterion("paramCount <>", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountGreaterThan(Integer value) {
            addCriterion("paramCount >", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("paramCount >=", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountLessThan(Integer value) {
            addCriterion("paramCount <", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountLessThanOrEqualTo(Integer value) {
            addCriterion("paramCount <=", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountIn(List<Integer> values) {
            addCriterion("paramCount in", values, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotIn(List<Integer> values) {
            addCriterion("paramCount not in", values, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountBetween(Integer value1, Integer value2) {
            addCriterion("paramCount between", value1, value2, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotBetween(Integer value1, Integer value2) {
            addCriterion("paramCount not between", value1, value2, "paramCount");
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