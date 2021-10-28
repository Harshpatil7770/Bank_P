package com.xoriant.banking.poc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.banking.poc.service.CommonService;

@RestController
@RequestMapping("/api/common")
@CrossOrigin
@RefreshScope
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	@GetMapping("/checkBalance/{accountNumber}")
	public double checkBalance(int accountNumber) {
		
		double balance = commonService.checkBalance(accountNumber);
		
		return balance;
	}

	@GetMapping("/changePassword/{oldPassword}/{newPassword}/{customer_id}")
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		
		int balance = commonService.changePassword(oldPassword, newPassword, customer_id);
		return balance;
	}

}
