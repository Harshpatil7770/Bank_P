package com.xoriant.banking.poc.model;

public class UserLoginDetails {

private int loginId;
	
	private String userName;
	
	private String password;
	
	private String rollType;
	
	private String securityQuestion;
	
	private String securityAnswer;
	
	private int customerId;
	
	private int managerId;

	public UserLoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginDetails(int loginId, String userName, String password, String rollType, String securityQuestion,
			String securityAnswer, int customerId, int managerId) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
		this.rollType = rollType;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.customerId = customerId;
		this.managerId = managerId;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRollType() {
		return rollType;
	}

	public void setRollType(String rollType) {
		this.rollType = rollType;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "UserLoginDetails [loginId=" + loginId + ", userName=" + userName + ", password=" + password
				+ ", rollType=" + rollType + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + ", customerId=" + customerId + ", managerId=" + managerId + "]";
	}
}
