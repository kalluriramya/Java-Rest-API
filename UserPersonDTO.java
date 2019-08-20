package com.ramya.practice.dto;


public class UserPersonDTO {

	private String username;
	private String password;
	private Integer loginAttempts;
	private PersonDTO personDTO;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	public PersonDTO getPersonDTO() {
		return personDTO;
	}
	public void setPersonDTO(PersonDTO personDTO) {
		this.personDTO = personDTO;
	}
	public UserPersonDTO(String username, String password, Integer loginAttempts, PersonDTO personDTO) {
		super();
		this.username = username;
		this.password = password;
		this.loginAttempts = loginAttempts;
		this.personDTO = personDTO;
	}
	
}
