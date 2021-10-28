package com.xoriant.banking.poc.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.xoriant.banking.poc.model.TransactionDetails;

@FeignClient(name ="transaction-service")
public interface TransactionServiceProxy {
	
	@GetMapping("/api/transaction/withdraw/{accountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int withdrawMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	@GetMapping("/api/transaction/deposite/{accountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int DepositMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type);

	@GetMapping("/api/transaction/miniStatement/{accountNumber}")
	public List<TransactionDetails> MiniStatement(int accountNumber);

	@GetMapping("/api/transaction/customizedStatement/{accountNumber}/{fromDate}/{ToDate}")
	public List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String ToDate);

	@GetMapping("/api/transaction/fundTrasfer/{payersAccountNumber}/{payeesAccountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description,
			int user_type, int transaction_type_id, int account_type);
	

	@GetMapping("/api/transaction/checkBalance/{accountNumber}")
	public double checkBalance(int accountNumber);

}
