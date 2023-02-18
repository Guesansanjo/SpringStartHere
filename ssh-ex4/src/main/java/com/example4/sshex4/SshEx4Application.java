package com.example4.sshex4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SshEx4Application {

	public static void main(String[] args) {

		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		Person p = context.getBean(Person.class);

		System.out.println("Person name : " + p.getName());
		System.out.println("Person parrot name : " + p.getParrot());

	}

}
