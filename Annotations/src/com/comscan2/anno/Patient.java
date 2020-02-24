package com.comscan2.anno;
//no source code
public class Patient {
	private Appointment appointment;
	private String patientName;
	private String patientNumber;
	private String patientAge;

	

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}



	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}



	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}



	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}



	@Override
	public String toString() {
		return "Patient [appointment=" + appointment + ", patientName=" + patientName + ", patientNumber="
				+ patientNumber + ", patientAge=" + patientAge + "]";
	}

}
