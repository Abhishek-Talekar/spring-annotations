package com.propertysource.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProTest {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext("com.propertysource.anno");
//		ComputerShop shop = context.getBean("computerShop",ComputerShop.class);
//		System.out.println(shop);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigComputerShop.class);
		ComputerShop computerShop = context.getBean("computerShop",ComputerShop.class);
		System.out.println(computerShop);
					
	}
}
