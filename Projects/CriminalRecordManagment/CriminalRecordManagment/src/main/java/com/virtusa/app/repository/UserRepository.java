package com.virtusa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.app.entity.Complaint;
import com.virtusa.app.entity.CrimeReport;
import com.virtusa.app.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByName(String name);
	

	
	

}
