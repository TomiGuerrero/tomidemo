package com.redbeechallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {

    private Data data;
 
	
    public Content() {
    
    }   
   
    
}
