package com.example.eshop;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EshopApplication {

    public static void main(String[] args) { SpringApplication.run(EshopApplication.class, args);
    }

}
