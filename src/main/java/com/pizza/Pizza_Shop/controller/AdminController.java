package com.pizza.Pizza_Shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import com.pizza.Pizza_Shop.model.Admin;
import com.pizza.Pizza_Shop.model.Employee;
//import com.pizza.Pizza_Shop.repository.OrdersByEmployeesRepo;

@RestController
public class AdminController {
   @Autowired
 //  private OrdersByEmployeesRepo repository;
   // Repo of all employees

   @PostMapping("/addEmployee")
   public void addEmployee(@RequestBody Employee employee) {
     //  Employee obj = repository.save(employee);

   }
}