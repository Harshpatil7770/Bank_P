package com.xoriant.ecart.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class EmailReceiver {

	@Autowired
	private JavaMailSender javaMailSender;

	@RabbitListener(queues = "withdrawEmailQ")
	public void withdraw(String bankMsg) {
		 System.out.println("===========> Email-Service:: ****====**** <===========");
			System.out.println(bankMsg);
			System.out.println("===========> Email-Service:: ****====**** <===========");
	       

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("somnathdevadhe312@gmail.com");
	    
	        msg.setSubject("Dutch Bank");
	        msg.setText(bankMsg);

	        javaMailSender.send(msg);
	}
	
	@RabbitListener(queues = "depositeEmailQ")
	public void deposite(String bankMsg) {
		 System.out.println("===========> Email-Service:: ****====**** <===========");
			System.out.println(bankMsg);
			System.out.println("===========> Email-Service:: ****====**** <===========");
	       

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("somnathdevadhe312@gmail.com");
	    
	        msg.setSubject("Dutch Bank");
	        msg.setText(bankMsg);

	        javaMailSender.send(msg);
	}
	
	@RabbitListener(queues = "transferEmailQ")
	public void transfer(String bankMsg) {
		 System.out.println("===========> Email-Service:: ****====**** <===========");
			System.out.println(bankMsg);
			System.out.println("===========> Email-Service:: ****====**** <===========");
	       

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("somnathdevadhe312@gmail.com");
	    
	        msg.setSubject("Dutch Bank");
	        msg.setText(bankMsg);

	        javaMailSender.send(msg);
	}
	
	@RabbitListener(queues = "balanceEmailQ")
	public void balanceInquiry(String bankMsg) {
		 System.out.println("===========> Email-Service:: ****====**** <===========");
			System.out.println(bankMsg);
			System.out.println("===========> Email-Service:: ****====**** <===========");
	       

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("somnathdevadhe312@gmail.com");
	    
	        msg.setSubject("Dutch Bank");
	        msg.setText(bankMsg);

	        javaMailSender.send(msg);
	}

}
