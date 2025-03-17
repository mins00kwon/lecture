package com.ohgiraffers.section01.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity(name = "category_section01")
@Table(name="tbl_category")
public class Category {

    @Id
    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "category_name")
    private String categoryName;

    /* 설명: Null 값이 들어갈 수 있는 엔티티의 필드는 참조자료형을 쓰자*/
    @Column(name = "ref_category_code")
    private Integer refCategoryCode;        // null 이 들어갈 가능성이 있는 필드는 '반드시' 래퍼 클래스로 작성

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return categoryCode == category.categoryCode && Objects.equals(categoryName, category.categoryName)
                && Objects.equals(refCategoryCode, category.refCategoryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryCode, categoryName, refCategoryCode);
    }

    public Category(int categoryCode, String categoryName, Integer refCategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
