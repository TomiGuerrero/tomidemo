package com.tomiguerrero.service.impl;

import com.tomiguerrero.service.SocialNetworkService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Matias Suarez on 7/25/17.
 */
@Service
public class InstagramServiceImpl implements SocialNetworkService {

    @Override
    public Collection<Object> getContentByTag(String tag) {
        return new ArrayList<>();
    }
}
