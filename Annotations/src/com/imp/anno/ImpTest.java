package com.imp.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImpTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootAppConfig.class);
		Ticket ticket = context.getBean("ticket",Ticket.class);
		System.out.println(ticket);
	}
}
