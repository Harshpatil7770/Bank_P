package com.xoriant.banking.poc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.banking.poc.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
@RefreshScope
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/changePassword/{oldPassword}/{newPassword}/{customer_id}")
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		
		int balance = userService.changePassword(oldPassword, newPassword, customer_id);
		return balance;
	}

}
