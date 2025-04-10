package com.ohgiraffers.orderservice.vo;

import com.ohgiraffers.orderservice.dto.OrderMenuDTO;
import java.util.List;
import lombok.Data;

@Data
public class ResponseOrderVO {
    private String orderDate;
    private String orderTime;

    private List<OrderMenuDTO> orderMenus;
}
