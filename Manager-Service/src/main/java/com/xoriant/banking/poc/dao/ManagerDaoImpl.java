package com.xoriant.banking.poc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.banking.poc.dao.util.CommonMethods;
import com.xoriant.banking.poc.dao.util.DBQueries;
import com.xoriant.banking.poc.model.Branch;
import com.xoriant.banking.poc.model.Customer;
import com.xoriant.banking.poc.model.Manager;
import com.xoriant.banking.poc.model.PersonInfo;

@Repository
public class ManagerDaoImpl implements ManagerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Branch addNewBranch(Branch branch) {
		
		int res = jdbcTemplate.update(DBQueries.ADD_NEW_BRANCH,branch.getBranchId(), branch.getBranchName(),
				branch.getIfscCode(),branch.getMicrCode());

		if (res != 0) {
			return branch;
		}

		return null;	
	}
	
@Override
public PersonInfo addNewPerson(PersonInfo personInfo) {
	personInfo.getAddress().setAddressId(CommonMethods.getAddressId());
	personInfo.setPersonId(CommonMethods.getPersonId());
	System.out.println("PERSON ID=="+personInfo.getPersonId());
	System.out.println("ADDRESS ID=="+personInfo.getAddress().getAddressId());
	
	/*
	 * System.out.println("Data="+personInfo.getAddress().getAddressId()+",next="+
	 * personInfo.getAddress().getDoorNo()+",next="+
	 * personInfo.getAddress().getCity()+",next="+personInfo.getAddress().getArea()+
	 * ",next="+
	 * personInfo.getAddress().getState()+",next="+personInfo.getAddress().
	 * getPincode()+",next="+
	 * personInfo.getAddress().getAddressType()+",next="+personInfo.getAddress().
	 * getBranchId()+",next="+ personInfo.getPersonId());
	 */
	int res = jdbcTemplate.update(DBQueries.ADD_NEW_ADDRESS,personInfo.getAddress().getAddressId(),personInfo.getAddress().getDoorNo(),
			personInfo.getAddress().getCity(),personInfo.getAddress().getArea(),
			personInfo.getAddress().getState(),personInfo.getAddress().getPincode(),
			personInfo.getAddress().getAddressType(),personInfo.getAddress().getBranchId(),
			personInfo.getPersonId());
	
	System.out.println("================Address Inserted====================");
	
		if (personInfo.getAddress().getAddressId() != 0) {

			personInfo.setPersonId(CommonMethods.getPersonId());
			int res1 = jdbcTemplate.update(DBQueries.ADD_NEW_PERSON,personInfo.getPersonId(),personInfo.getPersonName(),
					personInfo.getGender().getId(), personInfo.getDob(), personInfo.getMobNumber(),personInfo.getAddress().getAddressId(),
					personInfo.getRoles().getRole_id(),personInfo.getPersonType());
			
			System.out.println("==================Person Inserted=======================");
			
			if(personInfo.getPersonType().equals("CUSTOMER")) {
				
				Customer customer= new Customer();
				customer.setCustomerId(CommonMethods.getCustomerId());
				int res2 = jdbcTemplate.update(DBQueries.ADD_NEW_CUSTOMER,customer.getCustomerId(),personInfo.getPersonId());
				System.out.println("=================Customer Inserted=======================");
			}else {
				Manager manager= new Manager();
				manager.setManagerId(CommonMethods.getManagerId());
				int res3 = jdbcTemplate.update(DBQueries.ADD_NEW_MANAGER,manager.getManagerId(),personInfo.getPersonId());
				
				System.out.println("==================Manager Inserted=======================");
			}
			return personInfo;
		}

		return null;	
	}

@Override
public int updateCustomer(int accountNumber,PersonInfo personInfo) {
	
	if(personInfo.getPersonType().equals("MANAGER"))
	{
		int res = jdbcTemplate.update(DBQueries.UPDATE_CUSTOMER,personInfo.getPersonName(),personInfo.getDob(),
				personInfo.getMobNumber(),accountNumber);
		
		System.out.println("================Customer Updated Inserted====================");
		
	}
	else
		System.out.println("Customer updation permission restricted...!");
 

		return 1;	
	}

@Override
public String getPersonId(int customer_id) {
	
	return (String)jdbcTemplate.queryForObject(DBQueries.SELCET_PERSON_ID, String.class, customer_id) ;
  }
 
@Override
public Boolean checkCustomer_id(int customer_id) {
	return jdbcTemplate.queryForObject(DBQueries.CHECK_CUSTOMER_ID, Boolean.class, customer_id);
 
  }

@Override
public void deleteCustomer(int customer_id) {
	System.out.println("Inside delete method");
	//System.out.println("METHOD value return="+checkCustomer_id(customer_id));
	
	if( checkCustomer_id(customer_id) ==true)
	{
		System.out.println("==========CUSTOMER ID present into DB===="+customer_id);
		String personId=getPersonId(customer_id);
		int r0 = jdbcTemplate.update(DBQueries.DELETE_CUSTOMER_Q0,customer_id );
		int r1 = jdbcTemplate.update(DBQueries.DELETE_CUSTOMER_Q1,customer_id );
		int r2 = jdbcTemplate.update(DBQueries.DELETE_CUSTOMER_Q2,customer_id );
		int r3 = jdbcTemplate.update(DBQueries.DELETE_CUSTOMER_Q3,customer_id );
		System.out.println("==========Person ID ID===="+personId);
		int r4= jdbcTemplate.update(DBQueries.DELETE_CUSTOMER_Q4,customer_id );
//		
		int r5= jdbcTemplate.update(DBQueries.DELETE_CUSTOMER_Q5,personId );
		
		System.out.println("========= CUSTOMER DELETED===="+customer_id);
		 
	}
	else
		System.out.println("==========Not present CUSTOMER ID===="+customer_id);
  
		 
	}

@Override
public void addAccount(String roleType,int accountId,int balance,int customerId,int managerId,int accountTypeId,int branchId)
{
	if(roleType.equals("MANAGER"))
	{
		int res1 = jdbcTemplate.update(DBQueries.ADD_NEW_ACCOUNT,accountId,balance,customerId,accountTypeId,branchId);
		int res2 = jdbcTemplate.update(DBQueries.ADD_NEW_PERSON_ACCOUNT, customerId,managerId,accountId);
		if(accountTypeId==1)
		{
			int res3 = jdbcTemplate.update(DBQueries.ADD_NEW_SAVING_ACCOUNT,accountId,DBQueries.s_interest_rate,DBQueries.s_minimum_balance,DBQueries.s_transaction_limit,DBQueries.s_transaction_amount_limit);
			
		}
		else
		{
			int res4 = jdbcTemplate.update(DBQueries.ADD_NEW_CURRENT_ACCOUNT,accountId,DBQueries.c_transaction_limit, DBQueries.c_minimum_balance,DBQueries.c_transaction_amount_limit );
			
		}
		System.out.println("================New Account Inserted====================");
		
	}
	else
		System.out.println(" permission restricted...!");
 
	
}

}
