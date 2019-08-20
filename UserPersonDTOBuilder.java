package com.ramya.practice.dto;

import com.ramya.practice.model.User;

public class UserPersonDTOBuilder {

	public static UserPersonDTO UserToPersonDTO(User user)
	{
		return new UserPersonDTO(user.getUserName(), user.getPassword(),user.getLoginAttempts(),PersonDTOBuilder.personToDTO(user.getEmployee().getPerson()));
	}
}
