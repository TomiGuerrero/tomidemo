package com.redbeechallenge.controller;

import com.redbeechallenge.model.Data;
import com.redbeechallenge.model.Tag;
import com.redbeechallenge.service.SocialNetworkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@RestController
@RequestMapping(path = "/boards")
public class DataController {

	@Autowired
	private SocialNetworkService instagramService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Data> getContent(HttpServletRequest request) {

		return instagramService.findAll();

	}

	@RequestMapping(value = "/data/{value}", method = RequestMethod.GET)
	public Collection<Data> getContent(@PathVariable String value, HttpServletRequest request) {

		return instagramService.findByTag(new Tag().setValue(value));

	}

	@RequestMapping(value = "/delete/{value}", method = RequestMethod.DELETE)
	public void deleteByTag(@PathVariable String value, HttpServletRequest request) {

		instagramService.deleteByTag(value);
	}
}