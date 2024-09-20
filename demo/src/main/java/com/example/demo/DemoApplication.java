package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Laptop;

@SpringBootApplication(scanBasePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		Laptop l = context.getBean(Laptop.class);
		a.show();

	}

}
