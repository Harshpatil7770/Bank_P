package com.xoriant.banking.poc.service;

import java.util.List;

import com.xoriant.banking.poc.model.AccountDetails;
import com.xoriant.banking.poc.model.Address;
import com.xoriant.banking.poc.model.PersonAccount;
import com.xoriant.banking.poc.model.PersonInfo;
import com.xoriant.banking.poc.model.TransactionDetails;

public interface CustomerService {

	public Address editAddress(Address address,int customer_id);
	
	public List<AccountDetails> findAccountDetails();
	
	public List<AccountDetails> viewAllAccounts();

	public int withdrawMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	public int DepositMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	public List<TransactionDetails> MiniStatement(int accountNumber);

	public List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String toDate);

	public int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description,
			int user_type, int transaction_type_id, int account_type);

	public double checkBalance(int accountNumber);

	public int changePassword(String oldPassword, String newPassword, int customer_id);

}
