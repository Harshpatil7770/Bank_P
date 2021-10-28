package com.xoriant.banking.poc.dao;

import java.util.List;

import com.xoriant.banking.poc.model.TransactionDetails;

public interface TransactionDao {

	int withdrawMoney(int accountNumber, double amount, String description, int user_type, int transaction_type_id,
			int account_type);

	int DepositMoney(int accountNumber, double amount, String description, int user_type, int transaction_type_id,
			int account_type);

	List<TransactionDetails> MiniStatement(int accountNumber);

	List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String ToDate);

	int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	double checkBalance(int accountNumber);

}