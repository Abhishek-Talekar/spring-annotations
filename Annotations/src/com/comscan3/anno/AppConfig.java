package com.comscan3.anno;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:/com/comscan3/anno/app.properties",
		"classpath:/com/comscan3/anno/patient.properties" })
@ComponentScan(basePackages = "com.comscan3.anno")
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean(autowire = Autowire.BY_NAME)
	public Patient patient() {
		Patient patient = new Patient();
		patient.setPatientName(env.getProperty("patientName"));
		return patient;
	}
}
