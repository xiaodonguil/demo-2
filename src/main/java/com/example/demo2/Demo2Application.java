package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {
    System.out.println("main 入口");
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
    
}
