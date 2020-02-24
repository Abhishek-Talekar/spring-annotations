package com.comscan3.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CS3Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Appointment appointment =context.getBean("appointment",Appointment.class);
		System.out.println(appointment);
	}
}
