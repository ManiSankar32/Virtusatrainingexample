package com.CrimeManagement.Model;

public class CrimeDetails {
private int Crimeid;
private String Criminalid;
private String SuspectDetails;
private String Informer;
private String Description;
private String Date;
private String Place;
public int getCrimeid() {
	return Crimeid;
}
public void setCrimeid(int crimeid) {
	this.Crimeid = crimeid;
}
public String getCriminalid() {
	return Criminalid;
}
public void setCriminalid(String criminalid) {
	this.Criminalid = criminalid;
}
public String getSuspectDetails() {
	return SuspectDetails;
}
public void setSuspectDetails(String suspectDetails) {
	this.SuspectDetails = suspectDetails;
}
public String getInformer() {
	return Informer;
}
public void setInformer(String informer) {
	this.Informer = informer;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	this.Description = description;
}
public String getPlace() {
	return Place;
}
public void setPlace(String place) {
	this.Place = place;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	this.Date = date;
}


}
