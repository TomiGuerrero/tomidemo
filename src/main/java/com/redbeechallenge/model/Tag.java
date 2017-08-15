package com.redbeechallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tags")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String value;

	public Long getId() {
		return id;
	}

	public Tag setId(Long id) {
		this.id = id;
		return this;
	}

	public String getValue() {
		return value;
	}

	public Tag setValue(String value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return "Tag{" + "value='" + value + '\'' + '}';
	}
}
