package com.ohgiraffers.section01.xmlmapper;

import java.util.Objects;

public class MenuAndCategoryDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private CategoryDTO category;
    private String orderableStatus;

    @Override
    public String toString() {
        return "MenuAndCategoryDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + category +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MenuAndCategoryDTO that = (MenuAndCategoryDTO) o;
        return menuCode == that.menuCode && menuPrice == that.menuPrice && Objects.equals(menuName, that.menuName)
                && Objects.equals(category, that.category) && Objects.equals(orderableStatus,
                that.orderableStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuCode, menuName, menuPrice, category, orderableStatus);
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public MenuAndCategoryDTO(int menuCode, String menuName, int menuPrice, CategoryDTO categoryCode,
                              String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.category = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public MenuAndCategoryDTO() {
    }
}
