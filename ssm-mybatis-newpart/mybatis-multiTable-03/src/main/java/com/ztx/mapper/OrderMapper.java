package com.ztx.mapper;

import com.ztx.pojo.Order;
import com.ztx.pojo.OrderWithCustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    List<Order> getOrdersByCustomerId(@Param("customerId") Integer id);

    List<OrderWithCustomer> selectAllOrdersWithCustomerId();

    int insertOrder(Order order);
}
