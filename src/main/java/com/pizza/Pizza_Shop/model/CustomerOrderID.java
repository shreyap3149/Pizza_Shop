package com.pizza.Pizza_Shop.model;

import java.io.Serializable;
import java.sql.*;

public class CustomerOrderID implements Serializable {
    private long order_number;
    private float total_price;
    private Date dates;
    private Timestamp time;

    public CustomerOrderID(long order_number,float total_price,Date dates, Timestamp time){
        this.order_number = order_number;
        this.total_price = total_price;
        this.dates = dates;
        this.time = time;
    }
}