package com.redbeechallenge.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
@Access(AccessType.FIELD)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	private String id;
	@Column(name = "user_full_name")
	private String full_name;
	@Column(name = "user_profile_picture")
	private String profile_picture;
	@Column(name = "user_username")
	private String username;

	public String getId() {
		return this.id;
	}

	public User setId(String id) {
		this.id = id;
		return this;
	}

	public String getFull_name() {
		return this.full_name;
	}

	public User setFull_name(String full_name) {
		this.full_name = full_name;
		return this;
	}

	public String getProfile_picture() {
		return this.profile_picture;
	}

	public User setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public User setUsername(String username) {
		this.username = username;
		return this;
	}
}  
