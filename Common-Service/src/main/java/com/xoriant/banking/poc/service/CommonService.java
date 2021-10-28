package com.xoriant.banking.poc.service;

public interface CommonService{
	
	public double checkBalance(int accountNumber);

	public int changePassword(String oldPassword, String newPassword, int customer_id);

	
}
