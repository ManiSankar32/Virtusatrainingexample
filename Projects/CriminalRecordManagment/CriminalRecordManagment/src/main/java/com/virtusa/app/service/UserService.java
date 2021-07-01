package com.virtusa.app.service;

import java.util.List;

import com.virtusa.app.dto.UserAuthenticate;
import com.virtusa.app.entity.Complaint;
import com.virtusa.app.entity.User;

public interface UserService {
	public String saveUser(User user);
	public List<User> getListOfUsers();
	public Object getUserDataByName(String name);
	public String updateUserData(User user);
	public String validateUser(UserAuthenticate auth);
	
	

}
