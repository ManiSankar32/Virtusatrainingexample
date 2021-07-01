package com.Virtusa.app.Repositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CrimeDetails")
public class Crimes{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="crimeid")
	private int crimeid;
	
	@Column(name="criminalid")
	private String criminalid;
	
	@Column(name="suspectdetails")
	private String suspectdetails;
	
	@Column(name="informer")
	private String informer;
	
	@Column(name="description")
	private String description;
	
	@Column(name="date")
	private String date;
	
	@Column(name="place")
	private String place;

	
	public int getCrimeid() {
		return crimeid;
	}


	public void setCrimeid(int crimeid) {
		this.crimeid = crimeid;
	}


	public String getCriminalid() {
		return criminalid;
	}


	public void setCriminalid(String criminalid) {
		this.criminalid = criminalid;
	}


	public String getSuspectdetails() {
		return suspectdetails;
	}


	public void setSuspectdetails(String suspectdetails) {
		this.suspectdetails = suspectdetails;
	}


	public String getInformer() {
		return informer;
	}


	public void setInformer(String informer) {
		this.informer = informer;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public Crimes() {
		// TODO Auto-generated constructor stub
	}
}
