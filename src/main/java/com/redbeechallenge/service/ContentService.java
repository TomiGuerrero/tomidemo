package com.redbeechallenge.service;

import java.util.Collection;

import com.redbeechallenge.model.Content;
import com.redbeechallenge.model.HashTag;


public interface ContentService {

    HashTag save(String userId, String hashTagValue);

    Collection<HashTag> getUserHashTags(String userId);

    Collection<Content> getContentByTag(String userId, String hashTag);

	Collection<Content> getContentByTag();

}
