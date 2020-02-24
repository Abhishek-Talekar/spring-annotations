package com.comscan2.anno;

import java.util.Date;
//no source code
public class Appointment {
	private String appointmentNumber;
	private Date appointmentDate;
	void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}
	void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentNumber=" + appointmentNumber + "]";
	}
}
