package com.dependson.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DOTest {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/dependson/anno/dependson-beans.xml");
//		PersonDao dao = context.getBean("personDao",PersonDao.class);

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigDependsOn.class);
		
	}
}
