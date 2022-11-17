package org.simplilearn.services;

import org.simplilearn.dao.UserDao;
import org.simplilearn.dao.UserDaoImpl;
import org.simplilearn.entities.User;

public class UserServiceImpl implements UserService {
	private UserDao dao=new UserDaoImpl();
	//private UserDaoImpl d = new UserDaoImpl();

	@Override
	public boolean registerUser(User user) {
		
		return dao.insert(user);
		

	}

	@Override
	public User validate(User user) {
		return dao.getUser(user.getUsername(), user.getPassword());

	}

	@Override
	public boolean getUser(String username) { 
		boolean isUserExisted=false;
		User user=dao.getUser(username);
		if(user!=null)
			isUserExisted=true;
		return isUserExisted;

	}
	

}