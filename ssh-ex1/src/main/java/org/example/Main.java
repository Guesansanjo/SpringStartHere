package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Instance Spring context
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        //We send instance of the object as parameter  so Spring uses it
        Parrot p = context.getBean("miki",Parrot.class);
        System.out.println(p.getName());
        //If multiple @Bean same object specify which
        String s = context.getBean(String.class);
           System.out.println(s);

       Integer n = context.getBean(Integer.class);
        System.out.println(n);


    Cat c = context.getBean(Cat.class);
    System.out.println(c);
        System.out.println(c.getName());

    }
}