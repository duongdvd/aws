package com.awsexample.aws.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockMailService extends AbtractMaiService {
    private static final Logger LOG = LoggerFactory.getLogger(MockMailService.class);
    @Override
    public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage) {
        LOG.debug("mail service...");
        LOG.info(simpleMailMessage.toString());
        LOG.debug("Email sent.");
    }
}
