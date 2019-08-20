package com.ramya.practice.dto;

import java.util.Date;


import com.ramya.practice.model.Address;

public class PersonDTO {

	private String firstname;
	private String lastname;
	private Date dob;
	private Address address;
	private  ContactInfoDTO contactInfoDTO;

	public ContactInfoDTO getContactInfoDTO() {
		return contactInfoDTO;
	}

	public void setContactInfoDTO(ContactInfoDTO contactInfoDTO) {
		this.contactInfoDTO = contactInfoDTO;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PersonDTO(String firstname, String lastname, Date dob, Address address, ContactInfoDTO contactInfoDTO) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.contactInfoDTO = contactInfoDTO;
	}
	public PersonDTO(String firstname, String lastname, Date dob, Address address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
	}

	
}
