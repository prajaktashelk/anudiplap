package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")

public class Student
{
	//for primary key
	@Id
  private int eid;//decalre private data member
  private String ename;
  private String edept;
  private int esalary;
  private Address address;
  
  //getter and setter method
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
//default constructor
public Student() {

	// TODO Auto-generated constructor stub
}
//constructor usinf fields
public Student(int eid, String ename, String edept, int esalary) {
	
	this.eid = eid;
	this.ename = ename;
	this.edept = edept;
	this.esalary = esalary;
}
//getter and setter
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdept() {
	return edept;
}
public void setEdept(String edept) {
	this.edept = edept;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
}
  
}
