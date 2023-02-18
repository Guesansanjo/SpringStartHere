package com.example.sshex3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SshEx3Application {

	public static void main(String[] args) {

		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		Person person =
				context.getBean(Person.class);

		Parrot parrot =
				context.getBean(Parrot.class);

		System.out.println("Person'name : " + person.getName());
		System.out.println("Parrot' name : " + parrot.getName());
		System.out.println("Person's parrot : " + person.getParrot());

	}

}
