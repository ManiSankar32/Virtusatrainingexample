package com.virtusa.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.app.dto.UserAuthenticate;
import com.virtusa.app.entity.User;
import com.virtusa.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired(required = true)
	private UserRepository repository;

	public String saveUser(User user) {
		User userdetails = repository.save(user);
		Optional userdat = Optional.of(userdetails);
		if (userdat.isPresent()) {
			return "user data successfully stored";
		} else {
			return "user data not  stored successfully";
		}

	}

	@Override
	public List<User> getListOfUsers() {
		List<User> userslist = new ArrayList<User>();
		userslist = repository.findAll();
		return userslist;
	}

	@Override
	public Object getUserDataByName(String name) {
		User user = repository.findByName(name);
		Optional userdata = Optional.of(user);
		if (userdata.isPresent()) {
			return userdata;
		} else {
			return "user data not found our records";
		}
	}

	@Override
	public String updateUserData(User user) {
		User userfromrep = repository.save(user);
		Optional userdat = Optional.of(userfromrep);
		if (userdat.isPresent()) {
			return "user data updated successfully";
		} else {
			return "user data not  updated successfully";
		}
	}
@Override
public String validateUser(UserAuthenticate auth) {

	User user=(User) getUserDataByName(auth.getUsername());
	if (user.getUserName()==auth.getUsername() && user.getPassword()==auth.getPassword()) {
		return "user logged in successfully";
	} else {
		return "user is not existed, please register";
	}
	
}
	

}
