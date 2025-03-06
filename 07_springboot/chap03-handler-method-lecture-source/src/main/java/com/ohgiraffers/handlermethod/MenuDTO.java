package com.ohgiraffers.handlermethod;

public class MenuDTO {
    private String name;
    private int price;
    private String categoryCode;
    private String orderableStatus;

    @Override
    public String toString() {
        return "MenuDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode='" + categoryCode + '\'' +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }

    public MenuDTO() {
    }

    public MenuDTO(String name, int price, String categoryCode, String orderableStatus) {
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }
}
