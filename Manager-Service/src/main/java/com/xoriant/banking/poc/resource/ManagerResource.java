package com.xoriant.banking.poc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.banking.poc.model.Branch;
import com.xoriant.banking.poc.model.PersonInfo;
import com.xoriant.banking.poc.service.ManagerService;

@RestController
@RequestMapping("/api/manager")
@CrossOrigin
@RefreshScope
public class ManagerResource {
	
	@Autowired
	ManagerService managerService;
	
	
	public Branch addNewBranch(Branch branch) {
		
		return managerService.addNewBranch(branch);
	}

	public PersonInfo addNewPerson(PersonInfo personInfo) {
		
		return managerService.addNewPerson(personInfo);
	}

	public int updateCustomer(int accountNumber, PersonInfo personInfo)
	{
		return managerService.updateCustomer(accountNumber, personInfo);
	}

	public String getPersonId(int customer_id) {
		
		return managerService.getPersonId(customer_id);
	}

	public Boolean checkCustomer_id(int customer_id) {
		
		return managerService.checkCustomer_id(customer_id);
	}

	public void deleteCustomer(int customer_id) {
		
		managerService.deleteCustomer(customer_id);
	}

	public void addAccount(String roleType, int accountId, int balance, int customerId, int managerId, int accountTypeId,
			int branchId) {
		managerService.addAccount(roleType, accountId, balance, customerId, managerId, accountTypeId, branchId);
		
	}
	
	

}
