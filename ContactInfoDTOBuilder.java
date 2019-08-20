package com.ramya.practice.dto;

import com.ramya.practice.model.ContactInfo;

public class ContactInfoDTOBuilder {
	public static ContactInfoDTO contactInfoTODTO(ContactInfo contactInfo) {
		return new ContactInfoDTO (contactInfo.getEmailAddress());
	}
}
