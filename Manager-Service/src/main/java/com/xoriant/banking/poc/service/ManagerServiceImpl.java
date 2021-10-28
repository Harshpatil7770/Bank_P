package com.xoriant.banking.poc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xoriant.banking.poc.dao.ManagerDao;
import com.xoriant.banking.poc.model.Branch;
import com.xoriant.banking.poc.model.PersonInfo;

public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerDao managerDao;	
	
	@Autowired
	private TransactionServiceProxy transactionServiceProxy;
	
	@Override
	public Branch addNewBranch(Branch branch) {
		// TODO Auto-generated method stub
		return managerDao.addNewBranch(branch);
	}

	@Override
	public PersonInfo addNewPerson(PersonInfo personInfo) {
		// TODO Auto-generated method stub
		return managerDao.addNewPerson(personInfo);
	}

	@Override
	public int updateCustomer(int accountNumber, PersonInfo personInfo) {
		// TODO Auto-generated method stub
		return managerDao.updateCustomer(accountNumber, personInfo);
	}

	@Override
	public String getPersonId(int customer_id) {
		// TODO Auto-generated method stub
		return managerDao.getPersonId(customer_id);
	}

	@Override
	public Boolean checkCustomer_id(int customer_id) {
		// TODO Auto-generated method stub
		return managerDao.checkCustomer_id(customer_id);
	}

	@Override
	public void deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addAccount(String roleType, int accountId, int balance, int customerId, int managerId,
			int accountTypeId, int branchId) {
		
		
	}

}
