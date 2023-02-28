package com.example.ShoppingCart.Exception;

public class OrderItemNotFoundException extends RuntimeException{
    public OrderItemNotFoundException(String message)
    {
        super(message);
    }

}
