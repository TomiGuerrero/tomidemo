package com.redbeechallenge.service;

import java.util.List;

import com.redbeechallenge.model.Content;
import com.redbeechallenge.model.Data;
import com.redbeechallenge.model.Tag;

public interface SocialNetworkService {

	Content getContentByTag(Tag tag);

	Tag createTag(String tagValue);

	List<Data> findByTag(Tag tag);

	List<Data> findAll();

	void deleteByTag(String tag);
}
