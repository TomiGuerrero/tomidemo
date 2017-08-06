package com.redbeechallenge.service.impl;

import org.springframework.stereotype.Service;

import com.redbeechallenge.service.SocialNetworkService;

import java.util.ArrayList;
import java.util.Collection;


@Service
public class InstagramServiceImpl implements SocialNetworkService {

    @Override
    public Collection<Object> getContentByTag(String tag) {
        return new ArrayList<>();
    }
}
