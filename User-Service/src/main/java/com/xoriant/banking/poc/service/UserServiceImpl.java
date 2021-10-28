package com.xoriant.banking.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.banking.poc.dao.UserDao;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		// TODO Auto-generated method stub
		return userDao.changePassword(oldPassword, newPassword, customer_id);
	}

}
