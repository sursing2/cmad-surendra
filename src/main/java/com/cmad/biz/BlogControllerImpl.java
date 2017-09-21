package com.cmad.biz;

import java.util.List;

import com.cmad.api.Blog;
import com.cmad.api.BlogController;
import com.cmad.api.BlogNotFoundException;
import com.cmad.api.DuplicateBlogException;
import com.cmad.api.InvalidBlogException;
import com.cmad.api.UserNotFoundException;

public class BlogControllerImpl implements BlogController {

	public void create(Blog blog) throws InvalidBlogException, DuplicateBlogException{
		System.out.println("BlogControllerImpl.create()");

		if (blog == null ||(blog.getBlogCategory() == null
				|| blog.getBlogCategory().trim().length() == 0) ||(blog.getBlogTitle() == null
				|| blog.getBlogTitle().trim().length() == 0) || (blog.getBlogText() == null
				|| blog.getBlogText().trim().length() == 0)) {
			throw new InvalidBlogException();
		}
		if (DAOFactory.getInstance().getBlogDAO().readByBlogID(blog.getBlogID()) != null) {
			throw new DuplicateBlogException();
		}
		DAOFactory.getInstance().getBlogDAO().createBlog(blog);
	}

	public List<Blog> readByUserID(String userID) throws InvalidBlogException, UserNotFoundException, BlogNotFoundException{
		
		System.out.println("BlogControllerImpl.readByUserID():0"+userID);
		if (userID == null) {
			throw new InvalidBlogException();
		}
		if(DAOFactory.getInstance().getUserDAO().readUser(userID) == null) {
			throw new UserNotFoundException();
		}
		System.out.println("BlogControllerImpl.readByUserID()::!");
		List<Blog> blogs = DAOFactory.getInstance().getBlogDAO().readByUserID(userID);
		
		System.out.println("BlogControllerImpl.readByUserID()2");
		if(blogs == null) {
			throw new BlogNotFoundException();
		}
		System.out.println("BlogControllerImpl.readByUserID()::blogs"+blogs);
		return blogs;
	}
	
	public List<Blog> readByCategory(String category) throws InvalidBlogException, BlogNotFoundException{
		
		if (category == null) {
			throw new InvalidBlogException();
		}
		
		List<Blog> blogs = DAOFactory.getInstance().getBlogDAO().readByCategory(category);
		
		if(blogs == null) {
			throw new BlogNotFoundException();
		}
		return blogs;
	}

	public Blog readByBlogID(String blogID) throws InvalidBlogException, BlogNotFoundException{
		if(blogID == null) {
			throw new InvalidBlogException();
		}
		Blog blog = DAOFactory.getInstance().getBlogDAO().readByBlogID(blogID);
		if(blog == null) {
			throw new BlogNotFoundException();
		}
		return blog;
	}

	public void update(Blog blog) throws InvalidBlogException, BlogNotFoundException{
		if (blog == null ||(blog.getBlogCategory() == null
				|| blog.getBlogCategory().trim().length() == 0) ||(blog.getBlogTitle() == null
				|| blog.getBlogTitle().trim().length() == 0) || (blog.getBlogText() == null
				|| blog.getBlogText().trim().length() == 0)) {
			throw new InvalidBlogException();
		}
		
		if (DAOFactory.getInstance().getBlogDAO().readByBlogID(blog.getBlogID()) == null){
			throw new BlogNotFoundException();
		}
		DAOFactory.getInstance().getBlogDAO().updateBlog(blog);
	}

	public void delete(String blogID) throws InvalidBlogException, BlogNotFoundException{
		if(blogID == null) {
			throw new InvalidBlogException();
		}
		if(DAOFactory.getInstance().getBlogDAO().readByBlogID(blogID) == null) {
			throw new BlogNotFoundException();
		}
		DAOFactory.getInstance().getBlogDAO().deleteBlog(blogID);
	}

	@Override
	public List<Blog> readByTitle(String title) throws InvalidBlogException, BlogNotFoundException {
		if (title == null) {
			throw new InvalidBlogException();
		}
		System.out.println("BlogControllerImpl.readByTitle():"+title);
		List<Blog> blogs = DAOFactory.getInstance().getBlogDAO().readByTitle(title);
		
		if(blogs == null) {
			throw new BlogNotFoundException();
		}
		return blogs;
	}

	@Override
	public void deleteAllByUserID(String userID)
			throws UserNotFoundException, InvalidBlogException, BlogNotFoundException {
		System.out.println("BlogControllerImpl.deleteAllByUserID()");
		
		List<Blog> blogs =  DAOFactory.getInstance().getBlogDAO().readByUserID(userID);
		System.out.println("BlogControllerImpl.deleteAllByUserID():size:"+blogs.size());
		for(int index = 0 ; index < blogs.size(); index++) {
			Blog blog = blogs.get(index);
			System.out.println("BlogControllerImpl.deleteAllByUserID():blogID:"+blog.getBlogID());
			DAOFactory.getInstance().getBlogDAO().deleteBlog(blog.getBlogID());
		}
		
	}
}
