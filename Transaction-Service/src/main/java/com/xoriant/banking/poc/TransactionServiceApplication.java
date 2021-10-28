package com.xoriant.banking.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class TransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
		/*
		 * ApplicationContext ac =
		 * 
		 * TransactionDaoImpl trans = ac.getBean(TransactionDaoImpl.class);
		 */
		
		//int result = trans.DepositMoney(4000043, 30000, "10000 depoisted", 1, 1, 1);
		//if(result>1)
		
		/*
		 * int balance = trans.withdrawMoney(4000043, 10000, "I have widraw 10000", 1,
		 * 2,1); System.out.
		 * println("==================Money widrawed New Balance Is==============="
		 * +balance);
		 */
		
		/*
		 * List<TransactionDetails> statementList = trans.MiniStatement(4000043);
		 * System.out.
		 * println("==================Mini statement 5 last transaction==============="
		 * +statementList);
		 */
		//int balance = trans.fundTransfer(4000043, 4000010, 500, "500 send to sagar", 1, 3, 2);
		 //System.out.println("==================Money transfer to sagar New Balance Is==============="+balance);
		/*
		 * List<TransactionDetails> statementList =
		 * trans.CustomizedMiniStatement(4000043, "2021-10-15,", "2021-10-26");
		 * System.out.println(statementList.size()
		 * +"==================Customised Mini statement==============="+statementList);
		 */
	}

}
