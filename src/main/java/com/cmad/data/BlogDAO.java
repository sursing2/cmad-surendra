package com.cmad.data;

import java.util.List;

import com.cmad.api.Blog;

public interface BlogDAO {
	public void createBlog(Blog blog);

	public void updateBlog(Blog blog);

	public Blog readByBlogID(String blogID);

	public List<Blog> readByUserID(String userID);
	
	public List<Blog> readByCategory(String category);

	public void deleteBlog(String blogID);
}
