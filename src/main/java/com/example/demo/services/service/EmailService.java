package com.example.demo.services.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;


@Service
public class EmailService 
{
    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String toEmail,String body,String object) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        //message.setFrom("fromemail@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(object);
        mailSender.send(message);
        System.out.println("Mail Send...");


    }

    }
