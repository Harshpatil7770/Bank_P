package com.xoriant.banking.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.banking.poc.dao.CustomerDao;
import com.xoriant.banking.poc.model.AccountDetails;
import com.xoriant.banking.poc.model.Address;
import com.xoriant.banking.poc.model.TransactionDetails;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	private TransactionServiceProxy transactionServiceProxy;
	
	@Autowired
	private UserServiceProxy userServiceProxy;
	
	@Override
	public List<AccountDetails> findAccountDetails() {
		
		return customerDao.findAccountDetails();
	}
	@Override
	public List<AccountDetails> viewAllAccounts() {
		return customerDao.findAccountDetails();
	}
	@Override
	public Address editAddress(Address address,int customer_id) {
		
		return customerDao.editAddress(address,customer_id);
	}
	@Override
	public int withdrawMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type) {
		int balace = transactionServiceProxy.withdrawMoney(accountNumber, amount, description, user_type, transaction_type_id, account_type);
		return balace;
	}
	@Override
	public int DepositMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type) {
		int balace =transactionServiceProxy.DepositMoney(accountNumber, amount, description, user_type, transaction_type_id, account_type);
		return balace;
	}
	@Override
	public List<TransactionDetails> MiniStatement(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.MiniStatement(accountNumber);
	}
	@Override
	public List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.CustomizedMiniStatement(accountNumber, fromDate, toDate);
	}
	@Override
	public int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description,
			int user_type, int transaction_type_id, int account_type) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.fundTransfer(payersAccountNumber, payeesAccountNumber, amount, description, user_type, transaction_type_id, account_type);
	}
	@Override
	public double checkBalance(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionServiceProxy.checkBalance(accountNumber);
	}
	@Override
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		// TODO Auto-generated method stub
		return userServiceProxy.changePassword(oldPassword, newPassword, customer_id);
	}
}
