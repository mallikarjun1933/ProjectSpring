package com.example.ShoppingCart.Model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import  lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="orderItem")
public class OrderItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="order_no")
    @NotNull
    private int OrderNo;
    @Column(name="itemName")
    private String Name;
    @Column(name="itemCode")
    @NotNull
    private int ItemCode;
    @Column(name="quantity")
    @NotNull
    private int Quantity;
    @Column(name="brand")
    @NotNull
    private String Brand;
    @Column(name="storage")
    private String Storage;
    @Column
    private String DisplayType;
}
