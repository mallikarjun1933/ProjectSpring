package com.example.Cart.Repository;

import com.example.Cart.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepo extends JpaRepository<CartItem,Integer>
{
    List<CartItem> findByOrderNoOrderByItemName(String OrderNo);
}
