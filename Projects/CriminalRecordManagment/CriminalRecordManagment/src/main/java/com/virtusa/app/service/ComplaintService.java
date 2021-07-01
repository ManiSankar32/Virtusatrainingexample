package com.virtusa.app.service;

import java.util.List;

import com.virtusa.app.entity.Complaint;

public interface ComplaintService {
	public String saveComplaint(Complaint comp);
	public List<Complaint> getListOfComplaints();
	public Object getComplaintNo(String No);
	public String updateComplaint(Complaint comp);
	

}
