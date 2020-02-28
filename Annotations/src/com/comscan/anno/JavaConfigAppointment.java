package com.comscan.anno;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com/comscan/anno")
@PropertySource("classpath:com/comscan/anno/application.properties")
public class JavaConfigAppointment {

	@Resource
	private Environment env;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	@Bean(autowire = Autowire.BY_TYPE)
	public Appointment appointment() throws ParseException {
		Appointment appointment = new Appointment();
		appointment.setAppointmentNumber(env.getProperty("appointmentNumber"));
		appointment.setDoctorName(env.getProperty("doctorName"));
		appointment.setDate(sdf.parse(env.getProperty("date")));
		return appointment;
	}
}
