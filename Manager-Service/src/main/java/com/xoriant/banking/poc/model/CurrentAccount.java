package com.xoriant.banking.poc.model;

public class CurrentAccount {

	 private int currentAccountid;
	 
	 private int transactionLimit;
	 
	 private double minimumBalance;
	 
	 private double transactionAmountLimit;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int currentAccountid, int transactionLimit, double minimumBalance,
			double transactionAmountLimit) {
		super();
		this.currentAccountid = currentAccountid;
		this.transactionLimit = transactionLimit;
		this.minimumBalance = minimumBalance;
		this.transactionAmountLimit = transactionAmountLimit;
	}

	public int getCurrentAccountid() {
		return currentAccountid;
	}

	public void setCurrentAccountid(int currentAccountid) {
		this.currentAccountid = currentAccountid;
	}

	public int getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(int transactionLimit) {
		this.transactionLimit = transactionLimit;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getTransactionAmountLimit() {
		return transactionAmountLimit;
	}

	public void setTransactionAmountLimit(double transactionAmountLimit) {
		this.transactionAmountLimit = transactionAmountLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [currentAccountid=" + currentAccountid + ", transactionLimit=" + transactionLimit
				+ ", minimumBalance=" + minimumBalance + ", transactionAmountLimit=" + transactionAmountLimit + "]";
	}
	 
	 
	 
	 
}
