package com.xoriant.banking.poc.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.banking.poc.model.AccountDetails;
import com.xoriant.banking.poc.model.Address;
import com.xoriant.banking.poc.model.TransactionDetails;
import com.xoriant.banking.poc.service.CustomerService;



@RestController
@RequestMapping("/api/customer")
@CrossOrigin
@RefreshScope
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	@PutMapping("/editAddress/{customer_id}")
	public Address editAddress(@RequestBody Address address,@PathVariable int customer_id) {
		return customerService.editAddress(address,customer_id);
	}
	
	@GetMapping("/findAccountDetails")
	public List<AccountDetails> findAccountDetails(){
		return customerService.findAccountDetails();
	}
	
	@GetMapping("/viewAccountList")
	public List<AccountDetails> viewAllAccounts(){
		return customerService.viewAllAccounts();
	}
	
	@GetMapping("/withdraw/{accountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int withdrawMoney(@PathVariable int accountNumber, @PathVariable double amount,@PathVariable String description,@PathVariable int user_type,
			int transaction_type_id, int account_type) {
		int balance = customerService.withdrawMoney(accountNumber, amount, description, user_type, transaction_type_id, account_type);
		
		return balance;
	}
	@GetMapping("/deposite/{accountNumber}/{amount}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int DepositMoney(@PathVariable int accountNumber, @PathVariable double amount, @PathVariable String description, @PathVariable int user_type,
			int transaction_type_id, int account_type) {
		
		int balance = customerService.DepositMoney(accountNumber, amount, description, user_type, transaction_type_id, account_type);
		return balance;
		
		
	}
	@GetMapping("/miniStatement/{accountNumber}")
	public List<TransactionDetails> MiniStatement(@PathVariable int accountNumber){
		
		List<TransactionDetails> list =customerService.MiniStatement(accountNumber);
		
		return list;
		
	}
	@GetMapping("/customizedStatement/{accountNumber}/{fromDate}/{ToDate}")
	public List<TransactionDetails> CustomizedMiniStatement(@PathVariable int accountNumber, @PathVariable String fromDate, @PathVariable String ToDate){
		
		List<TransactionDetails> list = customerService.CustomizedMiniStatement(accountNumber, fromDate, ToDate);
		return list;
	}
	@GetMapping("/fundTrasfer/{payersAccountNumber}/{payeesAccountNumber}/{amount}/{description}/{user_type}/{transaction_type_id}/{account_type}")
	public int fundTransfer(@PathVariable int payersAccountNumber, @PathVariable int payeesAccountNumber, @PathVariable double amount, @PathVariable String description,
			int user_type, int transaction_type_id, int account_type) {
		
		int balance = customerService.fundTransfer(payersAccountNumber, payeesAccountNumber, amount, description, user_type, transaction_type_id, account_type);
		return balance;
		
	}
	
	@GetMapping("/checkBalance/{accountNumber}")
	public double checkBalance(int accountNumber) {
		
		double balance = customerService.checkBalance(accountNumber);
		
		return balance;
	}

	@GetMapping("/changePassword/{oldPassword}/{newPassword}/{customer_id}")
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		
		int balance = customerService.changePassword(oldPassword, newPassword, customer_id);
		return balance;
	}

}
