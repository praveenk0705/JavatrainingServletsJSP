package ch03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LookupAction extends Action {
	
	protected Double getQuote(String symbol)
	{
		if(symbol.equalsIgnoreCase("sunw"))
		{
			return new Double(25.00);
		}
		return null;
	}
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws
			IOException,ServletException
			{
		Double price=null;
		String target=new String("success");
		  if(form!=null)
		  {
			LookupForm lookupForm =(LookupForm)form;
			String symbol=lookupForm.getSymbol();
			price=getQuote(symbol);
			}
		if(price==null)
		{
			target=new String("failure");
			
		}
		else
		{
			request.setAttribute("PRICE", price);
			
		}
		return(mapping.findForward(target));
			}
	
	
	
	

}
