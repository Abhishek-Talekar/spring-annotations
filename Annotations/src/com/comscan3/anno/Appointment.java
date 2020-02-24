package com.comscan3.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//source availale
@Component
public class Appointment {
	@Autowired
	private Patient patient;

	@Value("${appointmentNumber}")
	private String appointmentNumber;

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	@Override
	public String toString() {
		return "Appointment [patient=" + patient + ", appointmentNumber=" + appointmentNumber + "]";
	}

}
