package com.cmad.data;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import com.cmad.api.User;

public class MongoUsersDAO extends BasicDAO<User, String> implements UsersDAO{
	
	public MongoUsersDAO(Class<User> entityClass, Datastore ds) {
		super(entityClass, ds);
	}
	
	public void createUser(User user) {
		this.save(user);
		System.out.println("MongoUsersDAO.createUser():"+user);
	}


	public User readUser(String userID) {
		Query<User> query = createQuery().field("userID").equal(userID);
		System.out.println("MongoUsersDAO.readUser():"+query);
		return (User)query.get();
	}


	public void deleteUser(String userID) {
		System.out.println("MongoUsersDAO.deleteUser()");
		Query<User> query = createQuery().field("userID").equal(userID);
		this.delete((User)query.get());
	}

	@Override
	public List<User> readAllUser() {
		Query<User> query = createQuery();
		System.out.println("MongoUsersDAO.readAllUser()"+query.asList());
		return query.asList();
	}

	@Override
	public void updateUser(User user) {
		System.out.println("MongoUsersDAO.updateUser()");
		this.save(user);
	}
}
