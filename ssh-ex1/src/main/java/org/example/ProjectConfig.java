package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    //Object instance in Spring context
    @Bean
    Parrot parrot() {

        var p = new Parrot();
        p.setName("Negger");//Set name parrot
        return p;
        //Spring adds to its context the Parrot instance returned by method
    }
}
