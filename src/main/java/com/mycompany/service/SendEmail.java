package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("sendEmail")
public class SendEmail {
    @Autowired
    public JavaMailSender mailSender;
    public void sendPreConfiguredMail(String to, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setFrom("saw.weew@mail.ru");
        mailMessage.setSubject("Important email");
        mailMessage.setText(message);
        mailSender.send(mailMessage);
    }
}
