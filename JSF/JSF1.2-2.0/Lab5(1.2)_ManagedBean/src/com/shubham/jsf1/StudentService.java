package com.shubham.jsf1;

public class StudentService {

	public String getEmail() {
		return "shubham@gmail.com";
	}

	public long getPhone() {
		return 999999;
	}

	public Address getAddress() {
		Address add = new Address();
		add.setCity("Mumbai");
		add.setState("Maharashtra");
		return add;
	}
	
	
}