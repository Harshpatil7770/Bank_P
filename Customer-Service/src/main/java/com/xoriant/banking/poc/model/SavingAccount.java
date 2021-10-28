package com.xoriant.banking.poc.model;

public class SavingAccount {

	 private int savingAccountId;
	 
	 private double interestRate;
	 
	 private double minimumBalance;
	 
	 private int transactionLimit;
	 
	 private double transactionAmountLimit;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int savingAccountId, double interestRate, double minimumBalance, int transactionLimit,
			double transactionAmountLimit) {
		super();
		this.savingAccountId = savingAccountId;
		this.interestRate = interestRate;
		this.minimumBalance = minimumBalance;
		this.transactionLimit = transactionLimit;
		this.transactionAmountLimit = transactionAmountLimit;
	}

	public int getSavingAccountId() {
		return savingAccountId;
	}

	public void setSavingAccountId(int savingAccountId) {
		this.savingAccountId = savingAccountId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public int getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(int transactionLimit) {
		this.transactionLimit = transactionLimit;
	}

	public double getTransactionAmountLimit() {
		return transactionAmountLimit;
	}

	public void setTransactionAmountLimit(double transactionAmountLimit) {
		this.transactionAmountLimit = transactionAmountLimit;
	}

	@Override
	public String toString() {
		return "SavingAccount [savingAccountId=" + savingAccountId + ", interestRate=" + interestRate
				+ ", minimumBalance=" + minimumBalance + ", transactionLimit=" + transactionLimit
				+ ", transactionAmountLimit=" + transactionAmountLimit + "]";
	}
	 
	 
}
