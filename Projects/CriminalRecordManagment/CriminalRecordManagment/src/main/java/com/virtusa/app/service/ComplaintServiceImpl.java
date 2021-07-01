package com.virtusa.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.app.entity.Complaint;
import com.virtusa.app.entity.User;
import com.virtusa.app.repository.ComplaintRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService {
	@Autowired
	private ComplaintRepository repository;

	@Override
	public String saveComplaint(Complaint comp) {
		Complaint complaint = repository.save(comp);
		Optional c = Optional.of(complaint);
		if (c.isPresent()) {
			return "Complaint  successfully submited";
		} else {
			return "Complaint  not successfully submited";
		}
	}

	@Override
	public List<Complaint> getListOfComplaints() {
		List<Complaint> userslist = new ArrayList<Complaint>();
		userslist = repository.findAll();
		return userslist;
	}

	@Override
	public Object getComplaintNo(String No) {
		Complaint complaint = repository.findByComplaintNo(No);
		Optional optionalcomplaint = Optional.of(complaint);
		if (optionalcomplaint.isPresent()) {
			return complaint;
		} else {
			return "user data not found our records";
		}
	}

	@Override
	public String updateComplaint(Complaint comp) {
		Complaint comp1 = repository.save(comp);
		Optional complaint1 = Optional.of(comp1);
		if (complaint1.isPresent()) {
			return "user data updated successfully";
		} else {
			return "user data not  updated successfully";
		}

	}
}
