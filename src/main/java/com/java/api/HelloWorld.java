package com.java.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.java.*")
public class HelloWorld {
	public static void main(String[] args) {
	    SpringApplication.run(HelloWorld.class, args);
	    System.out.println("hi");
	    }
}
