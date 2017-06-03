package com.shubham.jsf1;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

public class SIDConverter implements Converter {

	public Object getAsObject(FacesContext fc, UIComponent component,
			String value) throws ConverterException {
		System.out.println("\n******SIDConverter getAsObject() Started*******");
		System.out.println("Component :" + component.getId());
		System.out.println("Value :" + value);

		String sid = "";
		String msg = component.getId();
		FacesMessage message = new FacesMessage();

		int id = 0;
		try {
			if (value == null || value.length() == 0) {
				message.setDetail(msg + " is Required");
				throw new ConverterException(message);
			}
			id = Integer.parseInt(value);
		}

		catch (NumberFormatException e) {
			message.setDetail("Please enter only digits for " + msg);
			throw new ConverterException(message);
		}

		if (id >= 1 && id <= 999) {
			sid = "SHU-" + id;
		} else {
			message.setDetail("Please enter value between 1 and 999 " + msg);
			throw new ConverterException(message);
		}

		System.out.println("******SIDConverter getAsObject() Completed*******");
		return sid;
	}

	public String getAsString(FacesContext fc, UIComponent component,
			Object value) {
		System.out.println("\n******SIDConverter getAsString() Started*******");
		System.out.println("Component :" + component.getId());
		System.out.println("Value :" + value);

		String str = value.toString();
		String val = str.substring(4);
		System.out.println(val);

		System.out.println("******SIDConverter getAsString() Completed*******");
		return val;
	}

}
