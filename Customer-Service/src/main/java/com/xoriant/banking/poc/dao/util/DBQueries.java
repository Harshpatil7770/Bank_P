package com.xoriant.banking.poc.dao.util;

public class DBQueries {

	public static final String EDIT_ADDRESS="update address set door_no=?,city=?, area=?, state=?, pincode=?, address_type=? where person_id=(SELECT person_id FROM customer where customer_id=?);";
	public static final String VIEW_ACCOUNT_INFO="select * from account_details bd inner join account_type a on bd.account_type_id=a.account_type_id inner join branch b on bd.branch_id=b.branch_id";
    public static final String VIEW_ACCOUNT_LIST="select ad.account_number,ad.balance,ad.customer_id,a.account_type,b.branch_name from account_details ad inner join account_type a on ad.account_type_id=a.account_type_id join branch b on ad.branch_id=b.branch_id where customer_id=?";
}

