package com.xoriant.banking.poc.model;

public class PersonAccount {

	private int id;
	private int customer_id;
	private int manager_id;
	private int account_number;
	private PersonInfo personinfo;
	public PersonAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonAccount(int id, int customer_id, int manager_id, int account_number, PersonInfo personinfo) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.manager_id = manager_id;
		this.account_number = account_number;
		this.personinfo = personinfo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public PersonInfo getPersoninfo() {
		return personinfo;
	}
	public void setPersoninfo(PersonInfo personinfo) {
		this.personinfo = personinfo;
	}
	@Override
	public String toString() {
		return "PersonAccount [id=" + id + ", customer_id=" + customer_id + ", manager_id=" + manager_id
				+ ", account_number=" + account_number + ", personinfo=" + personinfo + "]";
	}
	
	
}
