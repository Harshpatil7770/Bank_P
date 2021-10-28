package com.xoriant.banking.poc.model;

public class TransactionType {

	private int transactionTypeId;
	
	private String transactionName;

	public TransactionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionType(int transactionTypeId, String transactionName) {
		super();
		this.transactionTypeId = transactionTypeId;
		this.transactionName = transactionName;
	}

	public int getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(int transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	@Override
	public String toString() {
		return "TransactionalType [transactionTypeId=" + transactionTypeId + ", transactionName=" + transactionName
				+ "]";
	}
}
