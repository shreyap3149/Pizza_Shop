package com.pizza.Pizza_Shop.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.time.LocalTime;

@Entity
@Table(name = "Employee")
public class Employee {
    private int employee_id;
    private String username;
    private String password;

    public Employee(int employee_id, String username, String password) {
        this.employee_id = employee_id;
        this.username = username;
        this.password = password;


        //hello is it wokring
        
       
    }
}

