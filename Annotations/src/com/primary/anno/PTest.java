package com.primary.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PTest {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/primary/anno/primary-beans.xml");
//		ElectricityMeter electricityMeter = context.getBean("electricityMeter",ElectricityMeter.class);
//		System.out.println(electricityMeter);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigMeter.class);
		ElectricityMeter electricityMeter = context.getBean("electricityMeter",ElectricityMeter.class);
		System.out.println(electricityMeter);
	}
}
