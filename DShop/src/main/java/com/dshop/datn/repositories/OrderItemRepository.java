package com.dshop.datn.repositories;

import com.dshop.datn.models.OrderItem;
import com.dshop.datn.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    OrderItem findByProductNameAndOrders(String productName, Orders checkOrders);
    long countByOrders(Orders orders);
    List<OrderItem> findByOrders(Orders orders);
}
