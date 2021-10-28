package com.xoriant.banking.poc.dao.util;

public class DBQueries {

	public final static String CHECK_BALANCE="select balance where account_details where account_number = ?";
	public final static String ACCOUNT_DETAILS="select ad.balance,ad.account_type_id,ad.branch_id,pi.person_type,pi.role_id from account_details ad join customer c join personinfo pi on ad.customer_id=c.customer_id and c.person_id=pi.person_id where account_number= ?";
	public final static String CHANGE_PASSWORD="SELECT u.user_name, u.password, u.security_question, u.security_answer FROM user_login_details u join customer c on u.customer_id=c.customer_id where u.customer_id=?";
	public final static String UPDATE_PASSWORD="update user_login_details set password=? where customer_id= ?";
			
			
}

