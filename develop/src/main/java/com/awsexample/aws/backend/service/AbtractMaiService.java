package com.awsexample.aws.backend.service;

import com.awsexample.aws.web.domain.frontend.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbtractMaiService implements EmailService {

    @Value("${default.to.mail}")
    private String defaultToAddress;
    protected SimpleMailMessage simpleMailMessage(FeedbackPojo feedbackPojo) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(defaultToAddress);
        simpleMailMessage.setFrom(feedbackPojo.getEmail());
        simpleMailMessage.setSubject("[Duongdv]: Feedback form "+ feedbackPojo.getFirstName() + " " + feedbackPojo.getLastName() +"!");
        simpleMailMessage.setText(feedbackPojo.getFeedback());
        return simpleMailMessage;
    }

    @Override
    public void sendFeedBackEMail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(simpleMailMessage(feedbackPojo));
    }
}
