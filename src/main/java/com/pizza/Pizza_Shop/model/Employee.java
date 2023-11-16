package com.pizza.Pizza_Shop.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private int employee_id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;

    public Employee(int employee_id, String username, String password) {
        this.employee_id = employee_id;
        this.username = username;
        this.password = password;


        //hello is it wokring
        
       
    }
}

