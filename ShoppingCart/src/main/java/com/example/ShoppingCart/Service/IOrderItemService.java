package com.example.ShoppingCart.Service;

import com.example.ShoppingCart.Exception.OrderItemNotFoundException;
import com.example.ShoppingCart.Model.OrderItem;
import com.example.ShoppingCart.Repository.OrderItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IOrderItemService implements OrderService
{
    @Autowired
    private OrderItemRepo orderItemRepo;

    @Override
    public OrderItem AddOrderItem(OrderItem orderItem)
    {
     return orderItemRepo.save(orderItem);
    }

    @Override
    public OrderItem UpdateOrderItem(OrderItem orderItem, int id) {
        OrderItem o1=orderItemRepo.findById(id).orElseThrow(()->
            new OrderItemNotFoundException("No such orderItem("+id+") found"));
        o1.setName(orderItem.getName());
        o1.setBrand(orderItem.getBrand());
        o1.setOrderNo(orderItem.getOrderNo());
        o1.setItemCode(orderItem.getItemCode());
        o1.setQuantity(orderItem.getQuantity());
        o1.setStorage(orderItem.getStorage());
        o1.setDisplayType(orderItem.getDisplayType());
        return orderItemRepo.save(o1);
    }

    @Override
    public void DeleteOrder(int id) {
        OrderItem emp=orderItemRepo.findById(id).orElseThrow(()->
                new OrderItemNotFoundException("No such Order("+id+")"));
        orderItemRepo.delete(emp);
    }

    @Override
    public OrderItem getOrderItem(int id) {
       return orderItemRepo.findById(id).orElseThrow(()->new OrderItemNotFoundException("No Such OrderItem("+id+" found"));
    }

    @Override
    public List<OrderItem> getAllOrderItem() {
            return orderItemRepo.findAll();
        }
    }
