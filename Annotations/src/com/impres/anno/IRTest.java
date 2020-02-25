package com.impres.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IRTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Parcel parcel = context.getBean("parcel",Parcel.class);
		System.out.println(parcel);
	}
}
