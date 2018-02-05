package com.nb.library.batch.service;

import com.nb.library.batch.configuration.JavaMailSenderConfiguration;
import org.springframework.mail.SimpleMailMessage;

public class EmailService extends JavaMailSenderConfiguration {

    public void sendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        getJavaMailSender().send(message);
    }
}
