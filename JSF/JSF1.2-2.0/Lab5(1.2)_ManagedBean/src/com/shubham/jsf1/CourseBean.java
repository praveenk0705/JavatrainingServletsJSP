package com.shubham.jsf1;

public class CourseBean {
	static {
		System.out.println("\n------CourseBean------");
	}
	private int cid;
	private String cname;
	private int duration;
	private double cost;

	public CourseBean() {
		System.out.println("======CourseBean 0-args======");
	}

	public int getCid() {
		System.out.println("getCid() :" + cid);
		return cid;
	}

	public void setCid(int cid) {
		System.out.println("setCid() :" + cid);
		this.cid = cid;
	}

	public String getCname() {
		System.out.println("getCname() :" + cname);
		return cname;
	}

	public void setCname(String cname) {
		System.out.println("setCname() :" + cname);
		this.cname = cname;
	}

	public int getDuration() {
		System.out.println("getDuration() :" + duration);
		return duration;
	}

	public void setDuration(int duration) {
		System.out.println("setDuration() :" + duration);
		this.duration = duration;
	}

	public double getCost() {
		System.out.println("getCost() :" + cost);
		return cost;
	}

	public void setCost(double cost) {
		System.out.println("setCost() :" + cost);
		this.cost = cost;
	}
	
	

}
