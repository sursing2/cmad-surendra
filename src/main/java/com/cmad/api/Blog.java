package com.cmad.api;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity
public class Blog {
@Id
private String blogID;
private String blogTitle;
private String blogText;
private String blogCategory;
private String userID;

public String getBlogID() {
	return blogID;
}
public void setBlogID(String blogID) {
	this.blogID = blogID;
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getBlogTitle() {
	return blogTitle;
}
public void setBlogTitle(String blogTitle) {
	this.blogTitle = blogTitle;
}
public String getBlogText() {
	return blogText;
}
public void setBlogText(String blogText) {
	this.blogText = blogText;
}
public String getBlogCategory() {
	return blogCategory;
}
public void setBlogCategory(String blogCategory) {
	this.blogCategory = blogCategory;
}
}
