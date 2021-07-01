package com.virtusa.app.dto;

public class Complaintdto {
	private String userid;
	private String complaintNo;
	private String detailsOfSuspect;
	private String description;
	private String datc;
	private String others;

	public String getComplaintNo() {
		return complaintNo;
	}

	public void setComplaintNo(String complaintNo) {
		this.complaintNo = complaintNo;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDetailsOfSuspect() {
		return detailsOfSuspect;
	}

	public void setDetailsOfSuspect(String detailsOfSuspect) {
		this.detailsOfSuspect = detailsOfSuspect;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatc() {
		return datc;
	}

	public void setDatc(String datc) {
		this.datc = datc;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

}
