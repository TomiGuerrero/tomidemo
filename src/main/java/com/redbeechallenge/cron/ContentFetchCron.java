package com.redbeechallenge.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.redbeechallenge.service.ContentService;


@Component
public class ContentFetchCron {

    @Autowired
    private ContentService contentService;

    @Scheduled(fixedRate = 5000)
    public void getContent() {
    	//contentService.getContentByTag(userId, hashTag);
    	//contentService.getUserHashTags(userId);
        System.out.println("Hola Mundo");
    }

}
