package com.example.demo;

import com.example.demo.person.Personservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KpsApplication {

	public static void main(String[] args) {
		    ApplicationContext context= SpringApplication.run(KpsApplication.class, args);
                    Personservice p= context.getBean("persert",Personservice.class);
                    p.personSay();
                    p= context.getBean("perserp",Personservice.class);
                    p.personSay();
//                    Personservice ps=context.getBean("personservice",Personservice.class);
//                    ps.personSay();
	}
}
