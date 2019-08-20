package com.ramya.practice.dto;


public class SecureDTO {
	
	private String username;
	private Integer loginAttempts;
	private EmployeeDTO employeeDTO;
	
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}


	public SecureDTO(String username, Integer loginAttempts, EmployeeDTO employeeDTO) {
		super();
		this.username = username;
		this.loginAttempts = loginAttempts;
		this.employeeDTO = employeeDTO;
	}

	

}
