package org.simplilearn.dao;

import static org.simplilearn.util.DbConstants.DRIVER;
import static org.simplilearn.util.DbConstants.PWD;
import static org.simplilearn.util.DbConstants.URL;
import static org.simplilearn.util.DbConstants.USERNAME;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import org.simplilearn.entities.User;
import org.simplilearn.util.JdbcUtil;

public class UserDaoImpl implements UserDao{
	//public static boolean isRegistered=false;

	@Override
	public boolean insert(User user){
		Connection con=null;
		PreparedStatement pst=null;
		boolean isRegistered=false;
		try {
			
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			
			
			if(getUser(user.getUsername())==null)
			{
				pst=con.prepareStatement("insert into user values(?,?,?,?)");
				Random random=new Random();
				int userId=random.nextInt(10000);
				pst.setInt(1, userId);
				pst.setString(2, user.getUsername());
				pst.setString(3, user.getPassword());
				pst.setString(4, user.getUserType());
				int i=pst.executeUpdate();
				System.out.println("Value of i is = "+i);
				if(i>0)
					isRegistered=true;
				
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isRegistered;
		


	}

	@Override
	public User getUser(String username, String password) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		User user=null;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("select * from user where username=? and password=?");
			pst.setString(1, username);
			pst.setString(2, password);
			rs=pst.executeQuery();
			if(rs.next())
			{
				user=new User(rs.getInt(1), rs.getString(2), rs.getString(3) ,rs.getString(4));
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	@Override
	public User getUser(String username) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		User user=null;
		try {
			con=JdbcUtil.getConnection(DRIVER, URL, USERNAME, PWD);
			pst=con.prepareStatement("select * from user where username=?");
			pst.setString(1, username);
			rs=pst.executeQuery();
			if(rs.next())
			{
				user=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	}
	
