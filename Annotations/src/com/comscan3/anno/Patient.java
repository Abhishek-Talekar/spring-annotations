package com.comscan3.anno;

//no source code
public class Patient {
	private String patientName;

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + "]";
	}

}
