package com.cmad.data;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;
import com.cmad.api.User;
import com.cmad.api.Blog;
import com.cmad.biz.DAOFactory;


public class DAOFactoryImpl extends DAOFactory{
	static MongoClient mongoClient = new MongoClient("172.31.23.14:27017");
	static Morphia morphia= new Morphia();
	static Datastore  datatstore = morphia.createDatastore(mongoClient, "mydb");
	
	public DAOFactoryImpl(){
		
	}

	public UsersDAO getUserDAO() {
		UsersDAO dao;
		return dao = new MongoUsersDAO(User.class, datatstore);
	}

	@Override
	public BlogDAO getBlogDAO() {
		BlogDAO dao;
		return dao = new MongoBlogDAO(Blog.class, datatstore);
	}
	
}
