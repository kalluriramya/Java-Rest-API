package com.ramya.practice.dto;


public class UserDTO {

	private String username;
	private String password;
	private Integer loginAttempts;
	
	public UserDTO(String username, String password, Integer loginAttempts) {
		super();
		this.username = username;
		this.password = password;
		this.loginAttempts = loginAttempts;
	}
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
	

}
