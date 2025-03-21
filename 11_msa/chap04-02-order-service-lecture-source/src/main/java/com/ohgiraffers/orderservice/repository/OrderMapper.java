package com.ohgiraffers.orderservice.repository;

import com.ohgiraffers.orderservice.aggregate.Order;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    List<Order> selectOrderByUserId(int userId);      // 기억상으로 얘는 원래 인터페이스였어.

}
