package com.xworkz.project.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
@Component
public class JavaMailSender {
	@Autowired
	JavaMailSenderImpl javaMailSenderImpl;

	public void sendJavaEmail() {
		String []bccs= {"biradar.surakshita@gmail.com"};
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("surakshita.xworkz@gmail.com");
		message.setTo("biradar.surakshita@gmail.com");
		message.setBcc(bccs);
		message.setSubject("demo mail sender");
		message.setText("this is an demo mail sender\n register page");
		
		javaMailSenderImpl.send(message);
	}

}
