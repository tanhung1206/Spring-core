package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"javaconfig"})
public class AppConfig {

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public Customer customer(){
        return new Customer();
    }
}
