package com.sk.struts;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
public class SearchAction extends Action {
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res) throws Exception{
		SearchActionForm lf=(SearchActionForm)af;
		String sid=lf.getSid();
		if(sid.equals("JLC-123")|| sid.equals("JLC-124")){
			ArrayList<StudentTO> a1=new ArrayList<StudentTO>();
			StudentTO sto=new StudentTO(sid,"B-31","santosh","sa@gmail.com","989898");
			a1.add(sto);
			a1.add(sto);
			a1.add(sto);
			req.setAttribute("STO", a1);
		}
		else{
			throw new StudentNotFoundException();
			/*ActionErrors errors=new ActionErrors();
			errors.add("sid",new ActionError("error.sid.notfound"));
			
			this.saveErrors(req, errors);*/
		}
		
ActionForward forward=am.findForward("success");
		return forward;
	
		
	}

}
