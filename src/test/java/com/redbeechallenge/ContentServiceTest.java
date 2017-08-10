package com.redbeechallenge;

import com.redbeechallenge.model.Data;
import com.redbeechallenge.model.Tag;
import com.redbeechallenge.service.SocialNetworkService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes={RedBeeChallengeApplication.class})
public class ContentServiceTest extends Assert {

    @Autowired
    private SocialNetworkService instagramService;

    @Test
    public void shouldCreateTagAndFetchContent() {
        Tag tag = instagramService.createTag("r2");
        assertTrue(tag.getId() != null);
    }

    @Test
    public void shouldGetContentByTag() {
        List<Data> list = instagramService.findByTag(new Tag().setValue("r2"));
        assertEquals(list.size(), 1);
    }

    @Test
    public void shouldGetContentByNonExistentTag() {
        List<Data> list = instagramService.findByTag(new Tag().setValue("r3"));
        assertEquals(list.size(), 0);
    }

}
