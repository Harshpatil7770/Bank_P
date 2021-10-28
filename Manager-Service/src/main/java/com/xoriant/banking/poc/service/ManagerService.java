package com.xoriant.banking.poc.service;

import com.xoriant.banking.poc.model.Branch;
import com.xoriant.banking.poc.model.PersonInfo;

public interface ManagerService {

	public Branch addNewBranch(Branch branch);

	public PersonInfo addNewPerson(PersonInfo personInfo);

	public int updateCustomer(int accountNumber, PersonInfo personInfo);

	public String getPersonId(int customer_id);

	public Boolean checkCustomer_id(int customer_id);

	public void deleteCustomer(int customer_id);

	public void addAccount(String roleType, int accountId, int balance, int customerId, int managerId, int accountTypeId,
			int branchId);
}
