package com.xoriant.banking.poc.model;

public class Gender {
	
 private int id;
 
 private String gender;

public Gender() {
	super();
	// TODO Auto-generated constructor stub
}

public Gender(int id, String gender) {
	super();
	this.id = id;
	this.gender = gender;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Gender [id=" + id + ", gender=" + gender + "]";
}
 
 
}
