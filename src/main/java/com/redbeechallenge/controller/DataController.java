package com.redbeechallenge.controller;

import com.redbeechallenge.model.Data;
import com.redbeechallenge.model.Tag;
import com.redbeechallenge.service.SocialNetworkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;


@RestController
@RequestMapping(path = "/data")
public class DataController {

    @Autowired
    private SocialNetworkService instagramService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Data> getContent(HttpServletRequest request) {
        String tagValue = request.getParameter("tag");
        return instagramService.findByTag(new Tag().setValue(tagValue));
    }

}
