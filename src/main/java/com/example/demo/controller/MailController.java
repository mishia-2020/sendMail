package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// 参考
// https://www.baeldung.com/spring-email
// https://qiita.com/rubytomato@github/items/b106ff8011bcad60bce2#spring-boot-starter-mail

@RestController
public class MailController {
    @Autowired
    //JavaMailSender mailSender;
    MailSender mailSender;

    @GetMapping("/mail")
    public String sendmail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("test@test.jp");
        message.setTo("janne.dar.ca@gmail.com");
        message.setSubject("メールテスト題名");
        message.setText("メールテスト本文.テストだよ。");

        try {
            mailSender.send(message);
        } catch (MailException e) {
            // do not something
            throw new Exception(e);
        }
        return "成功!";
    }




}
