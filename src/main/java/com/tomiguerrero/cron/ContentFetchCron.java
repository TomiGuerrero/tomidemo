package com.tomiguerrero.cron;

import com.tomiguerrero.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Matias Suarez on 7/25/17.
 */
@Component
public class ContentFetchCron {

    @Autowired
    private ContentService contentService;

    @Scheduled(fixedRate = 5000)
    public void getContent() {
        System.out.println("Hola Mundo");
    }

}
