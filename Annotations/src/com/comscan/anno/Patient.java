package com.comscan.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com\\comscan\\anno\\patient.properties")
public class Patient {
	@Value("${patientName}")
	private String patientName;
	
	@Value("${patientNumber}")
	private String patientNumber;

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientNumber=" + patientNumber + "]";
	}

}
