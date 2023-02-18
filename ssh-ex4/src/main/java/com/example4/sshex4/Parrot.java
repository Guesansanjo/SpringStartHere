package com.example4.sshex4;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Anable";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
