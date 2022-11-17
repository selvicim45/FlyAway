package org.simplilearn.dao;

import java.util.List;

import org.simplilearn.entities.FlightsList;

public interface FlightsListDao {

	List<FlightsList> getAll(String source, String destination);
	List<FlightsList> getAll();
}
