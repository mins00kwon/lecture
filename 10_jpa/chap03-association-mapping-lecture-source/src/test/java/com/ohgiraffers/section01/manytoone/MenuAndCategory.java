package com.ohgiraffers.section01.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity(name="menu_and_category")
@Table(name = "tbl_menu")
public class MenuAndCategory {

    @Id
    @Column(name="menu_code")
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @ManyToOne(fetch = FetchType.LAZY)      // 이걸 붙이면 Menu만 조회도 가능
    @JoinColumn(name="category_code")       // FK 제약조건이 있는 컬럼명(자식테이블에 있는 컬럼명만 쓴다.)
    Category category;

    @Column(name = "orderable_status")
    private String orderableStatus;

    @Override
    public String toString() {
        return "MenuAndCategory{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
//                ", category=" + category +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MenuAndCategory that = (MenuAndCategory) o;
        return menuCode == that.menuCode && menuPrice == that.menuPrice && Objects.equals(menuName, that.menuName)
                && Objects.equals(category, that.category) && Objects.equals(orderableStatus,
                that.orderableStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuCode, menuName, menuPrice, category, orderableStatus);
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public MenuAndCategory() {
    }

    public MenuAndCategory(int menuCode, String menuName, int menuPrice, Category category, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public Category getCategory() {
        return category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }
}
