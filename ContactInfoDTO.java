package com.ramya.practice.dto;

public class ContactInfoDTO {
	public String emailAddress;

	public ContactInfoDTO(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


}
