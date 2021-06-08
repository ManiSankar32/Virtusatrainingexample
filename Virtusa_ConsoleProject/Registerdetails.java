package IssueManagement;

import java.util.concurrent.atomic.AtomicInteger;

class Registerdetails{
	private String Name;
	private String emailId ;
	private String password; 
	private String city ;
	private String gen;
	private String confpassword;
	private final static AtomicInteger count = new AtomicInteger(00);
	public String getName() {
		return Name;
	}

	public  void setName(String name) {
		this.Name = name;
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

	public int getCount() {
		int no=count.incrementAndGet();
		return no ;
	}
}
	
