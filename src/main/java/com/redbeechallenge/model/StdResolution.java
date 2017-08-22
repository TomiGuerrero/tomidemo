package com.redbeechallenge.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class StdResolution {

	@Column(name = "url_img")
	@Access(AccessType.FIELD)
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}