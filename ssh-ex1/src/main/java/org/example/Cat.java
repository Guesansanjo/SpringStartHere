package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


//Tells spring to add instance to context / stereotype anotation
@Component
public class Cat {

    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @PostConstruct
    public void init(){

        this.name = "Bigototo";
    }


}
