package org.simplilearn.services;


import java.util.List;

import org.simplilearn.dao.AdminDao;
import org.simplilearn.dao.AdminDaoImpl;
import org.simplilearn.entities.Airlines;
import org.simplilearn.entities.FlightsList;
import org.simplilearn.entities.SourceDestination;
import org.simplilearn.entities.User;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao= new AdminDaoImpl(); 

	//FlightsList.java class
	public boolean insertFlights(FlightsList f) {
		return adminDao.insert(f);
		
	}


	@Override
	public List<FlightsList> getflights() {
		List<FlightsList> flights=adminDao.getAll();
		for(FlightsList f:flights)
		{
			System.out.println(f.getFlightno()+"\t"+f.getSource()+"\t"+f.getDestination()+"\t"+f.getAirlines()+"\t"+f.getPrice());
		}
		return adminDao.getAll();
	}


	
	//Airlines.java
	@Override
	public boolean insertAirlines(Airlines a) {
		// TODO Auto-generated method stub
		 return adminDao.insertAirLines(a);
	}


	@Override
	public List<Airlines> getAirlines() {
		List<Airlines> airlines=adminDao.getAllAirLines();
		for(Airlines a: airlines)
		{
			System.out.println(a.getAirlineno()+"\t"+a.getAirlineName());
		}
		return adminDao.getAllAirLines();
	}


	//SourceDestination.java
	
	


	@Override
	public List<SourceDestination> getSourceDestination() {
		List<SourceDestination> sourcedestination = adminDao.getAllSourceDestination();
		for(SourceDestination sd: sourcedestination)
		{
			System.out.println(sd.getSdno()+"\t"+sd.getSource()+"\t"+sd.getDestination());
			
		}
		
		return adminDao.getAllSourceDestination();
	}


	@Override
	public boolean insertSourceDestination(SourceDestination sd) {
		// TODO Auto-generated method stub
		return adminDao.insertSourceDestination(sd);
	}


	@Override
	public boolean deleteFlights(int flightno) {
		return adminDao.delete(flightno);
	}


	@Override
	public boolean deleteAirlines(int airlineno) {
		// TODO Auto-generated method stub
		return adminDao.deleteAirLines(airlineno);
	}


	@Override
	public boolean deleteSourceDestination(int sdno) {
		
		return adminDao.deleteSourceDestination(sdno);
	}


	//Update Admin Passwoprd 
	public boolean updateAdminPassword(User u) {
		
		return adminDao.updatePassword(u);
	}

}
