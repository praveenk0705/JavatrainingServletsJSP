package com.shubham.jsf2;

import java.util.*;

import javax.faces.bean.*;

@ManagedBean(name = "testBean")
@SessionScoped
public class TestBean {

	static {
		System.out.println("\n-----TestBean S.B.------");
	}

	private List<String> courses;
	private Map<String, Long> refs;

	public TestBean() {
		System.out.println("======TestBean 0-args=====");
		courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("JDBC");
		courses.add("Sevlets");
		courses.add("Jsp");
		refs = new HashMap<String, Long>();
		refs.put("aaa", new Long(111));
		refs.put("bbb", new Long(222));
		refs.put("ccc", new Long(333));
		refs.put("ddd", new Long(444));
	}

	public List<String> getCourses() {
		System.out.println("TestBean.getCourses()");
		return courses;
	}

	public void setCourses(List<String> courses) {
		System.out.println("TestBean.setCourses()");
		this.courses = courses;
	}

	public Map<String, Long> getRefs() {
		System.out.println("TestBean.getRefs()");
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		System.out.println("TestBean.setRefs()");
		this.refs = refs;
	}
	
	

}
