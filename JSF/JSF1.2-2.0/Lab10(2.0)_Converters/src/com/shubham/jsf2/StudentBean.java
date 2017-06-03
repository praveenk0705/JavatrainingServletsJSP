package com.shubham.jsf2;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "studentBean")
@SessionScoped
public class StudentBean {
	static {
		System.out.println("\n------StudentBean < S.B > --------");
	}

	private String bid;
	private String sid;
	private double amount;
	private Date paymentDate;

	public StudentBean() {
		System.out.println("\n=======StudentBean 0-args======");
	}

	public String register() {
		System.out.println("\n******register() Started******");
		System.out.println("Bid :" + bid);
		System.out.println("Sid:" + sid);
		System.out.println("An]mount :" + this.amount);
		System.out.println("Payment date:" + this.paymentDate);
		System.out.println("******register() Completed******");
		return "regstatus";
	}

	public String getBid() {
		System.out.println("getBid() :" + bid);
		return bid;
	}

	public void setBid(String bid) {
		System.out.println("setBid() :" + bid);
		this.bid = bid;
	}

	public String getSid() {
		System.out.println("getSid() :" + sid);
		return sid;
	}

	public void setSid(String sid) {
		System.out.println("setSid() :" + sid);
		this.sid = sid;
	}

	public double getAmount() {
		System.out.println("getAmount() :" + amount);
		return amount;
	}

	public void setAmount(double amount) {
		System.out.println("setAmount() :" + amount);
		this.amount = amount;
	}

	public Date getPaymentDate() {
		System.out.println("getPaymentDate() :" + paymentDate);
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		System.out.println("setPaymentDate() :" + paymentDate);
		this.paymentDate = paymentDate;
	}
}
