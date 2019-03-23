package com.awsexample.aws.web.controller;

import com.awsexample.aws.web.domain.frontend.FeedbackPojo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    public static final String FEEDBACK_MODEL_KEY="feedback";
    public static final String CONTRACT_US_VIEW_NAME="contract/contract";

    @GetMapping("/contract")
    public String contractGet(ModelMap modelMap){
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        modelMap.addAttribute(ContactController.CONTRACT_US_VIEW_NAME, feedbackPojo);
        return ContactController.CONTRACT_US_VIEW_NAME;
    }
}
