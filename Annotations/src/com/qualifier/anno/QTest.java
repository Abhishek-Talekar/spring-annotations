package com.qualifier.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qualifier/anno/quali-context.xml");
		Bicycle bicycle = context.getBean("bicycle", Bicycle.class);
		System.out.println(bicycle);
	}
}
