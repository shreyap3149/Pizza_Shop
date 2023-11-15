package com.pizza.Pizza_Shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import java.sql.*;

@SpringBootApplication
public class PizzaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaShopApplication.class, args);
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:snowflake://UMB53692.us-east-1.snowflakecomputing.com/?warehouse=COMPUTE_WH&db=JSON_UBER_EATS&role=ACCOUNTADMIN&schema=PUBLIC&user=shriyugaglani&password=Sajish@2023");
			System.out.println("Connected");
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

}
