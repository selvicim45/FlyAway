package org.simplilearn.entities;

public class FlightsList {
	

	private int flightno;	
	private String source;
	private String destination;
	private String airlines;
	private String price;
	
    public FlightsList(int flightno, String source, String destination, String airlines, String price) {
		super();
		this.flightno = flightno;
		this.source = source;
		this.destination = destination;
		this.airlines = airlines;
		this.price = price;
	}
	
	public FlightsList() {
		
	}

	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
