package com.ohgiraffers.section02.onetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity(name = "menu")
@Table(name = "tbl_menu")
public class Menu {
    @Id
    @Column(name = "menu_code")
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @Column(name="orderable_status")
    private String orderableStatus;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Menu menu = (Menu) o;
        return menuCode == menu.menuCode && menuPrice == menu.menuPrice && Objects.equals(menuName, menu.menuName)
                && Objects.equals(orderableStatus, menu.orderableStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuCode, menuName, menuPrice, orderableStatus);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
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

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public Menu(int menuCode, String menuName, int menuPrice, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.orderableStatus = orderableStatus;
    }

    public Menu() {
    }
}
