package com.tomiguerrero.service.impl;

import com.tomiguerrero.model.Content;
import com.tomiguerrero.model.HashTag;
import com.tomiguerrero.service.ContentService;
import com.tomiguerrero.service.SocialNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Matias Suarez on 7/25/17.
 */
@Service
public class ContentServiceImpl implements ContentService {




    @Autowired
    private SocialNetworkService instagramService;

    @Override
    public HashTag save(String userId, String hashTagValue) {
        // guardo el tag.

        Collection<Object> content = instagramService.getContentByTag(hashTagValue);
        // guardo el contenido
        return null;
    }

    @Override
    public Collection<HashTag> getUserHashTags(String userId) {
        return null;
    }

    @Override
    public Collection<Content> getContentByTag(String userId, String hashTag) {
        Content content1 = new Content();
        content1.setImageUrl("http://www.google.com.ar");

        Content content2 = new Content();
        content2.setImageUrl("http://www.google.com.ar");
        return Arrays.asList(content1, content2);
    }
}
