package com.awsexample.aws.config;

import com.awsexample.aws.backend.service.EmailService;
import com.awsexample.aws.backend.service.MockMailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("")
public class DevelopmentConfig {
    @Bean
    public EmailService emailService() {
        return new MockMailService();
    }
}
