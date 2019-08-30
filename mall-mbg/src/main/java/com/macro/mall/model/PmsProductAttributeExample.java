package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class PmsProductAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductAttributeExample() {
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
            addCriterion("productAttributeId is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("productAttributeId is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("productAttributeId =", value, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("productAttributeId <>", value, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("productAttributeId >", value, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("productAttributeId >=", value, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("productAttributeId <", value, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("productAttributeId <=", value, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("productAttributeId in", values, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("productAttributeId not in", values, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("productAttributeId between", value1, value2, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("productAttributeId not between", value1, value2, "productAttributeId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdIsNull() {
            addCriterion("productAttributeCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdIsNotNull() {
            addCriterion("productAttributeCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdEqualTo(Long value) {
            addCriterion("productAttributeCategoryId =", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdNotEqualTo(Long value) {
            addCriterion("productAttributeCategoryId <>", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdGreaterThan(Long value) {
            addCriterion("productAttributeCategoryId >", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("productAttributeCategoryId >=", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdLessThan(Long value) {
            addCriterion("productAttributeCategoryId <", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("productAttributeCategoryId <=", value, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdIn(List<Long> values) {
            addCriterion("productAttributeCategoryId in", values, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdNotIn(List<Long> values) {
            addCriterion("productAttributeCategoryId not in", values, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdBetween(Long value1, Long value2) {
            addCriterion("productAttributeCategoryId between", value1, value2, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductAttributeCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("productAttributeCategoryId not between", value1, value2, "productAttributeCategoryId");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameIsNull() {
            addCriterion("productAttributeName is null");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameIsNotNull() {
            addCriterion("productAttributeName is not null");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameEqualTo(String value) {
            addCriterion("productAttributeName =", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameNotEqualTo(String value) {
            addCriterion("productAttributeName <>", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameGreaterThan(String value) {
            addCriterion("productAttributeName >", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("productAttributeName >=", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameLessThan(String value) {
            addCriterion("productAttributeName <", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("productAttributeName <=", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameLike(String value) {
            addCriterion("productAttributeName like", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameNotLike(String value) {
            addCriterion("productAttributeName not like", value, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameIn(List<String> values) {
            addCriterion("productAttributeName in", values, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameNotIn(List<String> values) {
            addCriterion("productAttributeName not in", values, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameBetween(String value1, String value2) {
            addCriterion("productAttributeName between", value1, value2, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andproductAttributeNameNotBetween(String value1, String value2) {
            addCriterion("productAttributeName not between", value1, value2, "productAttributeName");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIsNull() {
            addCriterion("selectType is null");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIsNotNull() {
            addCriterion("selectType is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTypeEqualTo(Integer value) {
            addCriterion("selectType =", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotEqualTo(Integer value) {
            addCriterion("selectType <>", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeGreaterThan(Integer value) {
            addCriterion("selectType >", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("selectType >=", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLessThan(Integer value) {
            addCriterion("selectType <", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("selectType <=", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIn(List<Integer> values) {
            addCriterion("selectType in", values, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotIn(List<Integer> values) {
            addCriterion("selectType not in", values, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeBetween(Integer value1, Integer value2) {
            addCriterion("selectType between", value1, value2, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("selectType not between", value1, value2, "selectType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNull() {
            addCriterion("inputType is null");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNotNull() {
            addCriterion("inputType is not null");
            return (Criteria) this;
        }

        public Criteria andInputTypeEqualTo(Integer value) {
            addCriterion("inputType =", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotEqualTo(Integer value) {
            addCriterion("inputType <>", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThan(Integer value) {
            addCriterion("inputType >", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("inputType >=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThan(Integer value) {
            addCriterion("inputType <", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThanOrEqualTo(Integer value) {
            addCriterion("inputType <=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIn(List<Integer> values) {
            addCriterion("inputType in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotIn(List<Integer> values) {
            addCriterion("inputType not in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeBetween(Integer value1, Integer value2) {
            addCriterion("inputType between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("inputType not between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputListIsNull() {
            addCriterion("input_list is null");
            return (Criteria) this;
        }

        public Criteria andInputListIsNotNull() {
            addCriterion("input_list is not null");
            return (Criteria) this;
        }

        public Criteria andInputListEqualTo(String value) {
            addCriterion("input_list =", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotEqualTo(String value) {
            addCriterion("input_list <>", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListGreaterThan(String value) {
            addCriterion("input_list >", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListGreaterThanOrEqualTo(String value) {
            addCriterion("input_list >=", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListLessThan(String value) {
            addCriterion("input_list <", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListLessThanOrEqualTo(String value) {
            addCriterion("input_list <=", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListLike(String value) {
            addCriterion("input_list like", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotLike(String value) {
            addCriterion("input_list not like", value, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListIn(List<String> values) {
            addCriterion("input_list in", values, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotIn(List<String> values) {
            addCriterion("input_list not in", values, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListBetween(String value1, String value2) {
            addCriterion("input_list between", value1, value2, "inputList");
            return (Criteria) this;
        }

        public Criteria andInputListNotBetween(String value1, String value2) {
            addCriterion("input_list not between", value1, value2, "inputList");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andFilterTypeIsNull() {
            addCriterion("filter_type is null");
            return (Criteria) this;
        }

        public Criteria andFilterTypeIsNotNull() {
            addCriterion("filter_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilterTypeEqualTo(Integer value) {
            addCriterion("filter_type =", value, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeNotEqualTo(Integer value) {
            addCriterion("filter_type <>", value, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeGreaterThan(Integer value) {
            addCriterion("filter_type >", value, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_type >=", value, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeLessThan(Integer value) {
            addCriterion("filter_type <", value, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeLessThanOrEqualTo(Integer value) {
            addCriterion("filter_type <=", value, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeIn(List<Integer> values) {
            addCriterion("filter_type in", values, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeNotIn(List<Integer> values) {
            addCriterion("filter_type not in", values, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeBetween(Integer value1, Integer value2) {
            addCriterion("filter_type between", value1, value2, "filterType");
            return (Criteria) this;
        }

        public Criteria andFilterTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_type not between", value1, value2, "filterType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeIsNull() {
            addCriterion("searchType is null");
            return (Criteria) this;
        }

        public Criteria andSearchTypeIsNotNull() {
            addCriterion("searchType is not null");
            return (Criteria) this;
        }

        public Criteria andSearchTypeEqualTo(Integer value) {
            addCriterion("searchType =", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeNotEqualTo(Integer value) {
            addCriterion("searchType <>", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeGreaterThan(Integer value) {
            addCriterion("searchType >", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("searchType >=", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeLessThan(Integer value) {
            addCriterion("searchType <", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeLessThanOrEqualTo(Integer value) {
            addCriterion("searchType <=", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeIn(List<Integer> values) {
            addCriterion("searchType in", values, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeNotIn(List<Integer> values) {
            addCriterion("searchType not in", values, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeBetween(Integer value1, Integer value2) {
            addCriterion("searchType between", value1, value2, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("searchType not between", value1, value2, "searchType");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusIsNull() {
            addCriterion("related_status is null");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusIsNotNull() {
            addCriterion("related_status is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusEqualTo(Integer value) {
            addCriterion("related_status =", value, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusNotEqualTo(Integer value) {
            addCriterion("related_status <>", value, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusGreaterThan(Integer value) {
            addCriterion("related_status >", value, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("related_status >=", value, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusLessThan(Integer value) {
            addCriterion("related_status <", value, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusLessThanOrEqualTo(Integer value) {
            addCriterion("related_status <=", value, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusIn(List<Integer> values) {
            addCriterion("related_status in", values, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusNotIn(List<Integer> values) {
            addCriterion("related_status not in", values, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusBetween(Integer value1, Integer value2) {
            addCriterion("related_status between", value1, value2, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andRelatedStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("related_status not between", value1, value2, "relatedStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusIsNull() {
            addCriterion("handAddStatus is null");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusIsNotNull() {
            addCriterion("handAddStatus is not null");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusEqualTo(Integer value) {
            addCriterion("handAddStatus =", value, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusNotEqualTo(Integer value) {
            addCriterion("handAddStatus <>", value, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusGreaterThan(Integer value) {
            addCriterion("handAddStatus >", value, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("handAddStatus >=", value, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusLessThan(Integer value) {
            addCriterion("handAddStatus <", value, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusLessThanOrEqualTo(Integer value) {
            addCriterion("handAddStatus <=", value, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusIn(List<Integer> values) {
            addCriterion("handAddStatus in", values, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusNotIn(List<Integer> values) {
            addCriterion("handAddStatus not in", values, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusBetween(Integer value1, Integer value2) {
            addCriterion("handAddStatus between", value1, value2, "handAddStatus");
            return (Criteria) this;
        }

        public Criteria andHandAddStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("handAddStatus not between", value1, value2, "handAddStatus");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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