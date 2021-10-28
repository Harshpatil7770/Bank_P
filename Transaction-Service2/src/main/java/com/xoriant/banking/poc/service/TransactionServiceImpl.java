package com.xoriant.banking.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.banking.poc.dao.TransactionDao;
import com.xoriant.banking.poc.model.TransactionDetails;
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;

	@Override
	public int withdrawMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type) {
		// TODO Auto-generated method stub
		return transactionDao.withdrawMoney(accountNumber, amount, description, user_type, transaction_type_id,
				account_type);
	}

	@Override
	public int DepositMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type) {
		// TODO Auto-generated method stub
		return transactionDao.DepositMoney(accountNumber, amount, description, user_type, transaction_type_id,
				account_type);
	}

	@Override
	public List<TransactionDetails> MiniStatement(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionDao.MiniStatement(accountNumber);
	}

	@Override
	public List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String ToDate) {
		// TODO Auto-generated method stub
		return transactionDao.CustomizedMiniStatement(accountNumber, fromDate, ToDate);
	}

	@Override
	public int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description,
			int user_type, int transaction_type_id, int account_type) {
		// TODO Auto-generated method stub
		return transactionDao.fundTransfer(payersAccountNumber, payeesAccountNumber, amount, description, user_type,
				transaction_type_id, account_type);
	}

	@Override
	public double checkBalance(int accountNumber) {
		// TODO Auto-generated method stub
		return transactionDao.checkBalance(accountNumber);
	}

}
