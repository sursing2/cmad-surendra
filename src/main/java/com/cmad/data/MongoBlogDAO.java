package com.cmad.data;

import java.util.List;
import java.util.UUID;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import com.cmad.api.Blog;

public class MongoBlogDAO extends BasicDAO<Blog, String> implements BlogDAO{

	public MongoBlogDAO(Class<Blog> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	public void createBlog(Blog blog) {
		blog.setBlogID(UUID.randomUUID().toString());
		this.save(blog);
		System.out.println("MongoUsersDAO.createblog:"+blog);
	}

	public void deleteBlog(String blogID) {
		System.out.println("MongoBlogDAO.deleteBlog():"+blogID);
		Query<Blog> query = createQuery().field("blogID").equal(blogID);
		this.delete(query.get());
	}

	public void updateBlog(Blog blog) {
		this.save(blog);
	}

	public Blog readByBlogID(String blogID) {
		Query<Blog> query = createQuery().field("blogID").equal(blogID);
		return query.get();
	}

	public List<Blog> readByUserID(String userID) {
		Query<Blog> query = createQuery().field("userID").equal(userID);
		System.out.println("MongoUsersDAO.readAllUser()"+query.asList());
		return query.asList();
	}
	public List<Blog> readByCategory(String category) {
		Query<Blog> query = createQuery().field("blogCategory").equal(category);
		return query.asList();
	}
}
