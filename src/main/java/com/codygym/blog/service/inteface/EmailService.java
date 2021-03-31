package com.codygym.blog.service.inteface;

import com.codygym.blog.model.VerificationToken;

public interface EmailService {
    void sendEmail(String to, String body, String topic);
}
