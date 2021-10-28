package com.xoriant.banking.poc.model;

public class AccountDetails {

	private int accountId;
	
	private double balance;
	
	private int customerId;
	
	private String accountType;
	
	private int branchId;
	
	private int accountsTypeId;
	
	private int transactionId;

	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountDetails(int accountId, double balance, int customerId, String accountType, int branchId,
			int accountsTypeId, int transactionId) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.customerId = customerId;
		this.accountType = accountType;
		this.branchId = branchId;
		this.accountsTypeId = accountsTypeId;
		this.transactionId = transactionId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getAccountsTypeId() {
		return accountsTypeId;
	}

	public void setAccountsTypeId(int accountsTypeId) {
		this.accountsTypeId = accountsTypeId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", balance=" + balance + ", customerId=" + customerId
				+ ", accountType=" + accountType + ", branchId=" + branchId + ", accountsTypeId=" + accountsTypeId
				+ ", transactionId=" + transactionId + "]";
	}
	
	
}
