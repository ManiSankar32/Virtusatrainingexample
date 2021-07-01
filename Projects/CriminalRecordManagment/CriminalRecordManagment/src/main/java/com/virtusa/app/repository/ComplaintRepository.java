package com.virtusa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.app.entity.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, String> {
	public Complaint findByComplaintNo(String complaintNo);
}
