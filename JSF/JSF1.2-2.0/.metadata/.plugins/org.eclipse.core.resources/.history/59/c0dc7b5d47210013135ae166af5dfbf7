package com.shubham.jsf1;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class UNValidator implements Validator {

	static {
		System.out.println("\n-----UNValidator S.B.-----");
	}

	public UNValidator() {
		System.out.println("=====UNValidator 0-args======");
	}

	public void validate(FacesContext fc, UIComponent uc, Object values)
			throws ValidatorException {
		System.out.println("*****valiadte() Started******");

		String un = values.toString();
		if (!un.startsWith("SHU-")) {
			FacesMessage fm = new FacesMessage("Username must starts with SHU-");
			fc.addMessage("shubhampawar", fm);
			throw new ValidatorException(fm);
		}
		System.out.println("*****valiadte() Completed******");
	}

}
