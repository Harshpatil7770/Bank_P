package com.xoriant.banking.poc.service;

import java.util.List;

import com.xoriant.banking.poc.model.TransactionDetails;

public interface TransactionService {

	public int withdrawMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	public int DepositMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	public List<TransactionDetails> MiniStatement(int accountNumber);

	public List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String ToDate);

	public int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description,
			int user_type, int transaction_type_id, int account_type);

	public double checkBalance(int accountNumber);

}
