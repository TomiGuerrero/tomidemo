package com.redbeechallenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.redbeechallenge.model.Content;
import com.redbeechallenge.model.Data;
import com.redbeechallenge.model.Tag;
import com.redbeechallenge.repository.DataRepository;
import com.redbeechallenge.repository.TagRepository;
import com.redbeechallenge.service.SocialNetworkService;

@Service
public class InstagramServiceImpl implements SocialNetworkService {

	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private TagRepository tagRepository;
	
	@Override
	public Content getContentByTag(Tag tag) {
		String accessToken = "1557413059.214e029.46b6cdec4fb94b099f48655808576832";
		String path = String.format("https://api.instagram.com/v1/tags/%s/media/recent?access_token=%s", tag.getValue(), accessToken);

		RestTemplate resTemplate  = new RestTemplate();
		Content content = resTemplate.getForObject(path, Content.class);

		for(Data d : content.getData()) {
			d.setTag(tag.getValue());
			dataRepository.save(d);
		}


		return content;
	}

	@Override
	public Tag createTag(String tagValue) {
		Tag tag = new Tag().setValue(tagValue);
		tag = tagRepository.save(tag);

		
		getContentByTag(tag);

		return tag;
	}

	@Override
	public List<Data> findByTag(Tag tag) {
		List<Data> list = new ArrayList<>();
		
		list = dataRepository.findByTag(tag.getValue());


		return list;
	}	

}
