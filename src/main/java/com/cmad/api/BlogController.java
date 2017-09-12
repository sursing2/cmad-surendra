package com.cmad.api;

import java.util.List;

public interface BlogController {
	public void create(Blog blog) throws InvalidBlogException, DuplicateBlogException;

	public List<Blog> readByUserID(String userID) throws InvalidBlogException, UserNotFoundException, BlogNotFoundException;
	
	public List<Blog> readByCategory(String category) throws InvalidBlogException, BlogNotFoundException;

	public Blog readByBlogID(String blogID) throws InvalidBlogException, BlogNotFoundException;

	public void update(Blog blog) throws InvalidBlogException, BlogNotFoundException;

	public void delete(String blogID) throws InvalidBlogException, BlogNotFoundException;

}
