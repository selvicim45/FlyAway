package org.simplilearn.services;

import org.simplilearn.entities.User;

public interface UserService {
	boolean registerUser(User user);
	User validate(User user);
	boolean getUser(String username);

}
