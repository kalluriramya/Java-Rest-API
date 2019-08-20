package com.ramya.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramya.practice.dto.PersonDTO;
import com.ramya.practice.dto.PersonDTOBuilder;
import com.ramya.practice.dto.SecureDTO;
import com.ramya.practice.dto.SecureDTOBuilder;
import com.ramya.practice.dto.UserDTO;
import com.ramya.practice.dto.UserDTOBuilder;
import com.ramya.practice.dto.UserPersonDTO;
import com.ramya.practice.dto.UserPersonDTOBuilder;
import com.ramya.practice.model.User;
import com.ramya.practice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserRepository userRepository;
	
	@Override
	public void save(User u) {
		userRepository.save(u);
	}

	@Override
	public List<User> findAll() {
		
	List<User> u=userRepository.findAll();
		return u;
	}

	@Override
	public User update(User u) {
		User user= userRepository.getOne(u.getId());
		BeanUtils.copyProperties(u, user);
		userRepository.save(user);
		return user;
	}

	@Override
	public void delete(Integer id) {
		userRepository.delete(id);
	}
	
	@Override
	public List<UserDTO> getUserInfo() {
		List<User> users=userRepository.findAll();
		List<UserDTO> dtps=new ArrayList<UserDTO>();
		for(User user:users) {
			dtps.add(UserDTOBuilder.userToUserDTO(user));
		}
		return dtps;
	}
	
	@Override
	public List<PersonDTO> getPersonInfo(){
		List<User> persons=userRepository.findAll();
		List<PersonDTO> list=new ArrayList<PersonDTO>();
		for(User user:persons) {
			list.add(PersonDTOBuilder.personToPersonDTO(user.getEmployee().getPerson()));
		}
		return list;
	}

	@Override
	public List<SecureDTO> getSecureInfo() {
		List<User> users=userRepository.findAll();
		List<SecureDTO> list=new ArrayList<SecureDTO>();
		for(User user:users) {
			list.add(SecureDTOBuilder.secureToUserDTO(user));
		}
		return list;
	}

	@Override
	public List<UserPersonDTO> getUserPersonInfo() {
		List<User> users=userRepository.findAll();
		List<UserPersonDTO> list=new ArrayList<UserPersonDTO>();
		for(User user:users) {
			list.add(UserPersonDTOBuilder.UserToPersonDTO(user));
		}
		return list;
	}

	@Override
	public List<User> getAllUsersStartingWithS(String username) {
		List<User> list=userRepository.searchWithJPQLQuery(username);
		return list;
	}

	@Override
	public List<User> findByEmployee_Person_ContactInfo_PhoneNumber1(String phoneNumber1) {
		List<User> list=userRepository.findByEmployee_Person_ContactInfo_PhoneNumber1(phoneNumber1);
		return list;
	}

	@Override
	public List<User> findByEmployee_Person_ContactInfo_PhoneNumber1AndUserName(String phoneNumber1,
			String userName) {
		List<User> list=userRepository.findByEmployee_Person_ContactInfo_PhoneNumber1AndUserName(phoneNumber1, userName);
		return list;
	}

	@Override
	public List<User> findAllUsersDataWithGivenName(String userName) {
		List<User> list=userRepository.findByUserName(userName);
		return list;
	}
	

}
