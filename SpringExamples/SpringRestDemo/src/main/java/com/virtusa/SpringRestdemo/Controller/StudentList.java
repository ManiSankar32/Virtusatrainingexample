package com.virtusa.SpringRestdemo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentList {
	@GetMapping("/students")
	public List<Student> getStudent(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Mani","Sankar"));
		list.add(new Student("sharm","murali"));
		return list;
	}
}
