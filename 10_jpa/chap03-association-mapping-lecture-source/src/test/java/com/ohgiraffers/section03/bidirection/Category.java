package com.ohgiraffers.section03.bidirection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Objects;

/* 필기: Join을 시키니까
*   1. 여기서 테이블 맹글었고
*   2. OneToMany 어노테이션으로 Join 종류 지정했고
*   3. JoinColumn 어노테이션으로 어떤 해당 테이블에서 뭐 기준으로 조인할지 지정했고
*   4. 어떤 테이블이랑 Join할지 타입으로(여기서는 리스트 안에) 지정했으니 끗! */


@Entity(name = "bidirection_category")
@Table(name = "tbl_category")
public class Category {
    @Id
    @Column(name ="category_code")
    private int categoryCode;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "ref_category_code")
    private Integer refCategoryCode;

    @OneToMany(mappedBy = "category")  //One to many 관계를 다루고 있으니 당연
    // 자식 테이블의 fk 컬럼 (부모 테이블에서는 당연히 자식 테이블을 알 수가 없으니)
    private List<Menu> menuList;

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    @Override
    public String toString() {
        return "CategoryAndMenu{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                ", menuList=" + menuList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category that = (Category) o;
        return categoryCode == that.categoryCode && Objects.equals(categoryName, that.categoryName)
                && Objects.equals(refCategoryCode, that.refCategoryCode) && Objects.equals(menuList,
                that.menuList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryCode, categoryName, refCategoryCode, menuList);
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

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Category(int categoryCode, String categoryName, Integer refCategoryCode, List<Menu> menuList) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
        this.menuList = menuList;
    }

    public Category() {
    }
}
