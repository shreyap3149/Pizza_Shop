package com.pizza.Pizza_Shop.model;

import java.io.Serializable;

public class CustomerId implements Serializable {
    private String phone_number;

    private String zipcode;

    public CustomerId(String phone_number,String zipcode){
        this.phone_number = phone_number;
        this.zipcode = zipcode;
    }

    
}
