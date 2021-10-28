package com.xoriant.banking.poc.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.banking.poc.dao.util.CommonMethods;
import com.xoriant.banking.poc.dao.util.DBQueries;
import com.xoriant.banking.poc.model.DTO;
import com.xoriant.banking.poc.model.TransactionDetails;
import com.xoriant.banking.poc.resource.MailSender;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MailSender sender;

	@Override
	public int withdrawMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type) {

		DTO dto = new DTO();
		DTO obj = dto.getData(accountNumber, jdbcTemplate);
		int balance = (int) obj.getAmount();

		if (balance > amount) {

			int res = jdbcTemplate.update(DBQueries.WITHDRAW_MONEY, CommonMethods.getTransactionId(), amount,
					CommonMethods.getCurrentDate(), obj.account_number, transaction_type_id, description, 0);
			int remainingAmt = (int) (balance - amount);

			int n = jdbcTemplate.update(DBQueries.UPDATE_ACCOUNT_BALNCE, remainingAmt, accountNumber);
			if (n != 0) {
				
				sender.sendWithdrawDetails(amount,remainingAmt);
				return remainingAmt;
			}

		}
		return 0;
	}

	@Override
	public int DepositMoney(int accountNumber, double amount, String description, int user_type,
			int transaction_type_id, int account_type) {

		DTO dto = new DTO();
		DTO obj = dto.getData(accountNumber, jdbcTemplate);
		int balance = (int) obj.getAmount();

		int res = jdbcTemplate.update(DBQueries.DEPOSIT_MONEY, CommonMethods.getTransactionId(), amount,
				CommonMethods.getCurrentDate(), accountNumber, transaction_type_id, description, 0);
		int newBalance = (int) (balance + amount);

		int n = jdbcTemplate.update(DBQueries.UPDATE_ACCOUNT_BALNCE, newBalance, accountNumber);

		if (n != 0) {
			
			sender.sendDepositeDetails(amount,newBalance);
			return newBalance;
		}
		return 0;
	}

	@Override
	public List<TransactionDetails> MiniStatement(int accountNumber) {

		return jdbcTemplate.query(DBQueries.MINI_STATEMENT, (ResultSet rs) -> {
			List<TransactionDetails> transList = new ArrayList<TransactionDetails>();

			while (rs.next()) {
				TransactionDetails details = new TransactionDetails();
				details.setTransactionId(rs.getInt(1));
				details.setAmount(rs.getInt(2));
				details.setTransactionDate(rs.getString(3));
				details.setAccount_number(rs.getInt(4));
				details.setTransaction_type_id(rs.getInt(5));
				details.setDescription(rs.getString(6));

				transList.add(details);
			}
			return transList;

		}, accountNumber);

	}

	@Override
	public List<TransactionDetails> CustomizedMiniStatement(int accountNumber, String fromDate, String ToDate) {

		return jdbcTemplate.query(DBQueries.CUSTOMIZED_MINI_STATEMENT, (ResultSet rs) -> {
			List<TransactionDetails> transList = new ArrayList<TransactionDetails>();

			while (rs.next()) {
				TransactionDetails details = new TransactionDetails();
				details.setTransactionId(rs.getInt(1));
				details.setAmount(rs.getInt(2));
				details.setTransactionDate(rs.getString(3));
				details.setAccount_number(rs.getInt(4));
				details.setTransaction_type_id(rs.getInt(5));
				details.setDescription(rs.getString(6));

				transList.add(details);
			}
			return transList;

		}, accountNumber, fromDate, ToDate);

	}

	@Override
	public int fundTransfer(int payersAccountNumber, int payeesAccountNumber, double amount, String description,
			int user_type, int transaction_type_id, int account_type) {

		DTO dto = new DTO();
		DTO obj = dto.getData(payersAccountNumber, jdbcTemplate);
		int balance = (int) obj.getAmount();

		if (balance > amount) {

			int res = jdbcTemplate.update(DBQueries.WITHDRAW_MONEY, CommonMethods.getTransactionId(), amount,
					CommonMethods.getCurrentDate(), payersAccountNumber, transaction_type_id, description,
					payeesAccountNumber);
			int remainingAmt = (int) (balance - amount);

			int n = jdbcTemplate.update(DBQueries.UPDATE_ACCOUNT_BALNCE, remainingAmt, payersAccountNumber);
			if (n != 0) {
				
				sender.sendFundTransaferDetails(amount,remainingAmt);
				return remainingAmt;
			}

		}
		return 0;
	}

	@Override
	public double checkBalance(int accountNumber) {
		System.out.println("<<<<<<<<<<<<<<<<<INSIDE CHECK BALANCE>>>>>>>>>>>>>>>>>");
		DTO dto = null;
		try {
			dto = DTO.getData(accountNumber, jdbcTemplate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double balance = dto.getAmount();
		
		sender.balanceInquiry(balance);
		
		return balance;
	}

}
