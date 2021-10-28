package com.xoriant.banking.poc.resource;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
@Controller
public class MailSender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Bean
	public Queue f1() {
		return new Queue("withdrawEmailQ", false);
	}
	
	@Bean
	public Queue f2() {
		return new Queue("depositeEmailQ", false);
	}
	
	@Bean
	public Queue f3() {
		return new Queue("transferEmailQ", false);
	}
	
	@Bean
	public Queue f4() {
		return new Queue("balanceEmailQ", false);
	}
	
	public void sendWithdrawDetails(double amount , int balance) {
		String msg=amount+" Rs. amount is withdraw from your account. Remaining balnace is : "+balance;
		rabbitTemplate.convertAndSend("withdrawEmailQ",msg);
	}
		
	public void sendDepositeDetails(double amount , int balance) {
			String msg=amount+" Rs. amount is deposited in your account.New balnace is : "+balance;
			rabbitTemplate.convertAndSend("depositeEmailQ",msg);
	}		
	public void sendFundTransaferDetails(double amount , int balance) {
				String msg=amount+" Rs. amount is transfer from your account. Remaining balnace is : "+balance;
				rabbitTemplate.convertAndSend("transferEmailQ",msg);		

	}
	public void balanceInquiry(double amount) {
		String msg="Your balnace is : "+amount;
		rabbitTemplate.convertAndSend("balanceEmailQ",msg);		

	}
}
