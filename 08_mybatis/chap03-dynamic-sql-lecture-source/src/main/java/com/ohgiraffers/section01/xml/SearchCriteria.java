package com.ohgiraffers.section01.xml;

public class SearchCriteria {
    public String condition;
    public String value;

    public SearchCriteria(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }

    public SearchCriteria() {

    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
