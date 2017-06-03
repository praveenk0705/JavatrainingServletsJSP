package com.shubham.jsf1;

import java.util.Locale;

import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.tomcat.jni.Local;

public class StudentBean {
	private String sid;

	public String searchStudentBySid() {
		System.out.println(sid);
		return "search";
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void change(String language) {
		System.out.println("change(String)");
		FacesContext fc = FacesContext.getCurrentInstance();
		UIViewRoot root = fc.getViewRoot();

		Locale locale = new Locale(language);
		root.setLocale(locale);
	}

	public void changeToEnglish(ActionEvent ae) {
		System.out.println("\nchangeToEnglish()");
		change("en");
	}

	public void changeToHindi(ActionEvent ae) {
		System.out.println("\nchangeToHindi()");
		change("hi");
	}

	public void changeToTelgu(ActionEvent ae) {
		System.out.println("\nchangeToTelgu");
		change("te");
	}

	public void changeToKannada(ActionEvent ae) {
		System.out.println("\nchangeToKannada()");
		change("kn");
	}

	public void changeToTamil(ActionEvent ae) {
		System.out.println("\nchangeToTamil()");
		change("ta");
	}

}
