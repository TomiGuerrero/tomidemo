package com.redbeechallenge.controller;

import com.redbeechallenge.model.Tag;
import com.redbeechallenge.service.SocialNetworkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/tags")
public class HashTagController {

	@Autowired
	private SocialNetworkService instagramService;

	@RequestMapping(value = "/add/{value}", method = RequestMethod.POST)
	public Tag createTag(@PathVariable String value, HttpServletRequest request) {
		Tag tag = instagramService.createTag(value);
		return tag;
	}

}
