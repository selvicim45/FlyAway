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
import java.util.Random;

import org.simplilearn.entities.Airlines;
import org.simplilearn.entities.FlightsList;
import org.simplilearn.entities.SourceDestination;
import org.simplilearn.entities.User;
import org.simplilearn.util.JdbcUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean insert(FlightsList f) {
		
			Connection con=null;
			PreparedStatement pst=null;
			boolean isInserted=false;
			try {
				con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
				Random random=new Random();
				int flightno=random.nextInt(10000);
				
				pst=con.prepareStatement("insert into flights values(?,?,?,?,?)");
				pst.setInt(1, flightno);
				pst.setString(2, f.getSource());
				pst.setString(3, f.getDestination());
				pst.setString(4, f.getAirlines());
				pst.setString(5, f.getPrice());
				int i=pst.executeUpdate();
				//System.out.println("The value of i is " + i);
				if(i>0)
					isInserted=true;
				con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return isInserted;
		}

	@Override
	public boolean delete(int flightno) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isDeleted=false;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("delete from flights where flightno=?");
			pst.setInt(1,flightno);
			int i=pst.executeUpdate();
			if(i>0)
				isDeleted=true;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public List<FlightsList> getAll() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<FlightsList> flights=new ArrayList<>();
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			st=con.createStatement();
			rs=st.executeQuery("select * from flights");
			while(rs.next())
			{
				flights.add(new FlightsList(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flights;
	}

	//Airlines.java entities methods
	@Override
	public boolean insertAirLines(Airlines a) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			
			pst=con.prepareStatement("insert into airlines values(?,?)");
			Random random=new Random();
			int airlineno=random.nextInt(10000);
			pst.setInt(1,airlineno);
			pst.setString(2,a.getAirlineName());
			
			int i=pst.executeUpdate();
			System.out.println("The value of i is " + i);
			if(i>0)
				isInserted=true;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isInserted;
	}
	

	@Override
	public boolean deleteAirLines(int airlinesno) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isDeleted=false;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("delete from airlines where airlineno=?");
			pst.setInt(1,airlinesno);
			int i=pst.executeUpdate();
			if(i>0)
				isDeleted=true;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public List<Airlines> getAllAirLines() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Airlines> airlines=new ArrayList<>();
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			st=con.createStatement();
			rs=st.executeQuery("select * from airlines");
			while(rs.next())
			{
				airlines.add(new Airlines(rs.getInt(1), rs.getString(2)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return airlines;
	}

	
	//SourceDestination.java
	@Override
	public boolean insertSourceDestination(SourceDestination sd) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			
			pst=con.prepareStatement("insert into source_destination values(?,?,?)");
			Random random=new Random();
			int sdno=random.nextInt(10000);
			pst.setInt(1,sdno);
			pst.setString(2,sd.getSource());
			pst.setString(3, sd.getDestination());
			
			int i=pst.executeUpdate();
			
			if(i>0)
				isInserted=true;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isInserted;
	}
	

	@Override
	public boolean deleteSourceDestination(int sdno) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isDeleted=false;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("delete from source_destination where sdno=?");
			pst.setInt(1,sdno);
			int i=pst.executeUpdate();
			if(i>0)
				isDeleted=true;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public List<SourceDestination> getAllSourceDestination() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<SourceDestination> sourcedestination=new ArrayList<>();
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			st=con.createStatement();
			rs=st.executeQuery("select * from source_destination");
			while(rs.next())
			{
				sourcedestination.add(new SourceDestination(rs.getInt(1), rs.getString(2),rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sourcedestination;
	}

	@Override
	public boolean updatePassword(User u) {
		
		boolean isUpdated=false;
		Connection con=null;
		PreparedStatement pst=null;
	try {
		System.out.println("I am called from Dao layer");
		con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
		
		
		
        pst=con.prepareStatement("update user set password=? where username=?");
         
        pst.setString(1, u.getPassword());
        pst.setString(2, u.getUsername());
        int i=pst.executeUpdate();
		
		if(i>0)
			
			isUpdated=true;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isUpdated;
	}

	
	}
	

	


