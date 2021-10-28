package com.xoriant.banking.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoriant.banking.poc.dao.ManagerDao;
import com.xoriant.banking.poc.dao.ManagerDaoImpl;
import com.xoriant.banking.poc.dao.util.CommonMethods;
import com.xoriant.banking.poc.model.Address;
import com.xoriant.banking.poc.model.Customer;
import com.xoriant.banking.poc.model.Gender;
import com.xoriant.banking.poc.model.Manager;
import com.xoriant.banking.poc.model.PersonInfo;
import com.xoriant.banking.poc.model.Roles;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
public class ManagerServiceApplication {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ac = SpringApplication.run(ManagerServiceApplication.class, args);
		
		
		  //ManagerDao manager= ac.getBean(ManagerDaoImpl.class);
		  
			/*
			 * Branch branch = new Branch(); branch.setBranchId(2);
			 * branch.setBranchName("Wakad"); branch.setIfscCode("BKID000044");
			 * branch.setMicrCode("BKID000044");
			 * manager.addNewBranch(branch);
			 */
		  Gender gender = new Gender(1,"FEMALE");
		  Roles roles = new Roles(1,"CUSTOMER");
		  Address address = new Address(201,"Sangamner","Shivaji Nagar", "Maharashtra", "414592","CUSTOMER",1);
		  PersonInfo personInfo = new PersonInfo("Sagar Nawale",gender,"2021/10/10","9503732154",address,roles,"CUSTOMER");
		  
		  Customer customer = new Customer();
		  Manager mnger = new Manager();
		  
		
		//  System.out.println(manager.addNewPerson(personInfo));
		  
		  personInfo.setPersonName("Sagar Nawale");;
		  personInfo.setDob("1998/10/02");
		  personInfo.setMobNumber("7038167705");
		  personInfo.setPersonType("MANAGER");;
		//  System.out.println(manager.updateCustomer(1000098,personInfo));
		  
		 // manager.deleteCustomer(1);
		  
		  String roleType="MANAGER";
		  int accountId=CommonMethods.getAccountId();
		  int balance=500;
		  int customerId=10000867;
		  int managerId=1;
		  int accountTypeId=1;
		  int branchId=1;
 		  
		//  manager.addAccount(roleType,accountId,balance,customerId ,managerId,accountTypeId,branchId);
		   
		   
		  
		  
		 
	}

}
