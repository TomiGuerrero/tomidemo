package com.redbeechallenge.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {
    private List<Data> data;

    public List<Data> getData() {
		return data;
	}


	public void setData(List<Data> data) {
		this.data = data;
	}


}
