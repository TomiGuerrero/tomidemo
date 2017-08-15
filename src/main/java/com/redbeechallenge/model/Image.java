package com.redbeechallenge.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

	@Embedded
	@Access(AccessType.FIELD)
	private StdResolution standard_resolution;

	public StdResolution getStandard_resolution() {
		return standard_resolution;
	}

	public void setStandard_resolution(StdResolution standard_resolution) {
		this.standard_resolution = standard_resolution;
	}

}
