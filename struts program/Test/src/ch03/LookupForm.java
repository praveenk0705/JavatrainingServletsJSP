package ch03;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LookupForm extends ActionForm {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String symbol=null;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		
		this.symbol = symbol;
	}
	public void reset(ActionMapping mapping,HttpServletRequest request)
	{
		this.symbol=null;
		
	}
	 public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	        ActionErrors errors = new ActionErrors();
	        if ( (symbol==null)||(symbol.length()==0)) {
	            errors.add("symbol", new ActionError("errors.lookup.symbol.required"));
	            // TODO: add 'error.name.required' key to your resources
	        }
	       
	      
	        return errors;
	    }

	
}
