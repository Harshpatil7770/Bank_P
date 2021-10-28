package com.xoriant.banking.poc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.banking.poc.dao.util.DBQueries;
import com.xoriant.banking.poc.model.DTO;

@Repository
public class UserDaoImpl implements UserDao {
 
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public int changePassword(String oldPassword, String newPassword, int customer_id) {
		
		DTO userDTO = new DTO();
		DTO dto = userDTO.getUserDetails(customer_id, jdbcTemplate);
		System.out.println("<<<<<<<<<<<<<<<<<UPDATE_PASSWORD>>>>>>>>>>>>>>>>>"+dto.getPassword());
				if(dto.getPassword().equals(oldPassword)) {
					
					int n = jdbcTemplate.update(DBQueries.UPDATE_PASSWORD,
							newPassword, customer_id);
					
					if (n != 0) {
						return n;
					}
					
				}
				return 0;
				
			}
	
	
}
