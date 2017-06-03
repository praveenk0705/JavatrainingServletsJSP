package com.shubham.jsf2;

import java.util.List;
import java.util.Map;

import javax.annotation.*;
import javax.faces.bean.*;

@ManagedBean(name = "hello")
@SessionScoped
public class HelloBean {
	static {
		System.out.println("\n-----HelloBean S.B.------");
	}

	public HelloBean() {
		System.out.println("======HelloBean 0-args");
	}

	// 1.Data submmited by client
	private String name;
	private String email;

	// 2.Data coming from database
	private long phone;

	public String show() {
		System.out.println("\n******show() Started******");
		HelloService hs = new HelloService();
		phone = hs.getPhone();
		System.out.println("******show() Completed*******");
		return "show";

	}

	// 3.Data specified in Bean annotation
	@ManagedProperty(value = "10-10-10")
	private String dob;
	@ManagedProperty(value = "M.Sc")
	private String qualification;

	// 4.Data taken from other bean properties
	@ManagedProperty(value = "#{testBean.courses}")
	private List<String> courses;
	@ManagedProperty(value = "#{testBean.refs}")
	private Map<String, Long> refs;

	@PostConstruct
	public void myInit() {
		System.out.println("\nHelloBean.myInit()");
	}

	public String getName() {
		System.out.println("\nHelloBean.getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("\nHelloBean.setName()");
		this.name = name;
	}

	public String getEmail() {
		System.out.println("HelloBean.getEmail()");
		return email;
	}

	public void setEmail(String email) {
		System.out.println("HelloBean.setEmail()");
		this.email = email;
	}

	public long getPhone() {
		System.out.println("HelloBean.getPhone()");
		return phone;
	}

	public void setPhone(long phone) {
		System.out.println("HelloBean.setPhone()");
		this.phone = phone;
	}

	public String getDob() {
		System.out.println("HelloBean.getDob()");
		return dob;
	}

	public void setDob(String dob) {
		System.out.println("HelloBean.setDob()");
		this.dob = dob;
	}

	public String getQualification() {
		System.out.println("HelloBean.getQualification()");
		return qualification;
	}

	public void setQualification(String qualification) {
		System.out.println("HelloBean.setQualification()");
		this.qualification = qualification;
	}

	public List<String> getCourses() {
		System.out.println("HelloBean.getCourses()");
		return courses;
	}

	public void setCourses(List<String> courses) {
		System.out.println("HelloBean.setCourses()");
		this.courses = courses;
	}

	public Map<String, Long> getRefs() {
		System.out.println("HelloBean.getRefs()");
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		System.out.println("HelloBean.setRefs()");
		this.refs = refs;
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("HelloBean.myDestroy()");
		System.out.println("HelloBean.myDestroy()");
	}
}
