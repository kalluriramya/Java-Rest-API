package com.ramya.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramya.practice.dto.PersonDTO;
import com.ramya.practice.dto.SecureDTO;
import com.ramya.practice.dto.UserDTO;
import com.ramya.practice.dto.UserPersonDTO;
import com.ramya.practice.model.User;
import com.ramya.practice.model.UserDetails;
import com.ramya.practice.service.UserDetailsService;
import com.ramya.practice.service.UserService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private UserService userService;

	@GetMapping("/users/{userid}")
	public ResponseEntity<UserDetails> getUserByID(@PathVariable Long userid) {
		UserDetails u = userDetailsService.findByUserId(userid);
		return new ResponseEntity<UserDetails>(u, HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<List<UserDetails>> getAllUsers() {
		List<UserDetails> list = userDetailsService.findAll();
		return new ResponseEntity<List<UserDetails>>(list, HttpStatus.OK);
	}

	@PutMapping("/users")
	public ResponseEntity<UserDetails> update(@RequestBody UserDetails u) {

		UserDetails user = userDetailsService.update(u);
		System.out.println("data after suucess update" + user.getFirstname());
		return new ResponseEntity<UserDetails>(user, HttpStatus.OK);
	}

	@DeleteMapping("/users/{userid}")
	public ResponseEntity<Void> deleteById(@PathVariable Long userid) {
		userDetailsService.delete(userid);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<Void> save(@RequestBody UserDetails u) {
		userDetailsService.save(u);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PostMapping("/user")
	public ResponseEntity<Void> saveUser(@RequestBody User user) {
		user.setCreatedDate(new Date());
		user.setLastLoginDate(new Date());
		user.setUpdatedDate(new Date());
		userService.save(user);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUsers() {
		List<User> list = userService.findAll();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<User> update(@RequestBody User u) {
		User user = userService.update(u);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		userService.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/userinfo")
	public ResponseEntity<List<UserDTO>> userInfo() {
		List<UserDTO> list = userService.getUserInfo();
		return new ResponseEntity<List<UserDTO>>(list, HttpStatus.OK);

	}

	@GetMapping("/personinfo")
	public ResponseEntity<List<PersonDTO>> personInfo() {
		List<PersonDTO> list = userService.getPersonInfo();
		return new ResponseEntity<List<PersonDTO>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/user/secureinfo")
	public ResponseEntity<List<SecureDTO>> userSecureInfo(){
		List<SecureDTO> list=userService.getSecureInfo();
		return new ResponseEntity<List<SecureDTO>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/user/personinfo")
	public ResponseEntity<List<UserPersonDTO>> userPersonDTO(){
		List<UserPersonDTO> list=userService.getUserPersonInfo();
		return new ResponseEntity<List<UserPersonDTO>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/search" , method= RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> getAllUsersStartingWithS(@RequestParam("userName") String username){
		List<User> list=userService.getAllUsersStartingWithS(username);
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/searchusers", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> getAllUsersWithPhoneNumber(@RequestParam("phoneNumber1") String phoneNumber1){
		List<User> list=userService.findByEmployee_Person_ContactInfo_PhoneNumber1(phoneNumber1);
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/searchUniqueUser", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> getAllUsersWithNameAndPhoneNumber(@RequestParam("phoneNumber1") String phoneNumber1, @RequestParam("userName") String userName){
		List<User> list=userService.findByEmployee_Person_ContactInfo_PhoneNumber1AndUserName(phoneNumber1,userName);
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/{userName}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> getAllUsersDataWithGivenName(@PathVariable("userName") String userName){
		List<User> list=userService.findAllUsersDataWithGivenName(userName);
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

}
