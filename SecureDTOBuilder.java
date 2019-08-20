package com.ramya.practice.dto;

import com.ramya.practice.model.User;

public class SecureDTOBuilder {

	public static SecureDTO secureToUserDTO(User user) {
		return new SecureDTO(user.getUserName(), user.getLoginAttempts(), EmployeeDTOBuilder.employeeToEmployeeDTO(user.getEmployee()));
}
}