package com.redbeechallenge.controller;

import com.redbeechallenge.model.Content;
import com.redbeechallenge.service.ContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

@RestController
@RequestMapping(path = "/user/{userId}/hashtag")
public class HashTagController {

	
    @Autowired
    private ContentService contentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Content> create(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        return contentService.getContentByTag();
    }

}
