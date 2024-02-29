package com.example.spring_unit_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class )
public class SpringUnitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUnitTestApplication.class, args);
    }

}
