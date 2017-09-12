package com.cmad.biz;

import java.util.List;

import com.cmad.api.DuplicateUserException;
import com.cmad.api.InvalidUserException;
import com.cmad.api.User;
import com.cmad.api.UserAuthonticationException;
import com.cmad.api.UserNotFoundException;
import com.cmad.api.UsersController;

public class UsersControllerImpl implements UsersController {

	public void createUser(User user) throws InvalidUserException, DuplicateUserException {
		System.out.println("UsersControllerImpl.createUser()");
		if (user.getUserID() == null || user.getUserID().trim().length() == 0 || user.getPassword() == null
				|| user.getPassword().trim().length() == 0) {
			throw new InvalidUserException();
		}
		if (DAOFactory.getInstance().getUserDAO().readUser(user.getUserID()) != null) {
			throw new DuplicateUserException();
		}
		DAOFactory.getInstance().getUserDAO().createUser(user);
	}

	@Override
	public User readUser(String userID) throws InvalidUserException, UserNotFoundException {
		if (userID == null) {
			throw new InvalidUserException();
		}
		User user = DAOFactory.getInstance().getUserDAO().readUser(userID);
		if(user == null) {
			throw new UserNotFoundException();
		}
		return user;
	}

	@Override
	public void deleteUser(String userID) throws UserNotFoundException {
		System.out.println("UsersControllerImpl.deleteUser():"+userID);
		if (userID == null) {
			throw new InvalidUserException();
		}
		if(DAOFactory.getInstance().getUserDAO().readUser(userID) == null) {
			throw new UserNotFoundException();
		}
		DAOFactory.getInstance().getUserDAO().deleteUser(userID);
	}

	@Override
	public void updateUser(User user) throws InvalidUserException, UserNotFoundException {
		if (user.getUserID() == null || user.getUserID().trim().length() == 0 || user.getPassword() == null
				|| user.getPassword().trim().length() == 0) {
			throw new InvalidUserException();
		}
		if (DAOFactory.getInstance().getUserDAO().readUser(user.getUserID()) == null) {
			throw new UserNotFoundException();
		}
		DAOFactory.getInstance().getUserDAO().updateUser(user);
	}

	public List<User> readAllUsers() {

		return DAOFactory.getInstance().getUserDAO().readAllUser();
	}

	public void authonticateUser(User user) throws InvalidUserException, UserNotFoundException,UserAuthonticationException {
		if (user.getUserID() == null || user.getUserID().trim().length() == 0 || user.getPassword() == null
				|| user.getPassword().trim().length() == 0) {
			throw new InvalidUserException();
		}
		User localUser = DAOFactory.getInstance().getUserDAO().readUser(user.getUserID());
		if(localUser == null) {
			throw new UserNotFoundException();
		}
		System.out.println("UsersControllerImpl.authonticateUser()localUser::password:"+localUser.getPassword());
		System.out.println("UsersControllerImpl.authonticateUser()localUser::password:"+user.getPassword());
		if(!localUser.getPassword().equals(user.getPassword())){
			throw new UserAuthonticationException();
		}
	}
}
