package com.virtusa.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.virtusa.app.dto.UserAuthenticate;
import com.virtusa.app.dto.Userdto;
import com.virtusa.app.entity.User;
import com.virtusa.app.service.UserService;

@Controller
public class UserController {

	@Autowired(required = true)
	private UserService service;

	@GetMapping("/uhome")
	public String showHomePage(@ModelAttribute("user") Userdto user, ModelMap map) {

		return "uhome";
	}

	@PostMapping("/register")
	public String userRegister(@ModelAttribute("user") Userdto user, ModelMap map) {
		User userdetails = new User();
		String msg = null;
		userdetails.setId(Integer.parseInt(user.getId()));
		userdetails.setName(user.getName());
		userdetails.setUserName(user.getUserName());
		userdetails.setPassword(user.getPassword());
		userdetails.setAddress(user.getAddress());
		userdetails.setEmail(user.getEmail());
		userdetails.setPhone(user.getPhone());
		msg = service.saveUser(userdetails);

		map.addAttribute("status", msg);
		return "uhome";
	}

	@GetMapping("/login")
	public String validateUser(@ModelAttribute("credentials") UserAuthenticate credentials, ModelMap map) {
		String msg = null;
		//msg = service.validateUser(credentials);
		System.out.println(credentials.getPassword());
		System.out.println(credentials.getUsername());
		map.addAttribute("status", msg);
		return "login";
	}

	@GetMapping("/getuserdata")
	public String fetchUsersList(HttpServletRequest req, ModelMap map) {
		String name = null;
		name = req.getParameter("name");
		Object object = service.getUserDataByName(name);
		User user = (User) object;
		String msg = (String) object;
		if (user != null) {
			map.addAttribute("userdata", user);

		} else {
			map.addAttribute("status", msg);
		}
		return "userdataform";
	}

	@PutMapping("/updateuser")
	public String upadateUserData(@ModelAttribute("user") Userdto user, ModelMap map) {
		User userdetails = new User();
		String msg = null;
		userdetails.setId(Integer.parseInt(user.getId()));
		userdetails.setName(user.getName());
		userdetails.setUserName(user.getUserName());
		userdetails.setPassword(user.getPassword());
		userdetails.setAddress(user.getAddress());
		userdetails.setEmail(user.getEmail());
		userdetails.setPhone(user.getPhone());
		msg = service.saveUser(userdetails);

		map.addAttribute("updateStatus", msg);
		return "uhome";
	}

}
