package com.shubham.jsf1;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class SIDValidator implements Validator {
	static {
		System.out.println("\n------SIDValidator < S.B >-------");
	}

	public SIDValidator() {
		System.out.println("=======SIDValidtor 0-args======");
	}

	public void validate(FacesContext fc, UIComponent ui, Object obj)
			throws ValidatorException {
		System.out.println("******validate() Started");

		System.out.println("******validate() Completed");
	}
}
