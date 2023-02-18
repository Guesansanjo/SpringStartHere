package com.example.sshex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    /*
    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Test");
        return p;
    }

    @Bean
    public Person person(){

        Person p = new Person();
        p.setName("Andres");
        p.setParrot(parrot());
        //setting reference parrot bean to person's parrot attr
        return p;
    }
*/

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Hi");
        return p;
    }

    @Bean
    public Person person(Parrot parrot){
        Person person = new Person();
        person.setName("Misty");
        person.setParrot(parrot);
        return person;
    }
}
