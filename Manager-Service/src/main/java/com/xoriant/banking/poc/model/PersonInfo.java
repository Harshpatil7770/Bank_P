package com.xoriant.banking.poc.model;

public class PersonInfo {

	private int personId;
	
	private String personName;
	
	private Gender gender;
	
	private String dob;
	
	private String mobNumber;
	
	private Address address;
	
	private Roles roles;
	
	private String personType;
	

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PersonInfo(String personName, Gender gender, String dob, String mobNumber,
			Address address, Roles roles, String personType) {
		super();
		
		this.personName = personName;
		this.gender = gender;
		this.dob = dob;
		this.mobNumber = mobNumber;
		this.address = address;
		this.roles = roles;
		this.personType = personType;
		
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getMobNumber() {
		return mobNumber;
	}


	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Roles getRoles() {
		return roles;
	}


	public void setRoles(Roles roles) {
		this.roles = roles;
	}


	public String getPersonType() {
		return personType;
	}


	public void setPersonType(String personType) {
		this.personType = personType;
	}


	@Override
	public String toString() {
		return "PersonInfo [personId=" + personId + ", personName=" + personName + ", gender=" + gender + ", dob=" + dob
				+ ", mobNumber=" + mobNumber + ", address=" + address + ", roles=" + roles + ", personType="
				+ personType + "]";
	}


	
}
