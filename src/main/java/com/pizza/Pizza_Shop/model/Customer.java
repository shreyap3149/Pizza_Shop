package com.pizza.Pizza_Shop.model;

import javax.persistence.*;

@Entity
@Table(name="Customer")
@IdClass(CustomerId.class)
public class Customer {

    @Id
    private String phone_number;
    @Id
    private String zipcode;
    @Column(name = "city")
    private String city;
    @Column(name="street_address")
    private String street_address;
    @Column(name="state")
    private String state;


    public Customer(){}

    public Customer(String phone_number,String street_address,String zipcode,String city,String state){
        this.phone_number = phone_number;
        this.street_address = street_address;
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
    }


}
