package com.ol.entity.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExamStuVO extends ExamStu{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamStuVO() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andExamStuIdIsNull() {
            addCriterion("exam_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andExamStuIdIsNotNull() {
            addCriterion("exam_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuIdEqualTo(Integer value) {
            addCriterion("exam_stu_id =", value, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdNotEqualTo(Integer value) {
            addCriterion("exam_stu_id <>", value, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdGreaterThan(Integer value) {
            addCriterion("exam_stu_id >", value, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_stu_id >=", value, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdLessThan(Integer value) {
            addCriterion("exam_stu_id <", value, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_stu_id <=", value, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdIn(List<Integer> values) {
            addCriterion("exam_stu_id in", values, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdNotIn(List<Integer> values) {
            addCriterion("exam_stu_id not in", values, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_stu_id between", value1, value2, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_stu_id not between", value1, value2, "examStuId");
            return (Criteria) this;
        }

        public Criteria andExamStuNameIsNull() {
            addCriterion("exam_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andExamStuNameIsNotNull() {
            addCriterion("exam_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuNameEqualTo(String value) {
            addCriterion("exam_stu_name =", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameNotEqualTo(String value) {
            addCriterion("exam_stu_name <>", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameGreaterThan(String value) {
            addCriterion("exam_stu_name >", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_stu_name >=", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameLessThan(String value) {
            addCriterion("exam_stu_name <", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameLessThanOrEqualTo(String value) {
            addCriterion("exam_stu_name <=", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameLike(String value) {
            addCriterion("exam_stu_name like", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameNotLike(String value) {
            addCriterion("exam_stu_name not like", value, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameIn(List<String> values) {
            addCriterion("exam_stu_name in", values, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameNotIn(List<String> values) {
            addCriterion("exam_stu_name not in", values, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameBetween(String value1, String value2) {
            addCriterion("exam_stu_name between", value1, value2, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNameNotBetween(String value1, String value2) {
            addCriterion("exam_stu_name not between", value1, value2, "examStuName");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberIsNull() {
            addCriterion("exam_stu_number is null");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberIsNotNull() {
            addCriterion("exam_stu_number is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberEqualTo(String value) {
            addCriterion("exam_stu_number =", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberNotEqualTo(String value) {
            addCriterion("exam_stu_number <>", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberGreaterThan(String value) {
            addCriterion("exam_stu_number >", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("exam_stu_number >=", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberLessThan(String value) {
            addCriterion("exam_stu_number <", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberLessThanOrEqualTo(String value) {
            addCriterion("exam_stu_number <=", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberLike(String value) {
            addCriterion("exam_stu_number like", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberNotLike(String value) {
            addCriterion("exam_stu_number not like", value, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberIn(List<String> values) {
            addCriterion("exam_stu_number in", values, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberNotIn(List<String> values) {
            addCriterion("exam_stu_number not in", values, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberBetween(String value1, String value2) {
            addCriterion("exam_stu_number between", value1, value2, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuNumberNotBetween(String value1, String value2) {
            addCriterion("exam_stu_number not between", value1, value2, "examStuNumber");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordIsNull() {
            addCriterion("exam_stu_password is null");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordIsNotNull() {
            addCriterion("exam_stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordEqualTo(String value) {
            addCriterion("exam_stu_password =", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordNotEqualTo(String value) {
            addCriterion("exam_stu_password <>", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordGreaterThan(String value) {
            addCriterion("exam_stu_password >", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("exam_stu_password >=", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordLessThan(String value) {
            addCriterion("exam_stu_password <", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("exam_stu_password <=", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordLike(String value) {
            addCriterion("exam_stu_password like", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordNotLike(String value) {
            addCriterion("exam_stu_password not like", value, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordIn(List<String> values) {
            addCriterion("exam_stu_password in", values, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordNotIn(List<String> values) {
            addCriterion("exam_stu_password not in", values, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordBetween(String value1, String value2) {
            addCriterion("exam_stu_password between", value1, value2, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuPasswordNotBetween(String value1, String value2) {
            addCriterion("exam_stu_password not between", value1, value2, "examStuPassword");
            return (Criteria) this;
        }

        public Criteria andExamStuSexIsNull() {
            addCriterion("exam_stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andExamStuSexIsNotNull() {
            addCriterion("exam_stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuSexEqualTo(String value) {
            addCriterion("exam_stu_sex =", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexNotEqualTo(String value) {
            addCriterion("exam_stu_sex <>", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexGreaterThan(String value) {
            addCriterion("exam_stu_sex >", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("exam_stu_sex >=", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexLessThan(String value) {
            addCriterion("exam_stu_sex <", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexLessThanOrEqualTo(String value) {
            addCriterion("exam_stu_sex <=", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexLike(String value) {
            addCriterion("exam_stu_sex like", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexNotLike(String value) {
            addCriterion("exam_stu_sex not like", value, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexIn(List<String> values) {
            addCriterion("exam_stu_sex in", values, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexNotIn(List<String> values) {
            addCriterion("exam_stu_sex not in", values, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexBetween(String value1, String value2) {
            addCriterion("exam_stu_sex between", value1, value2, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuSexNotBetween(String value1, String value2) {
            addCriterion("exam_stu_sex not between", value1, value2, "examStuSex");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayIsNull() {
            addCriterion("exam_stu_birthday is null");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayIsNotNull() {
            addCriterion("exam_stu_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("exam_stu_birthday =", value, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("exam_stu_birthday <>", value, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("exam_stu_birthday >", value, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exam_stu_birthday >=", value, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("exam_stu_birthday <", value, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exam_stu_birthday <=", value, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("exam_stu_birthday in", values, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("exam_stu_birthday not in", values, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exam_stu_birthday between", value1, value2, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exam_stu_birthday not between", value1, value2, "examStuBirthday");
            return (Criteria) this;
        }

        public Criteria andExamStuTelIsNull() {
            addCriterion("exam_stu_tel is null");
            return (Criteria) this;
        }

        public Criteria andExamStuTelIsNotNull() {
            addCriterion("exam_stu_tel is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuTelEqualTo(String value) {
            addCriterion("exam_stu_tel =", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelNotEqualTo(String value) {
            addCriterion("exam_stu_tel <>", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelGreaterThan(String value) {
            addCriterion("exam_stu_tel >", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelGreaterThanOrEqualTo(String value) {
            addCriterion("exam_stu_tel >=", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelLessThan(String value) {
            addCriterion("exam_stu_tel <", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelLessThanOrEqualTo(String value) {
            addCriterion("exam_stu_tel <=", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelLike(String value) {
            addCriterion("exam_stu_tel like", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelNotLike(String value) {
            addCriterion("exam_stu_tel not like", value, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelIn(List<String> values) {
            addCriterion("exam_stu_tel in", values, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelNotIn(List<String> values) {
            addCriterion("exam_stu_tel not in", values, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelBetween(String value1, String value2) {
            addCriterion("exam_stu_tel between", value1, value2, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuTelNotBetween(String value1, String value2) {
            addCriterion("exam_stu_tel not between", value1, value2, "examStuTel");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressIsNull() {
            addCriterion("exam_stu_address is null");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressIsNotNull() {
            addCriterion("exam_stu_address is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressEqualTo(String value) {
            addCriterion("exam_stu_address =", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressNotEqualTo(String value) {
            addCriterion("exam_stu_address <>", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressGreaterThan(String value) {
            addCriterion("exam_stu_address >", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("exam_stu_address >=", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressLessThan(String value) {
            addCriterion("exam_stu_address <", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressLessThanOrEqualTo(String value) {
            addCriterion("exam_stu_address <=", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressLike(String value) {
            addCriterion("exam_stu_address like", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressNotLike(String value) {
            addCriterion("exam_stu_address not like", value, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressIn(List<String> values) {
            addCriterion("exam_stu_address in", values, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressNotIn(List<String> values) {
            addCriterion("exam_stu_address not in", values, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressBetween(String value1, String value2) {
            addCriterion("exam_stu_address between", value1, value2, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuAddressNotBetween(String value1, String value2) {
            addCriterion("exam_stu_address not between", value1, value2, "examStuAddress");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneIsNull() {
            addCriterion("exam_stu_done is null");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneIsNotNull() {
            addCriterion("exam_stu_done is not null");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneEqualTo(Integer value) {
            addCriterion("exam_stu_done =", value, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneNotEqualTo(Integer value) {
            addCriterion("exam_stu_done <>", value, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneGreaterThan(Integer value) {
            addCriterion("exam_stu_done >", value, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_stu_done >=", value, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneLessThan(Integer value) {
            addCriterion("exam_stu_done <", value, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneLessThanOrEqualTo(Integer value) {
            addCriterion("exam_stu_done <=", value, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneIn(List<Integer> values) {
            addCriterion("exam_stu_done in", values, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneNotIn(List<Integer> values) {
            addCriterion("exam_stu_done not in", values, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneBetween(Integer value1, Integer value2) {
            addCriterion("exam_stu_done between", value1, value2, "examStuDone");
            return (Criteria) this;
        }

        public Criteria andExamStuDoneNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_stu_done not between", value1, value2, "examStuDone");
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