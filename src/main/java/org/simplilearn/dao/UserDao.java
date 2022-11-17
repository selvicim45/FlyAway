package org.simplilearn.dao;

import org.simplilearn.entities.User;

public interface UserDao {
	boolean insert(User user);
	User getUser(String username,String password);
	User getUser(String username);
}
