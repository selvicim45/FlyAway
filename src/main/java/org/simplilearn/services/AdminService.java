package org.simplilearn.services;


import java.util.List;

import org.simplilearn.entities.Airlines;
import org.simplilearn.entities.FlightsList;
import org.simplilearn.entities.SourceDestination;
import org.simplilearn.entities.User;

public interface AdminService {
	//FlightList.java class entities
	boolean insertFlights(FlightsList f);
	List<FlightsList> getflights();
	boolean deleteFlights(int flightno);
	
	//For Airlines.java class  entities
	boolean insertAirlines(Airlines a);
	List<Airlines> getAirlines();
	boolean deleteAirlines(int airlineno);


    //ForSourceDestination.java class  entities
	boolean insertSourceDestination(SourceDestination sd);
	List<SourceDestination> getSourceDestination();
	boolean deleteSourceDestination(int sdno);
	
	
	//For User admin password update
	boolean updateAdminPassword(User u);
	}