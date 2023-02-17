package com.example2.sshex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class SshEx2Application {

	public static void main(String[] args) {

	var context =
			new AnnotationConfigApplicationContext(ProjectConfig.class);

	Parrot x = new Parrot(); //Instance Spring context
	x.setName("Kiki");

		Supplier<Parrot> parrotSupplier = () -> x; //Suplier return instance
		context.registerBean("parrot1",Parrot.class,parrotSupplier); //RegisteBean add instance to spring context

		Parrot p = context.getBean(Parrot.class);//Verify bean in context we refer to parrto bean and print
		System.out.println(p.getName());
	}

}
