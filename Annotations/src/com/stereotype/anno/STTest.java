package com.stereotype.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class STTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/anno/st-type.xml");
		RocketComp comp = context.getBean("rocketComp",RocketComp.class);
		System.out.println(comp);
	}
}
