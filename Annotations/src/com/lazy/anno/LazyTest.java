package com.lazy.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/lazy/anno/lazy-beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigRocket.class);
	}
}
