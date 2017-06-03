package com.shubham.jsf2;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "shuemail")
public class EmailValidator implements Validator {

	static {
		System.out.println("\n------EmailValidator S.B.-----");
	}

	public EmailValidator() {
		System.out.println("======EmailValidator 0-args=====");
	}

	public void validate(FacesContext fc, UIComponent uc, Object values)
			throws ValidatorException {
		System.out.println("*******validate() started******");
		System.out.println("Values :" + values);

		String em = values.toString();
		if (!em.endsWith("@shu.com")) {
			FacesMessage fm = new FacesMessage(
					"Email must be ends with @shu.com");
			fc.addMessage("sdsdggddh", fm);
			throw new ValidatorException(fm);
		}
		System.out.println("*******validate() completed******");
	}
}
