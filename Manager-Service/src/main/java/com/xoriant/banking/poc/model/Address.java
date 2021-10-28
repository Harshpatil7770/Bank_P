package com.xoriant.banking.poc.model;

public class Address {

	private int addressId;
	
	private int doorNo;
	
	private String city;
	
	private String area;
	
	private String state;
	
	private String pincode;
	
	private String addressType;
	
	private int branchId;
	
	private int personId;
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(int doorNo, String city, String area, String state, String pincode,
			String addressType, int branchId) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.area = area;
		this.state = state;
		this.pincode = pincode;
		this.addressType = addressType;
		this.branchId = branchId;
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public int getDoorNo() {
		return doorNo;
	}


	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getAddressType() {
		return addressType;
	}


	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}


	public int getBranchId() {
		return branchId;
	}


	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", doorNo=" + doorNo + ", city=" + city + ", area=" + area
				+ ", state=" + state + ", pincode=" + pincode + ", addressType=" + addressType + ", branchId="
				+ branchId + ", personId=" + personId + "]";
	}
	
	

}
