package com.redbeechallenge.controller;

import com.redbeechallenge.model.Tag;
import com.redbeechallenge.service.SocialNetworkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(path = "/tags")
public class HashTagController {

    @Autowired
    private SocialNetworkService instagramService;

    @RequestMapping(method = RequestMethod.POST)
    public Tag createTag(HttpServletRequest request) {
        String value = request.getParameter("value");
        Tag tag = instagramService.createTag(value);
        return tag;
    }

}
