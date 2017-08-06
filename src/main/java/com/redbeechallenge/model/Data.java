package com.redbeechallenge.model;

public class Data {
	
	private String id;
	private User user;
	private Tags tags;
	private String link;
	
	public Data() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	

}
