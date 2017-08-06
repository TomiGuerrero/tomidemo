package com.tomiguerrero.service;

import com.tomiguerrero.model.Content;
import com.tomiguerrero.model.HashTag;

import java.util.Collection;

/**
 * @author Matias Suarez on 7/25/17.
 */
public interface ContentService {

    HashTag save(String userId, String hashTagValue);

    Collection<HashTag> getUserHashTags(String userId);

    Collection<Content> getContentByTag(String userId, String hashTag);

}
