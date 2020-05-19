package com.awsexample.aws;

import com.awsexample.aws.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AwsexampleApplicationTests {
    @Autowired
    private I18NService messageSource;

    @Test
    public void contextLoads() throws Exception{
        String ex = "do van duong";
        String msgId = "index.titel";
        String actual = messageSource.getMessage(msgId);
        Assert.assertEquals("fuck", ex, actual);
    }

}
