package com.example.taskApplication.services;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
