package com.cmad.data;

import java.util.List;

import com.cmad.api.DuplicateUserException;
import com.cmad.api.InvalidUserException;
import com.cmad.api.User;
import com.cmad.api.UserNotFoundException;

public interface UsersDAO {
	public void createUser(User user);

	public User readUser(String userID) ;

	public void deleteUser(String userID);
	
	public void updateUser(User user);
	
	public List<User> readAllUser();

}
