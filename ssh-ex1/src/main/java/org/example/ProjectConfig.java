package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    //Object instance in Spring context
    @Bean
    @Primary
    Parrot parrot1() {

        var p = new Parrot();
        p.setName("Negger");//Set name parrot
        return p;
        //Spring adds to its context the Parrot instance returned by method
    }
//If not parrot specified negger will be first
    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
    @Bean("miki") //Set name of the bean to instanciate in main
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    //Spring context add instances we expect Spring to manage

Cat cat(){
        var p = new Cat();
        p.setName("Bigototo");
        return p;
    }
}
