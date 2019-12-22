package cn.edu.njust.main.model;

import java.util.ArrayList;
import java.util.List;

public class SettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingExample() {
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

        public Criteria andTableNumberIsNull() {
            addCriterion("table_number is null");
            return (Criteria) this;
        }

        public Criteria andTableNumberIsNotNull() {
            addCriterion("table_number is not null");
            return (Criteria) this;
        }

        public Criteria andTableNumberEqualTo(Integer value) {
            addCriterion("table_number =", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotEqualTo(Integer value) {
            addCriterion("table_number <>", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberGreaterThan(Integer value) {
            addCriterion("table_number >", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_number >=", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberLessThan(Integer value) {
            addCriterion("table_number <", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberLessThanOrEqualTo(Integer value) {
            addCriterion("table_number <=", value, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberIn(List<Integer> values) {
            addCriterion("table_number in", values, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotIn(List<Integer> values) {
            addCriterion("table_number not in", values, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberBetween(Integer value1, Integer value2) {
            addCriterion("table_number between", value1, value2, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTableNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("table_number not between", value1, value2, "tableNumber");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeIsNull() {
            addCriterion("today_latest_reserve_time is null");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeIsNotNull() {
            addCriterion("today_latest_reserve_time is not null");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeEqualTo(Integer value) {
            addCriterion("today_latest_reserve_time =", value, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeNotEqualTo(Integer value) {
            addCriterion("today_latest_reserve_time <>", value, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeGreaterThan(Integer value) {
            addCriterion("today_latest_reserve_time >", value, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_latest_reserve_time >=", value, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeLessThan(Integer value) {
            addCriterion("today_latest_reserve_time <", value, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("today_latest_reserve_time <=", value, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeIn(List<Integer> values) {
            addCriterion("today_latest_reserve_time in", values, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeNotIn(List<Integer> values) {
            addCriterion("today_latest_reserve_time not in", values, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeBetween(Integer value1, Integer value2) {
            addCriterion("today_latest_reserve_time between", value1, value2, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andTodayLatestReserveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("today_latest_reserve_time not between", value1, value2, "todayLatestReserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveSpanIsNull() {
            addCriterion("reserve_span is null");
            return (Criteria) this;
        }

        public Criteria andReserveSpanIsNotNull() {
            addCriterion("reserve_span is not null");
            return (Criteria) this;
        }

        public Criteria andReserveSpanEqualTo(Integer value) {
            addCriterion("reserve_span =", value, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanNotEqualTo(Integer value) {
            addCriterion("reserve_span <>", value, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanGreaterThan(Integer value) {
            addCriterion("reserve_span >", value, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_span >=", value, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanLessThan(Integer value) {
            addCriterion("reserve_span <", value, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_span <=", value, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanIn(List<Integer> values) {
            addCriterion("reserve_span in", values, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanNotIn(List<Integer> values) {
            addCriterion("reserve_span not in", values, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanBetween(Integer value1, Integer value2) {
            addCriterion("reserve_span between", value1, value2, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andReserveSpanNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_span not between", value1, value2, "reserveSpan");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableIsNull() {
            addCriterion("person_per_table is null");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableIsNotNull() {
            addCriterion("person_per_table is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableEqualTo(Integer value) {
            addCriterion("person_per_table =", value, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableNotEqualTo(Integer value) {
            addCriterion("person_per_table <>", value, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableGreaterThan(Integer value) {
            addCriterion("person_per_table >", value, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_per_table >=", value, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableLessThan(Integer value) {
            addCriterion("person_per_table <", value, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableLessThanOrEqualTo(Integer value) {
            addCriterion("person_per_table <=", value, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableIn(List<Integer> values) {
            addCriterion("person_per_table in", values, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableNotIn(List<Integer> values) {
            addCriterion("person_per_table not in", values, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableBetween(Integer value1, Integer value2) {
            addCriterion("person_per_table between", value1, value2, "personPerTable");
            return (Criteria) this;
        }

        public Criteria andPersonPerTableNotBetween(Integer value1, Integer value2) {
            addCriterion("person_per_table not between", value1, value2, "personPerTable");
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