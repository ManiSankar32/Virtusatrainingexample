package com.virtusa.SpringRestdemo.Controller;




public class Student {
private String FirstName;
private String LastName;
public Student(String string, String string2) {
	this.FirstName=string;
	this.LastName=string2;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}

}
