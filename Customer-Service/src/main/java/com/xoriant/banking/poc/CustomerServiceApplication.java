package com.xoriant.banking.poc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
//			ApplicationContext ac=SpringApplication.run(CustomerServiceApplication.class, args);
//		CustomerDaoImpl customerDaoImpl = ac.getBean(CustomerDaoImpl.class);
//		Address address=new Address();
//		address.setDoorNo("200");
//		address.setCity("Pune");
//		address.setArea("Kondhawa-bk");
//		address.setState("Maharashtra");
//		address.setPincode("411222");
//		address.setAddressType("CUSTOMER");
//		customerDaoImpl.editAddress(address,1000098);
//		
			
	}

}
