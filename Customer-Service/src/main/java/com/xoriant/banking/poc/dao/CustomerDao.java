package com.xoriant.banking.poc.dao;

import java.util.List;

import com.xoriant.banking.poc.model.AccountDetails;
import com.xoriant.banking.poc.model.Address;
import com.xoriant.banking.poc.model.PersonAccount;
import com.xoriant.banking.poc.model.PersonInfo;

public interface CustomerDao {

	public Address editAddress(Address address,int customer_id);
	
	public List<AccountDetails> findAccountDetails();
	
public List<AccountDetails> viewAllAccounts();
//	public List<PersonAccount> viewAllAccounts();
}
