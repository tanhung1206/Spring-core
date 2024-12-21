package javaconfig;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    public Customer() {
        System.out.println("Default Constructor Customer..........");
    }

    @PostConstruct
    public void customInit(){
        System.out.println("Custom init........");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("Custom destroy......");
    }
}
