package com.comscan.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CSTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAppointment.class);
		Appointment appointment = context.getBean("appointment",Appointment.class);
		System.out.println(appointment);
	}
}
