package com.xoriant.banking.poc.dao;

public interface UserDao {

	public int changePassword(String oldPassword, String newPassword, int customer_id);

}