package com.req.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqTest {
	public static void main(String[] args) {
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/req/annotation/req-context.xml"));
//		BeanPostProcessor bpp = beanFactory.getBean("rbpp",BeanPostProcessor.class);
//		
//		((ConfigurableListableBeanFactory)beanFactory).addBeanPostProcessor(bpp);
//		Rocket rocket = beanFactory.getBean("rocket", Rocket.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/req/annotation/req-context.xml");
		
		Rocket rocket = context.getBean("rocket",Rocket.class);
		
		System.out.println(rocket);
	}
}
