package com.scope.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/scope/anno/scope-beans.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext("com/scope/anno");
		ShoppingMall mall1 = context.getBean("shoppingMall", ShoppingMall.class);
		ShoppingMall mall2 = context.getBean("shoppingMall", ShoppingMall.class);
		System.out.println("Mall1==Mall2:?  " + (mall1 == mall2));
	}
}
