package com.ohgiraffers.orderservice.service;

import com.ohgiraffers.orderservice.aggregate.Order;
import com.ohgiraffers.orderservice.aggregate.OrderMenu;
import com.ohgiraffers.orderservice.dto.OrderDTO;
import com.ohgiraffers.orderservice.dto.OrderMenuDTO;
import com.ohgiraffers.orderservice.repository.OrderMapper;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service        // 얘를 달아줘야 컨트롤러에 의존성 주입이 가능해진다.
public class OrderServiceImpl implements OrderService {
    private OrderMapper orderMapper;        // Repository라고 써도 되지만 의미 부여를 위해 Mapper라고 적음

    @Autowired
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public List<OrderDTO> getOrderByUserId(int userId) {
        List<Order> orderList = orderMapper.selectOrderByUserId(userId);

        // ModelMapper 없이 Entity를 DTO로 만드는 방법
        List<OrderDTO> orderDTOList = orderToOrderDTO(orderList);
        return orderDTOList;
    }

    // ModelMapper 대신 Entity를 DTO로 만들어주는 사용자 정의 함수
    // 사실 완전 Entity는 아니고 Entity의 개념과 비슷한 클래스라고 하심
    private List<OrderDTO> orderToOrderDTO(List<Order> orderList) {
        List<OrderDTO> orderDTOList = new ArrayList<>();
        for (Order order : orderList) {
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setOrderDate(order.getOrderDate());
            orderDTO.setOrderTime(order.getOrderTime());

            List<OrderMenu> orderMenuList = order.getOrderMenus();
            List<OrderMenuDTO> orderMenuDTOList = new ArrayList<>();
            for (OrderMenu orderMenu : orderMenuList) {
                OrderMenuDTO orderMenuDTO = new OrderMenuDTO();
                orderMenuDTO.setOrderCode(orderMenu.getOrderCode());
                orderMenuDTO.setMenuCode(orderMenu.getMenuCode());
                orderMenuDTO.setOrderAmount(orderMenu.getOrderAmount());

                orderMenuDTOList.add(orderMenuDTO);
            }

            orderDTO.setOrderMenus(orderMenuDTOList);
            orderDTO.setTotalOrderPrice(order.getTotalOrderPrice());
            orderDTOList.add(orderDTO);
        }

        return orderDTOList;
    }
}
