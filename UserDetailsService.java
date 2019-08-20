package com.ramya.practice.service;

import java.util.List;

import com.ramya.practice.model.UserDetails;

public interface UserDetailsService {

	UserDetails update(UserDetails u);

	UserDetails findByUserId(Long userid);

	List<UserDetails> findAll();

	void delete(Long userid);

	void save(UserDetails userDetails);

}
