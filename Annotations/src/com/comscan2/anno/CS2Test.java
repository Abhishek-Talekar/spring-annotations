package com.comscan2.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CS2Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Patient patient = context.getBean("patient",Patient.class);
		System.out.println(patient);
	}
}
