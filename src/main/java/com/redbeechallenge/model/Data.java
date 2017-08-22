package com.redbeechallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "data")
@JsonIgnoreProperties(ignoreUnknown = true)
@Access(AccessType.FIELD)
public class Data implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private String id;

	@Embedded
	@Access(AccessType.FIELD)
	private User user;
	@Embedded
	@Access(AccessType.FIELD)
	private Image images;
	private transient Collection<String> tags;
	private String tag;
	private String link;

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

	public String getId() {
		return this.id;
	}

	@Access(AccessType.PROPERTY)
	@Column(name = "tags")
	public String getTag() {
		return this.tag;
	}

	public Data setTag(String tag) {
		this.tag = tag;
		return this;
	}

	@Access(AccessType.PROPERTY)
	@Column(name = "link")
	public String getLink() {
		return this.link;
	}

	public Data setLink(String link) {
		this.link = link;
		return this;
	}

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

	public Image getImages() {
		return images;
	}

	public void setImages(Image images) {
		this.images = images;
	}

}
