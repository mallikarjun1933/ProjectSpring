package com.example.ShoppingCart.Controller;

import com.example.ShoppingCart.Model.OrderItem;
import com.example.ShoppingCart.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v3")
public class OrderItemController
{
    @Autowired
private OrderService orderService;
    @PostMapping("/order_item")
    public ResponseEntity<OrderItem> AddOrderItem(@RequestBody OrderItem orderItem)
    {
     return new ResponseEntity<OrderItem>(orderService.AddOrderItem(orderItem), HttpStatus.CREATED);
    }

    @PutMapping("/order_item/{id}")
    public ResponseEntity<OrderItem> UpdateOrderItem(@PathVariable("id") int id, @RequestBody OrderItem orderItem)
    {
     return ResponseEntity.ok(orderService.UpdateOrderItem(orderItem,id));
    }

    @DeleteMapping("/order_item/{id}")
    public ResponseEntity<OrderItem> DeleteOrder(@PathVariable("id") int id)
    {
        orderService.DeleteOrder(id);
        return new ResponseEntity("",HttpStatus.NO_CONTENT);
    }
    @GetMapping("/order_item/{id}")
    public ResponseEntity<OrderItem> getItem(@PathVariable("id") int id){
        return ResponseEntity.ok().body(orderService.getOrderItem(id));
    }
    @GetMapping("/order_item")
    public List<OrderItem> getItems()
    {
        return orderService.getAllOrderItem();
    }

}
