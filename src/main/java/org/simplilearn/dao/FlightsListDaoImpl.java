package org.simplilearn.dao;

import static org.simplilearn.util.DbConstants.DRIVER;
import static org.simplilearn.util.DbConstants.PWD;
import static org.simplilearn.util.DbConstants.URL;
import static org.simplilearn.util.DbConstants.USERNAME;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.simplilearn.entities.FlightsList;
import org.simplilearn.util.JdbcUtil;

public class FlightsListDaoImpl implements FlightsListDao{

	@Override
	public List<FlightsList> getAll(String source, String destination) {
		
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<FlightsList> flights=new ArrayList<>();
		
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("select * from flights where source=? and destination=?");
			pst.setString(1, source);
			pst.setString(2, destination);
			rs=pst.executeQuery();
			while(rs.next())
			{
				flights.add(new FlightsList(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flights;
	}

	@Override
	public List<FlightsList> getAll() {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<FlightsList> flights=new ArrayList<>();
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("select * from flights");
			
			rs=pst.executeQuery();
			while(rs.next())
			{
				flights.add(new FlightsList(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flights;
	}

	}

	


