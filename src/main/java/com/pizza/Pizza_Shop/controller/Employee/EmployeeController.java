package com.pizza.Pizza_Shop.controller.Employee;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(path = "/employees")
public class EmployeeController {
    
    @GetMapping
    public List<Employee> getEmployees(){
        return List.of(
            new Employee(
                "1",
                "WBrown45@gmail.com",
                "123445"),
            new Employee(
                "2", 
                "MHowa45@gmail.com", 
                "Password")

            );
    }
}
