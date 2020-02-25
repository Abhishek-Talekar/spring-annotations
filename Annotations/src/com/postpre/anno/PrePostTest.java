package com.postpre.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrePostTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.postpre.anno");
		Calculator calculator = context.getBean("calculator", Calculator.class);
		
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
		
	}

}
