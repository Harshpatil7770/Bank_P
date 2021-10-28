package com.xoriant.banking.poc.dao;

public interface CommonDao {

	public double checkBalance(int accountNumber);

	public int changePassword(String oldPassword, String newPassword, int customer_id);

}