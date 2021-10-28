package com.xoriant.banking.poc.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.banking.poc.dao.util.CommonMethods;
import com.xoriant.banking.poc.dao.util.DBQueries;
import com.xoriant.banking.poc.model.AccountDetails;
import com.xoriant.banking.poc.model.AccountType;
import com.xoriant.banking.poc.model.Address;
import com.xoriant.banking.poc.model.Branch;
import com.xoriant.banking.poc.model.PersonAccount;
import com.xoriant.banking.poc.model.PersonInfo;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Address editAddress(Address address,int customer_id) {     
     int res= jdbcTemplate.update(DBQueries.EDIT_ADDRESS,address.getDoorNo(),address.getCity(),
    		 address.getArea(),address.getState(),address.getPincode(),address.getAddressType(),customer_id);
		System.out.println("================Address Changed==============");
		
		if (res != 0) {
			return address;
		}
	return null;
}

	@Override
	public List<AccountDetails> findAccountDetails() {
		
		return jdbcTemplate.query(DBQueries.VIEW_ACCOUNT_INFO,(ResultSet rs)->{
			List<AccountDetails> accountDetails=new ArrayList<AccountDetails>();
			while(rs.next()) {
				AccountDetails accontD=new AccountDetails();
				AccountType accountType=new AccountType();
				Branch branch=new Branch();
				
				accontD.setAccountId(rs.getInt("account_number"));
				accontD.setAccountsTypeId(rs.getInt("account_type_id"));
				//accontDetails.setAccountType(rs.getString("account_type"));
				accontD.setBalance(rs.getDouble("balance"));
			    accontD.setBranchId(rs.getInt("branch_id"));
			    accontD.setCustomerId(rs.getInt("customer_id"));
			    accontD.setTransactionId(rs.getInt("transaction_id"));
			    
			    accountType.setAccountType(rs.getString("account_type"));
			    accountType.setAccountTypeId(rs.getInt("account_type_id"));
			    
			    branch.setBranchId(rs.getInt("branch_id"));
			    branch.setBranchName(rs.getString("branch_name"));
			    branch.setIfscCode(rs.getString("ifsc_code"));
			    branch.setMicrCode(rs.getString("micr_code"));	
			    
			    accontD.setBranch(branch);
			    accontD.setAccountType(accountType);
			    accountDetails.add(accontD);
			    
			    
			}
			return accountDetails;
		});
	
	}

	@Override
	public List<AccountDetails> viewAllAccounts() {
		return jdbcTemplate.query(DBQueries.VIEW_ACCOUNT_LIST,(ResultSet rs)->{
			List<AccountDetails> accountDetails=new ArrayList<AccountDetails>();
			while(rs.next()) {
				AccountDetails accontD=new AccountDetails();
				accontD.setAccountId(rs.getInt(1));
				accontD.setBalance(rs.getDouble(2));
				accontD.setCustomerId(rs.getInt(3));
				accontD.setAccount_Type(rs.getString(4));
				accontD.setBranchName(rs.getString(5));
				
				accountDetails.add(accontD);			
				
			}
			return accountDetails;
		});
	}	
	
}
