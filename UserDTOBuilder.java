package com.ramya.practice.dto;

import com.ramya.practice.model.User;

public class UserDTOBuilder {
	
	public static UserDTO userToUserDTO(User user) {
	
		return new UserDTO(user.getUserName() , user.getPassword(), user.getLoginAttempts());
	}

}
