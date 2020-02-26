package com.profile.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		((ConfigurableApplicationContext) context).getEnvironment().setActiveProfiles("test");
		((AnnotationConfigApplicationContext)context).register(AppConfig.class);
		((ConfigurableApplicationContext)context).refresh();
		Branch branch = context.getBean("branch",Branch.class);
		System.out.println(branch);
	}

}
