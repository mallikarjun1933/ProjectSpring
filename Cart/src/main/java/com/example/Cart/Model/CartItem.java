package com.example.Cart.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="cart")
public class Cart
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String ItemName;
    private int Quantity;
    private double Price;
    private Cart OrderNo;
}
