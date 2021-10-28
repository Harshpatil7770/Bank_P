package com.xoriant.banking.poc.model;

import java.sql.ResultSet;

import org.springframework.jdbc.core.JdbcTemplate;

import com.xoriant.banking.poc.dao.util.DBQueries;

public class DTO {

	public String user_type;
	
	public int account_type_id;
	
	public int transaction_type;
	
	public int account_number;
	
	public static int amount;
	
	public String description;
	
	public int person_id;
	
	public String person_type;
	
	public int branch_id;
	
	public int customer_id;
	
	public static String user_name;
	
	public static String password;
	
	public static String security_question;
	
	public static String security_answer;
	
	
	@Override
	public String toString() {
		return "DTO [user_type=" + user_type + ", account_type_id=" + account_type_id + ", transaction_type="
				+ transaction_type + ", account_number=" + account_number + ", description=" + description
				+ ", person_id=" + person_id + ", person_type=" + person_type + ", branch_id=" + branch_id
				+ ", customer_id=" + customer_id + ", user_name=" + user_name + ", password=" + password
				+ ", security_question=" + security_question + ", security_answer=" + security_answer + "]";
	}


	public String getUser_type() {
		return user_type;
	}


	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}


	public int getAccount_type_id() {
		return account_type_id;
	}


	public void setAccount_type_id(int account_type_id) {
		this.account_type_id = account_type_id;
	}


	public int getTransaction_type() {
		return transaction_type;
	}


	public void setTransaction_type(int transaction_type) {
		this.transaction_type = transaction_type;
	}


	public int getAccount_number() {
		return account_number;
	}


	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}


	public static int getAmount() {
		return amount;
	}


	public static void setAmount(int amount) {
		DTO.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPerson_id() {
		return person_id;
	}


	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}


	public String getPerson_type() {
		return person_type;
	}


	public void setPerson_type(String person_type) {
		this.person_type = person_type;
	}


	public int getBranch_id() {
		return branch_id;
	}


	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSecurity_question() {
		return security_question;
	}


	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}


	public String getSecurity_answer() {
		return security_answer;
	}


	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}


	public DTO(String user_type, int account_type_id, int transaction_type, int account_number, String description,
			int person_id, String person_type, int branch_id, int customer_id, String user_name, String password,
			String security_question, String security_answer) {
		super();
		this.user_type = user_type;
		this.account_type_id = account_type_id;
		this.transaction_type = transaction_type;
		this.account_number = account_number;
		this.description = description;
		this.person_id = person_id;
		this.person_type = person_type;
		this.branch_id = branch_id;
		this.customer_id = customer_id;
		this.user_name = user_name;
		this.password = password;
		this.security_question = security_question;
		this.security_answer = security_answer;
	}


	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static DTO getData(int accountNumber, JdbcTemplate jdbcTemplate) {
		return jdbcTemplate.query(DBQueries.ACCOUNT_DETAILS, (ResultSet rs) -> {
			if (rs.next()) {
				
				DTO obj= new DTO();
				try {
					obj.setAmount(rs.getInt(1));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				return obj;
				
			}
			return null;
			
		},accountNumber);
	}
	
	public static DTO getUserDetails(int customer_id,JdbcTemplate jdbcTemplate) {
		
		return jdbcTemplate.query(DBQueries.CHANGE_PASSWORD, (ResultSet rs) -> {
			if (rs.next()) {
				
				DTO obj= new DTO();
				
				obj.setUser_name(rs.getString(1));
				obj.setPassword(rs.getString(2));
				obj.setSecurity_question(rs.getString(3));
				obj.setSecurity_answer(rs.getString(4));
				
				return obj;
				
			}
			
			return null;
			
		},customer_id);
		

	}
}
