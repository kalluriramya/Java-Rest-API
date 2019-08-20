package com.ramya.practice.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramya.practice.model.UserDetails;
import com.ramya.practice.repository.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Override
	public UserDetails update(UserDetails u) {
		UserDetails ud=userDetailsRepository.getOne(u.getUserId());
		ud.setAddress(u.getAddress());
		ud.setSalary(2000);
		BeanUtils.copyProperties(u, ud);
		userDetailsRepository.save(ud);
		return ud;
	}

	@Override
	public UserDetails findByUserId(Long userid) {
		UserDetails ud=userDetailsRepository.findByUserId(userid);
		return ud;
	}

	@Override
	public List<UserDetails> findAll() {
		List<UserDetails> ud=userDetailsRepository.findAll();
		return ud;
	}

	@Override
	public void delete(Long userid) {
		userDetailsRepository.delete(userid);
	}

	@Override
	public void save(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
	}

}
