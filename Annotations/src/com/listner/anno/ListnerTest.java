package com.listner.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ListnerTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com/listner/anno");
		AddCityService service = context.getBean("addCityService",AddCityService.class);
		service.insertCity("Cities", "Hyd");
	}
}
