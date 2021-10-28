package com.xoriant.banking.poc.model;

public class AccountType {

	 private int accountTypeId;
	 
	 private String accountType;

	public AccountType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountType(int accountTypeId, String accountType) {
		super();
		this.accountTypeId = accountTypeId;
		this.accountType = accountType;
	}

	public int getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "AccountType [accountTypeId=" + accountTypeId + ", accountType=" + accountType + "]";
	}
	 
	 
}
