package com.xoriant.banking.poc.model;

public class AccountDetails {

	private int accountId;
	
	private double balance;
	
	private int customerId;
	
	private String account_Type;
	
	private String branchName;
	
	private int branchId;
	
	private int accountsTypeId;
	
	private int transactionId;
	
	private AccountType accountType; //added
	
	private Branch branch;  //added
	
	private PersonInfo personInfo;//added

	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountDetails(int accountId, double balance, int customerId, String account_Type, String branchName,
			int branchId, int accountsTypeId, int transactionId, Branch branch, PersonInfo personInfo) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.customerId = customerId;
		this.account_Type = account_Type;
		this.branchName = branchName;
		this.branchId = branchId;
		this.accountsTypeId = accountsTypeId;
		this.transactionId = transactionId;
		this.branch = branch;
		this.personInfo = personInfo;
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

	public String getAccount_Type() {
		return account_Type;
	}

	public void setAccount_Type(String account_Type) {
		this.account_Type = account_Type;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
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

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", balance=" + balance + ", customerId=" + customerId
				+ ", accountType=" + accountType + ", branchName=" + branchName + ", branchId=" + branchId
				+ ", accountsTypeId=" + accountsTypeId + ", transactionId=" + transactionId + ", branch=" + branch
				+ ", personInfo=" + personInfo + "]";
	}

	

}
