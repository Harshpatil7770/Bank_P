package com.xoriant.banking.poc.model;

public class TransactionDetails {

private int transactionId;
	
	private double amount;
	
	private String transactionDate;
	
	private String description;
	
	private int payeesAccountNumber;
	
	private int account_number;
	
	private int transaction_type_id;
	
	

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getTransaction_type_id() {
		return transaction_type_id;
	}

	public void setTransaction_type_id(int transaction_type_id) {
		this.transaction_type_id = transaction_type_id;
	}

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(int transactionId, double amount, String transactionDate, String description,
			int payeesAccountNumber) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.description = description;
		this.payeesAccountNumber = payeesAccountNumber;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPayeesAccountNumber() {
		return payeesAccountNumber;
	}

	public void setPayeesAccountNumber(int payeesAccountNumber) {
		this.payeesAccountNumber = payeesAccountNumber;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transactionId=" + transactionId + ", amount=" + amount + ", transactionDate="
				+ transactionDate + ", description=" + description + ", payeesAccountNumber=" + payeesAccountNumber
				+ "]";
	}
	
}
