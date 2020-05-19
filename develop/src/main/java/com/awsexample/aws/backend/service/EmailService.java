package com.awsexample.aws.backend.service;

import com.awsexample.aws.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;


public interface EmailService {
    /**
            * Send mail
     * @param feedbackPojo
     */
    public void sendFeedBackEMail(FeedbackPojo feedbackPojo);

    /**
     * Send mail
     * @param simpleMailMessage
     */
    public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage);
}
