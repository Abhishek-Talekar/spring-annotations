package com.lookup.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.lookup.anno");
		Launcher launcher = context.getBean("launcher",Launcher.class);
		launcher.launch();
	}
}
