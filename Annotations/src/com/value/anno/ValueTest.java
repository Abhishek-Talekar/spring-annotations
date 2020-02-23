package com.value.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/value/anno/value-beans.xml");
		FuelStation fuelStation = context.getBean("fuelStation",FuelStation.class);
		System.out.println(fuelStation);
		
//		ApplicationContext context = new AnnotationConfigApplicationContext("com/value/anno");
//		FuelStation fuelStation = context.getBean("fuelStation",FuelStation.class);
//		System.out.println(fuelStation);
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFuelStation.class);
//		FuelStation station = context.getBean("fuelStation",FuelStation.class);
//		System.out.println(station);
	}
}
