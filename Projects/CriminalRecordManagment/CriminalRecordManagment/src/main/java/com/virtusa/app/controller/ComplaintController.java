package com.virtusa.app.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.virtusa.app.dto.Complaintdto;
import com.virtusa.app.entity.Complaint;
import com.virtusa.app.service.ComplaintService;

@Controller
public class ComplaintController {
	@Autowired
	private ComplaintService service;

	@GetMapping("/comhome")
	public String showHome(@ModelAttribute("complaint") Complaintdto complaint, ModelMap map) {
		return "chome";
	}

	@PostMapping("/placecomplaint")
	public String placeComplaint(@ModelAttribute("complaint") Complaintdto complaint, ModelMap map) {
		Complaint c = new Complaint();
		String msg = null;
		BeanUtils.copyProperties(complaint, c);
		msg = service.saveComplaint(c);
		map.addAttribute("status", msg);
		return "chome";
	}

	@GetMapping("/getcomplaintlist")
	public String showComplaints(ModelMap map) {
		List<Complaint> listcomplaints = service.getListOfComplaints();
		map.addAttribute("usercomplaints", listcomplaints);
		return "complaintlist";
	}

	@PutMapping("/updatecomplaint")
	public String updateComplaints(@ModelAttribute("complaint") Complaintdto complaint, ModelMap map) {
		Complaint c = new Complaint();
		String msg = null;
		BeanUtils.copyProperties(complaint, c);
		msg = service.saveComplaint(c);
		map.addAttribute("status", msg);
		return "complaintlist";
	}

}
