package com.xoriant.banking.poc.model;

import java.time.LocalDateTime;

public class TransactionDetails {

private int transactionId;
	
	private double amount;
	
	private LocalDateTime transactionDate;
	
	private String description;
	
	private int payeesAccountNumber;

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(int transactionId, double amount, LocalDateTime transactionDate, String description,
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

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
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
