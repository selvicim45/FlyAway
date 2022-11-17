package org.simplilearn.entities;

public class Airlines {
 private int airlineno;
 private String airlineName;
 

public Airlines() {
	// TODO Auto-generated constructor stub
}
public Airlines(int airlineno, String airlineName) {
	super();
	this.airlineno = airlineno;
	this.airlineName = airlineName;
}
public int getAirlineno() {
	return airlineno;
}
public void setAirlineno(int airlineno) {
	this.airlineno = airlineno;
}
public String getAirlineName() {
	return airlineName;
}
public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
}
 
 
}
