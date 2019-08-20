package com.ramya.practice.dto;

import com.ramya.practice.model.Person;

public class EmployeeDTO {
	private PersonDTO personDTO;
	public PersonDTO getPersonDTO() {
		return personDTO;
	}
	public void setPersonDTO(PersonDTO personDTO) {
		this.personDTO = personDTO;
	}

	private String department;
	private String disgnation;
	
	public String getDisgnation() {
		return disgnation;
	}
	public void setDisgnation(String disgnation) {
		this.disgnation = disgnation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public EmployeeDTO(PersonDTO personDTO, String disgnation, String department) {
		super();
		this.personDTO = personDTO;
		this.disgnation = disgnation;
		this.department = department;
	}
	

}
