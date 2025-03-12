package com.ohgiraffers.section01.xmlmapper;

import java.util.Objects;

public class CategoryDTO {
    private int categoryCode;
    private String categoryName;
    private int refCategoryCode;

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategoryDTO that = (CategoryDTO) o;
        return categoryCode == that.categoryCode && refCategoryCode == that.refCategoryCode && Objects.equals(
                categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryCode, categoryName, refCategoryCode);
    }

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

    public int getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(int refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    public CategoryDTO(int categoryCode, String categoryName, int refCategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
    }

    public CategoryDTO() {
    }
}
