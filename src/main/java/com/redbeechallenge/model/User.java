package com.redbeechallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;

//@Entity
//@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	@Column(name = "user_id")
	private String id;

	@Column(name = "user_full_name")
	private String full_name;

	@Column(name = "user_profile_picture")
	private String profile_picture;

	@Column(name = "user_username")
	private String username;

	public String getId() {
		return id;
	}

	public User setId(String id) {
		this.id = id;
		return this;
	}

	public String getFull_name() {
		return full_name;
	}

	public User setFull_name(String full_name) {
		this.full_name = full_name;
		return this;
	}

	public String getProfile_picture() {
		return profile_picture;
	}

	public User setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public User setUsername(String username) {
		this.username = username;
		return this;
	}
}
