package com.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWTest {
	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/autowired/annotation/auto-beans.xml"));
//		BeanPostProcessor bpp = factory.getBean("aabp",BeanPostProcessor.class);
//		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp);
//		Radio radio = factory.getBean("radio",Radio.class);
//		System.out.println(radio);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowired/annotation/auto-beans.xml");
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);
	}
}
