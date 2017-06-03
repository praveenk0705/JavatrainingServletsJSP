package com.shubham.jsf1;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentBean {

	static {
		System.out.println("-------StudentBean S.B.------");
	}

	public StudentBean() {
		System.out.println("======StudentBean 0-args======");
	}

	// 1.Data submitted by client
	private String firstname;
	private String lastname;

	// 2.Data coming from database
	private String email;
	private long phone;
	private Address address;

	// 3.Data specified in faces config
	private String dob;
	private int age;
	private Double fee;
	private List<String> courses;
	private Map<String, Long> refs;

	// 4.Data from other Bean properties
	public CourseBean course;

	@PostConstruct
	public void myInit() {
		System.out.println("******myInit()*******");
	}

	public String show() {
		System.out.println("\n*****show() Stareted*****");

		StudentService ss = new StudentService();
		email = ss.getEmail();
		phone = ss.getPhone();
		address = ss.getAddress();

		System.out.println("\n*****show() Completed*****");
		return "show";
	}

	public String getFirstname() {
		System.out.println("getFirstname()");
		return firstname;
	}

	public void setFirstname(String firstname) {
		System.out.println("setFirstname()");
		this.firstname = firstname;
	}

	public String getLastname() {
		System.out.println("getLastname()");
		return lastname;
	}

	public void setLastname(String lastname) {
		System.out.println("setLastname()");
		this.lastname = lastname;
	}

	public String getEmail() {
		System.out.println("getEmail()");
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setEmail()");
		this.email = email;
	}

	public long getPhone() {
		System.out.println("getPhone()");
		return phone;
	}

	public void setPhone(long phone) {
		System.out.println("setPhone()");
		this.phone = phone;
	}

	public Address getAddress() {
		System.out.println("getAddress()");
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress()");
		this.address = address;
	}

	public String getDob() {
		System.out.println("getDob() :" + dob);
		return dob;
	}

	public void setDob(String dob) {
		System.out.println("setDob() :" + dob);
		this.dob = dob;
	}

	public int getAge() {
		System.out.println("getAge() :" + age);
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge() :" + age);
		this.age = age;
	}

	public Double getFee() {
		System.out.println("getFee() :" + fee);
		return fee;
	}

	public void setFee(Double fee) {
		System.out.println("setFee() :" + fee);
		this.fee = fee;
	}

	public List<String> getCourses() {
		System.out.println("getCourses() :" + courses.get(1));
		return courses;
	}

	public void setCourses(List<String> courses) {
		System.out.println("setCourses() :" + courses.get(1));
		this.courses = courses;
	}

	public Map<String, Long> getRefs() {
		System.out.println("getRefs() :" + refs);
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		System.out.println("setRefs() :" + refs);
		this.refs = refs;
	}

	public CourseBean getCourse() {
		System.out.println("getCourse()");
		return course;
	}

	public void setCourse(CourseBean course) {
		System.out.println("setCourse()");
		this.course = course;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("\n******destroy()******");
	}
}
