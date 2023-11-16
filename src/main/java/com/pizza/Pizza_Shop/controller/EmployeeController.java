package com.pizza.Pizza_Shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pizza.Pizza_Shop.model.Employee;
import com.pizza.Pizza_Shop.repository.EmployeeRepo;
import com.pizza.Pizza_Shop.model.CustomerOrder;

@RestController
public class EmployeeController {
   @Autowired
   private EmployeeRepo EmployeeRepository;
   // Repository of all employees order

  // @PostMapping("/employee/createorder")
   public void createOrder(@RequestBody CustomerOrder order){
      // CustomerOrder obj = EmployeeRepository.save(order);

   }
}