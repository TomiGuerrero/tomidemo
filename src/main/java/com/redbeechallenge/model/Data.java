package com.redbeechallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;

	private transient User user;
	private transient Collection<String> tags;

	@Column(name="tags")
	private String tag;

	@Column(name="link")
	private String link;


	public Collection<String> getTags() {
		return tags;
	}

	public Data setTags(Collection<String> tags) {
		this.tags = tags;
		return this;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public Data setId(String id) {
		this.id = id;
		return this;
	}

	public User getUser() {
		return user;
	}

	public Data setUser(User user) {
		this.user = user;
		return this;
	}

	public String getTag() {
		return tag;
	}

	public Data setTag(String tag) {
		this.tag = tag;
		return this;
	}

	public String getLink() {
		return link;
	}

	public Data setLink(String link) {
		this.link = link;
		return this;
	}
}
