package com.cmad.api;

import java.util.List;

public interface UsersController {
	public void createUser(User user) throws InvalidUserException, DuplicateUserException;

	public User readUser(String userID) throws InvalidUserException, UserNotFoundException;

	public void deleteUser(String userID) throws UserNotFoundException;

	public void updateUser(User user) throws InvalidUserException, UserNotFoundException;

	public List<User> readAllUsers();
	
	public void authonticateUser(User user) throws InvalidUserException,UserNotFoundException,UserAuthonticationException;

}
