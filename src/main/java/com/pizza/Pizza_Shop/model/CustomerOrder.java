package com.pizza.Pizza_Shop.model;

import javax.persistence.*;
import java.util.Date;
import java.time.LocalTime;

@Entity
@Table(name="CustomerOrder")
@IdClass(CustomerOrderID.class)
public class CustomerOrder{
    @Id
    private long order_number;
    @Column(name="product_name")
    private String product_name;
    @Column(name="quantity")
    private int quantity;
    @Id
    private float total_price;
    @Id
    private Date dates;
    @Id
    private LocalTime time;


   public CustomerOrder(long order_number, String product_name, int quantity, float total_price, Date dates, LocalTime time){
       this.order_number = order_number;
       this.product_name = product_name;
       this.quantity = quantity;
       this.total_price = total_price;
       this.dates = dates;
       this.time = time;
   }
}