package com.xoriant.banking.poc.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.banking.poc.model.TransactionDetails;
import com.xoriant.banking.poc.service.TransactionService;

@RestController
@RequestMapping("/api/transaction")
@CrossOrigin
@RefreshScope
public class TransactionResource {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/withdraw/{accountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int withdrawMoney(@PathVariable int accountNumber, @PathVariable double amount,
			@PathVariable String description, @PathVariable int user_type, int transaction_type_id, int account_type) {
		System.out.println("<<<<<<<<<<<<<<<<<<< EXECUTED BY SERVICE 1  >>>>>>>>>>>>>>>>>");
		return transactionService.withdrawMoney(accountNumber, amount, description, user_type, transaction_type_id,
				account_type);
	}

	@GetMapping("/deposite/{accountNumber}/{amount}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int DepositMoney(@PathVariable int accountNumber, @PathVariable double amount, @PathVariable String description, @PathVariable int user_type,
			int transaction_type_id, int account_type) {
		System.out.println("<<<<<<<<<<<<<<<<<<< EXECUTED BY SERVICE 1  >>>>>>>>>>>>>>>>>");
		return  transactionService.DepositMoney(accountNumber, amount, description, user_type, transaction_type_id, account_type);
	}

	@GetMapping("/miniStatement/{accountNumber}")
	public List<TransactionDetails> MiniStatement(@PathVariable int accountNumber) {
		System.out.println("<<<<<<<<<<<<<<<<<<< EXECUTED BY SERVICE 1  >>>>>>>>>>>>>>>>>");
		return transactionService.MiniStatement(accountNumber);

	}

	@GetMapping("/customizedStatement/{accountNumber}/{fromDate}/{ToDate}")
	public List<TransactionDetails> CustomizedMiniStatement(@PathVariable int accountNumber,
			@PathVariable String fromDate, @PathVariable String ToDate) {
		System.out.println("<<<<<<<<<<<<<<<<<<< EXECUTED BY SERVICE 1  >>>>>>>>>>>>>>>>>");
		return transactionService.CustomizedMiniStatement(accountNumber, fromDate, ToDate);

	}

	@GetMapping("/fundTrasfer/{payersAccountNumber}/{payeesAccountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int fundTransfer(@PathVariable int payersAccountNumber, @PathVariable int payeesAccountNumber,
			@PathVariable double amount, @PathVariable String description, int user_type, int transaction_type_id,
			int account_type) {
		System.out.println("<<<<<<<<<<<<<<<<<<< EXECUTED BY SERVICE 1  >>>>>>>>>>>>>>>>>");
		return transactionService.fundTransfer(payersAccountNumber, payeesAccountNumber, amount, description, user_type,
				transaction_type_id, account_type);

	}

	@GetMapping("/checkBalance/{accountNumber}")
	public double checkBalance(int accountNumber) {
		System.out.println("<<<<<<<<<<<<<<<<<<< EXECUTED BY SERVICE 1  >>>>>>>>>>>>>>>>>");
		return transactionService.checkBalance(accountNumber);

	}

}
