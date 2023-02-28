package com.example.ShoppingCart.Repository;

import com.example.ShoppingCart.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItem,Integer> {
}
