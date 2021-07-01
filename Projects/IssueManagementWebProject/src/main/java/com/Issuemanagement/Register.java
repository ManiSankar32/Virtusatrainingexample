package com.Issuemanagement;

public class Register {
	private String Name;
	private String emailId ;
	private String password; 
	private String city ;
	private String gen;
	private String confpassword;
    private String Mobileno;

	public  void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getConfpassword() {
		return confpassword;
	}

	public void setConfpassword(String confpassword) {
		this.confpassword = confpassword;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}

}
