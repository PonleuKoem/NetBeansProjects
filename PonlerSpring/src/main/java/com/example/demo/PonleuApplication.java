package com.example.demo;

import com.example.demo.shape.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PonleuApplication {

	public static void main(String[] args) {
		          ApplicationContext context= SpringApplication.run(PonleuApplication.class, args);
                          Drawing d= context.getBean("drawing",Drawing.class);
                          d.drawShape();
//                          d= context.getBean("drec",Drawing.class);
//                          d.drawShape();
//                          d= context.getBean("dtri",Drawing.class);
//                          d.drawShape();
//                          d= context.getBean("test",Drawing.class);
//                          d.drawShape();
	}
}
