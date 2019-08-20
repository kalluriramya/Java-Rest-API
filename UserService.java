package com.ramya.practice.service;

import java.util.List;

import com.ramya.practice.dto.PersonDTO;
import com.ramya.practice.dto.SecureDTO;
import com.ramya.practice.dto.UserDTO;
import com.ramya.practice.dto.UserPersonDTO;
import com.ramya.practice.model.User;

public interface UserService {

	void save(User u);

	List<User> findAll();

	User update(User u);

	void delete(Integer id);

	List<UserDTO> getUserInfo();

	List<PersonDTO> getPersonInfo();
	
	List<SecureDTO> getSecureInfo();
	
	List<UserPersonDTO> getUserPersonInfo();

	List<User> getAllUsersStartingWithS(String username);

	List<User> findByEmployee_Person_ContactInfo_PhoneNumber1(String phoneNumber1);
	
	List<User> findByEmployee_Person_ContactInfo_PhoneNumber1AndUserName(String phoneNumber1, String userName);

	List<User> findAllUsersDataWithGivenName(String userName);

}
