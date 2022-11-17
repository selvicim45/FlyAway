package org.simplilearn.dao;

import java.util.List;

import org.simplilearn.entities.Airlines;
import org.simplilearn.entities.FlightsList;
import org.simplilearn.entities.SourceDestination;
import org.simplilearn.entities.User;

public interface AdminDao {
	
	boolean insert(FlightsList f);
	boolean delete(int flightno);
	List<FlightsList> getAll();
	


	//Dao for Airlines.java class entities
	boolean insertAirLines(Airlines a);
	boolean deleteAirLines(int airlinesno);
	List<Airlines> getAllAirLines();
	
	
	//Dao for SouceDestination.java class entities
		boolean insertSourceDestination(SourceDestination sd);
		boolean deleteSourceDestination(int sdno);
		List<SourceDestination> getAllSourceDestination();
		
		//Dao for update password
		boolean updatePassword(User u);
}
