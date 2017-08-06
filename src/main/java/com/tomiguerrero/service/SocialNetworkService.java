package com.tomiguerrero.service;

import java.util.Collection;

/**
 * @author Matias Suarez on 7/25/17.
 */
public interface SocialNetworkService {

    Collection<Object> getContentByTag(String tag);
}
