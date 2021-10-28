package com.xoriant.banking.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import com.xoriant.banking.poc.dao.UserDao;
import com.xoriant.banking.poc.dao.UserDaoImpl;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {
	 SpringApplication.run(UserServiceApplication.class, args);
	
	//CommonDao common = ac.getBean(CommonDaoImpl.class);
	
	//int balance = (int) common.checkBalance(4000043);
	
	//System.out.println("<<<<<<<<<<<<<<<<<ACCOUNT BALANCE IS:"+balance);
	
	//int result = common.changePassword("sam@11", "somnath@11", 1000098);
	
	//System.out.println("<<<<<<<<<<<<<<<<<PASSWORD CHANGED SUCCESSFULLY:"+result);
	}

}
