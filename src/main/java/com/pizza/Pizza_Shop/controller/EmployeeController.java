//package com.pizza.Pizza_Shop.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RestController;
//import com.pizza.Pizza_Shop.model.Employee;
//import com.pizza.Pizza_Shop.model.CustomerOrder;
//
//@RestController
//public class EmployeeController {
//    @Autowired
//    private EmployeeRepository repository;
//    // Repository of all an employees order
//
//    @PostMapping("/employee/createorder")
//    public void createOrder(@RequestBody CustomerOrder order)
//        CustomerOrder obj = repository.save(order);
//
//
//}