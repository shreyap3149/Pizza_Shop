package com.pizza.Pizza_Shop.repository;
import com.pizza.Pizza_Shop.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
