package com.redbeechallenge.model;

public class User {
	
	private Long id;
	private String full_name;
	private String profile_picture;
	private String username;
	
	public User() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
