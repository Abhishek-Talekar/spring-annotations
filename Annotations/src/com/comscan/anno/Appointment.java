package com.comscan.anno;

import java.util.Date;

//no source code
public class Appointment {
	private Patient patient;
	private String appointmentNumber;
	private String doctorName;
	private Date date;

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Appointment [patient=" + patient + ", appointmentNumber=" + appointmentNumber + ", doctorName="
				+ doctorName + ", date=" + date + "]";
	}

}
