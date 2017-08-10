package com.redbeechallenge;

import com.redbeechallenge.model.Data;
import com.redbeechallenge.model.Tag;
import com.redbeechallenge.model.User;
import com.redbeechallenge.repository.DataRepository;
import com.redbeechallenge.repository.TagRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes={RedBeeChallengeApplication.class})
public class RedBeeChallengeApplicationTests extends Assert {

    @Autowired
    private DataRepository dataRepository;

    @Autowired
    private TagRepository tagRepository;

    @Test
    public void shouldCreateANewDataElements() {
        User user = new User();
        user.setId("1234894231210_14698752");
        user.setFull_name("Tomas Guerrero");
        user.setProfile_picture("http://www.google.com.ar");
        user.setUsername("tomig");

        Data data = new Data();
        data.setId("01234_56789");
        data.setLink("http://www.google.com.ar");
        data.setTags(Arrays.asList("testing"));
        data.setUser(user);

        Data savedData = dataRepository.save(data);
        assertNotNull(savedData.getId());
    }

    @Test
    public void shouldCreateANewTag() {
        Tag tag = new Tag().setValue("#HASHTAG");
        tag = tagRepository.save(tag);
        assertNotNull(tag.getId());
    }

    @Test
    public void shouldListAllDataObjects() {
        List<Data> dataCollection = dataRepository.findAll();
        assertNotNull(dataCollection);
    }

}
