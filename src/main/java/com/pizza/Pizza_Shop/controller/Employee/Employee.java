package com.pizza.Pizza_Shop.controller.Employee;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;

import com.pizza.Pizza_Shop.PizzaShopApplication;


public class Employee {
    private String id;
    private String email;
    private String password;

    public Employee(String id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String toString(){
        return "Employee{" + "id= " + id + ", email= " + email + ", password= " + password;
    }

    
}
