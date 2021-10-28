package com.xoriant.banking.poc.dao.util;

public class DBQueries {
	//for saving account
	public final static String  s_interest_rate="15", s_minimum_balance="1000",
			s_transaction_limit="10", s_transaction_amount_limit="20000";
	
	//for current account
		public final static String  c_interest_rate="10", c_minimum_balance="5000",
				c_transaction_limit="20", c_transaction_amount_limit="50000";

	public final static String ALL_CUSTOMER_LIST="select * from customer";
	public final static String VIEW_ACCOUNT_INFO="select * from account_details";
	public static final String ADD_NEW_PERSON="insert into personinfo values(?,?,?,?,?,?,?,?)";
	public static final String ADD_NEW_CUSTOMER="insert into customer values(?,?)";
	public static final String ADD_NEW_MANAGER="insert into manager values(?,?)";
	public static final String ADD_NEW_ADDRESS="insert into address values(?,?,?,?,?,?,?,?,?)";
	public static final String ADD_NEW_BRANCH="insert into branch values(?,?,?,?)";
	public static final String UPDATE_CUSTOMER="update  personinfo set personName=?, dob=?, phone_number=?   where person_id =(SELECT person_id FROM \n"
			+ "state_bank.customer where customer_id=?);";
	
	public static final String SELCET_PERSON_ID="SELECT person_id FROM customer where customer_id=?; ";

	
	public static final String DELETE_CUSTOMER_Q0=" delete  from transaction_details where account_number=(select  account_number from account_details where customer_id=?);";
	public static final String DELETE_CUSTOMER_Q1="delete  FROM  person_account where customer_id=?;";
	public static final String DELETE_CUSTOMER_Q2="delete FROM  account_details where customer_id=?;";
	
	public static final String DELETE_CUSTOMER_Q3="delete  FROM user_login_details where customer_id=? ;";
	public static final String DELETE_CUSTOMER_Q4="delete  FROM  customer where customer_id=?; ";

	public static final String DELETE_CUSTOMER_Q5="DELETE  from personinfo where person_id=? ;";
	
	public static final String CHECK_CUSTOMER_ID="SELECT EXISTS(SELECT customer_id FROM customer where customer_id=?);";

	public static final String ADD_NEW_ACCOUNT="insert into account_details values(?,?,?,?,?)";
	public static final String ADD_NEW_PERSON_ACCOUNT="insert into person_account(customer_id, manager_id, account_number) values(?,?,?)";
	
	
	public static final String ADD_NEW_CURRENT_ACCOUNT="insert into currentaccount values(?,?,?,?)";
	
	public static final String ADD_NEW_SAVING_ACCOUNT="insert into savingaccount values(?,?,?,?,?)";
} 
