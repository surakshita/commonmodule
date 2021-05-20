package com.xworkz.logger.utility;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailSender {

	public static void main(String[] args) {
		JavaMailSenderImpl javaMailSenderImpl=new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setPort(587);
		javaMailSenderImpl.setUsername("surakshita.xworkz@gmail.com");
		javaMailSenderImpl.setPassword("");
		
		Properties javaMailProperties=new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.putIfAbsent("mail.debug", "true");
		
		javaMailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs= {"biradar.surakshita@gmail.com"};
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("surakshita.xworkz@gmail.com");
		message.setTo("biradar.surakshita@gmail.com");
		message.setBcc(bccs);
		message.setSubject("demo mail sender");
		message.setText("this is an demo mail sender\n loggers");
		
		javaMailSenderImpl.send(message);
		

	}

}
