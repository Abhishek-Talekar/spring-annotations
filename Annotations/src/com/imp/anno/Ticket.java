package com.imp.anno;

//no source code
public class Ticket {
	private Passenger passenger;
	private String ticketNo;
	private String vehicle_no;

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	@Override
	public String toString() {
		return "Ticket [passenger=" + passenger + ", ticketNo=" + ticketNo + ", vehicle_no=" + vehicle_no + "]";
	}

}
