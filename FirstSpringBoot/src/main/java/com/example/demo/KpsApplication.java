package com.example.demo;

import Person.PersonInfoMethod;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KpsApplication {

	public static void main(String[] args) {
		          ConfigurableApplicationContext context = SpringApplication.run(KpsApplication.class, args);
                          PersonInfoMethod d = context.getBean("personinfomethod", PersonInfoMethod.class);
                          d.drawPerson();
	}
}
