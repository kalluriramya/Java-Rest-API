package com.ramya.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ramya.practice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public List<User> findByEmployee_Person_ContactInfo_PhoneNumber1(String phoneNumber1);
	public List<User> findByEmployee_Person_ContactInfo_PhoneNumber1AndUserName(String phoneNumber1,String userName);
	@Query("select u from User u where u.userName like :searchTerm%" )
    public List<User> searchWithJPQLQuery(@Param("searchTerm") String searchTerm);
	public List<User> findByUserName(String userName);
	

}