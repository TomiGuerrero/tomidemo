package com.redbeechallenge.service.impl;

import com.redbeechallenge.model.Content;
import com.redbeechallenge.model.HashTag;
import com.redbeechallenge.service.ContentService;
import com.redbeechallenge.service.SocialNetworkService;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;

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
	public Collection<Content> getContentByTag() {
		RestTemplate resTemplate  = new RestTemplate();
		Content content = resTemplate.getForObject("https://api.instagram.com/v1/tags/r2/media/recent?access_token=1557413059.214e029.46b6cdec4fb94b099f48655808576832", Content.class);
		
		System.out.println(content);
		
		return null;
	}

	@Override
	public Collection<Content> getContentByTag(String userId, String hashTag) {
		Content content1 = new Content();
		content1.setProfile_picture("http://www.google.com.ar");

		Content content2 = new Content();
		content2.setProfile_picture("http://www.google.com.ar");
		return Arrays.asList(content1, content2);
	}

	@Override
	public Collection<HashTag> getUserHashTags(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
