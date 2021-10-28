package com.xoriant.banking.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.banking.poc.dao.CommonDao;
@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	CommonDao commonDao;
	
	@Override
	public double checkBalance(int accountNumber) {
		// TODO Auto-generated method stub
		return commonDao.checkBalance(accountNumber);
	}

	@Override
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		// TODO Auto-generated method stub
		return commonDao.changePassword(oldPassword, newPassword, customer_id);
	}

}
