package com.awsexample.aws.web.controller;

import com.awsexample.aws.backend.service.EmailService;
import com.awsexample.aws.web.domain.frontend.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);
    public static final String FEEDBACK_MODEL_KEY="feedback";
    public static final String CONTRACT_US_VIEW_NAME="contract/contract";
    @Autowired
    private EmailService emailService;

    @GetMapping("/contract")
    public String contractGet(ModelMap modelMap){
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        modelMap.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);
        return ContactController.CONTRACT_US_VIEW_NAME;
    }

    @PostMapping("/contract")
    public String contractPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedBack){
        LOG.debug("Pojo {}", feedBack);
//        emailService.sendFeedBackEMail(feedBack);
        return ContactController.CONTRACT_US_VIEW_NAME;
    }
}
