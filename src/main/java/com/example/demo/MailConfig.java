package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {
//    @Value("${email.Host}")
//    private String Host;
//
//    @Value("${email.port}")
//    private Integer port;
//
//    @Bean
//    public JavaMailSender javaMailService() {
//        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//
//        javaMailSender.setHost("smtp.gmail.com");
//        javaMailSender.setPort(587);
//
//        javaMailSender.setUsername("hoge@gmail.com");
//        javaMailSender.setPassword("gmail2段階認証のアプリパスワード");
//
//        Properties props = javaMailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//
//        return javaMailSender;
//    }

}
