package com.example.ShoppingCart.Service;

import com.example.ShoppingCart.Model.OrderItem;

import java.util.List;

public interface OrderService
{
    OrderItem AddOrderItem(OrderItem orderItem);
    OrderItem UpdateOrderItem(OrderItem orderItem,int id);
    void DeleteOrder(int id);
    OrderItem getOrderItem(int id);
    List<OrderItem> getAllOrderItem();
}
