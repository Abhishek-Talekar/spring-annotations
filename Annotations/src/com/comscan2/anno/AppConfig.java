package com.comscan2.anno;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:/com/comscan2/anno/appointment.properties" ,"classpath:/com/comscan2/anno/patient.properties"})
public class AppConfig {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	@Autowired
	private Environment env;
	
	@Bean(autowire = Autowire.BY_NAME)
	public Patient patient() {
		Patient patient = new Patient();
		patient.setPatientName(env.getProperty("patientName"));
		patient.setPatientNumber(env.getProperty("patientNumber"));
		patient.setPatientAge(env.getProperty("patientAge"));
		return patient;
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public Appointment appointment() throws ParseException {
		Appointment appointment = new Appointment();
		appointment.setAppointmentNumber(env.getProperty("appointmentNumber"));
		appointment.setAppointmentDate(sdf.parse(env.getProperty("appointmentDate")));
		return appointment;
	}
}
