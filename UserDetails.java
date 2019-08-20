package com.ramya.practice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name="USERDATA")
@Entity
public class UserDetails implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String firstname;
	private String lastname;
	private int salary;
	private String address;
	
	public UserDetails(Long userId, String firstname, String lastname, int salary, String address) 
	{
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.address = address;
	}
	
	public UserDetails() {
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
@Override
public String toString() {
	return "UserDetails [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", salary="
			+ salary + ", address=" + address + "]";
}
}