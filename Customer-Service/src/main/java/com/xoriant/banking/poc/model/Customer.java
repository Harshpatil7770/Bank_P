package com.xoriant.banking.poc.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

import com.xoriant.banking.poc.dao.util.CommonMethods;

public class Customer {
	
	private int customerId;
	
	private int personId;
	
	
	List<AccountDetails> accList = new ArrayList<AccountDetails>();


	public Customer(int customerId, int personId) {
		super();
		this.customerId = customerId;
		this.personId = personId;
	}


	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", personId=" + personId + "]";
	}

}
