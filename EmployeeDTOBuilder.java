package com.ramya.practice.dto;

import com.ramya.practice.model.Employee;

public class EmployeeDTOBuilder {
	
	public static EmployeeDTO employeeToEmployeeDTO(Employee employee) {
		return new EmployeeDTO(PersonDTOBuilder.personToPersonDTO(employee.getPerson()),employee.getDepartment(),employee.getDisgnation());
	}

}
