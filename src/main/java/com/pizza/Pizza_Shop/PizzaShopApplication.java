package com.pizza.Pizza_Shop;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.Pizza_Shop.controller.Employee.Employee;

@SpringBootApplication
@RestController

public class PizzaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaShopApplication.class, args);
	}

	public List<Employee> db = List.of(new Employee("1", "1232312", "143243242"));

	@GetMapping("/")
	public String hello(){
		return "HI";
	}


	@GetMapping("/employees")
	public List<Employee> home(){
		return db;
	

	}

	
}