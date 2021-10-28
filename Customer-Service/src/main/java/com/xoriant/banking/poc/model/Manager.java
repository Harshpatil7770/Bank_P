package com.xoriant.banking.poc.model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private int managerId;
	
	private int branchId;
	
	private int personId;
	
	List<PersonInfo> userList = new ArrayList<>();

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int branchId, int personId, List<PersonInfo> userList) {
		super();
		this.branchId = branchId;
		this.personId = personId;
		this.userList = userList;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
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

	public List<PersonInfo> getUserList() {
		return userList;
	}

	public void setUserList(List<PersonInfo> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", branchId=" + branchId + ", personId=" + personId + ", userList="
				+ userList + "]";
	}
	
	
}
