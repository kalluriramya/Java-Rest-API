package com.ramya.practice.dto;

import com.ramya.practice.model.Person;

public class PersonDTOBuilder {

	public static PersonDTO personToPersonDTO(Person person) {
		return new PersonDTO(person.getFirstName(),person.getLastName(),person.getDob(),person.getAddress(),ContactInfoDTOBuilder.contactInfoTODTO(person.getContactInfo()));
	}
	
	public static PersonDTO personToDTO(Person person) {
		return new PersonDTO(person.getFirstName(),person.getLastName(),person.getDob(),person.getAddress());
	}
}
