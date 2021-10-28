package com.xoriant.banking.poc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service")
public interface UserServiceProxy {
	
	@GetMapping("/api/user/changePassword/{oldPassword}/{newPassword}/{customer_id}")
	public int changePassword(String oldPassword, String newPassword, int customer_id);

}
