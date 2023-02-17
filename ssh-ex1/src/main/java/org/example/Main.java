package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Instance Spring context
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        //We send instance of the object as parameter  so Spring uses it
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

    }
}