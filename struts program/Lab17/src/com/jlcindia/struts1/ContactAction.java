package com.jlcindia.struts1;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
/**
 * This exception is thrown by
 * <code>doPrivileged(PrivilegedExceptionAction)</code> and
 * <code>doPrivileged(PrivilegedExceptionAction,
 * AccessControlContext context)</code> to indicate
 * that the action being performed threw a checked exception.  The exception
 * thrown by the action can be obtained by calling the
 * <code>getException</code> method.  In effect, an
 * <code>PrivilegedActionException</code> is a "wrapper"
 * for an exception thrown by a privileged action.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "exception thrown
 * by the privileged computation" that is provided at construction time and
 * accessed via the {@link #getException()} method is now known as the
 * <i>cause</i>, and may be accessed via the {@link Throwable#getCause()}
 * method, as well as the aforementioned "legacy method."
 *
 * @see PrivilegedExceptionAction
 * @see AccessController#doPrivileged(PrivilegedExceptionAction)
 * @see AccessController#doPrivileged(PrivilegedExceptionAction,AccessControlContext)
 */
public class ContactAction extends JLCBaseDispatchAction {
int tor=5;
int start=0;
int tnor=0;
int end=0;

	public ActionForward addContact(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	System.out.println("addContact()-ConatactAction");
		ContactForm cf=(ContactForm)form;
		ContactTO cto=new ContactTO(cf.getFname(),cf.getLname(),cf.getEmail(),cf.getPhone(),"Enabled");
		int x=contactService.addContact(cto);
		System.out.println(x);
		return mapping.findForward("addcontactstatus");
	}
	
		public ActionForward searchContact(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception {
System.out.println("searchContact()-ContactAction");
request.getSession().removeAttribute("EDIT");
ContactForm cf=(ContactForm)form;
ContactTO cto=contactService.getContactByEmail(cf.getEmail());
if(cto==null){
	request.setAttribute("NOT_FOUND","No Record found with email"+cf.getEmail());
	return mapping.findForward("notfound");
}
else
{
	cf.setContactId(cto.getContactId());
	cf.setFname(cto.getFname());
	cf.setLname(cto.getLname());
	cf.setPhone(cto.getPhone());
	cf.setStatus(cto.getStatus());
}
			return mapping.findForward("updatecontact");
		}
		public ActionForward updateContact(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception {
System.out.println("updateContact()-ContactAction");
request.getSession().removeAttribute("CID");
ContactForm cf=(ContactForm)form;

System.out.println(cf.getContactId());
System.out.println(cf.getFname());
System.out.println(cf.getLname());
System.out.println(cf.getEmail());
System.out.println(cf.getPhone());
System.out.println(cf.getStatus());
ContactTO cto=new ContactTO(cf.getContactId(),cf.getFname(),cf.getLname(),cf.getEmail(),cf.getPhone(),cf.getStatus());
int x=contactService.updateContact(cto);
System.out.println(x);
HttpSession session=request.getSession();
Object obj=session.getAttribute("EDIT");
if(obj!=null){
	session.setAttribute("EDIT","FALSE");
	List<ContactTO> clist=contactService.getAllContacts(start,tor);
	System.out.println(clist);
	cf.setContactId(cto.getContactId());
	cf.setFname(cto.getFname());
	cf.setLname(cto.getLname());
	cf.setPhone(cto.getPhone());
	cf.setStatus(cto.getStatus());
}
			return mapping.findForward("updatecontact");
		}
		
		
			public ActionForward showAllContacts(ActionMapping am, ActionForm af,
					HttpServletRequest req, HttpServletResponse res)
					throws Exception {
				req.getSession().removeAttribute("CID");
				req.getSession().setAttribute("EDIT","FALSE");
				start=0;
				System.out.println("showAllContacts()-ContactAction");
				tnor=contactService.getTotalNumberOfRecords();
				List<ContactTO> clist=contactService.getAllContacts(start, tor);
				if(tnor<1){
					req.setAttribute("NOT_FOUND","No Record available");
					
				}
				else{
					end=tor;
					HttpSession session=req.getSession();
					session.setAttribute("CLIST",clist);
					session.setAttribute("EDIT","FALSE");
				    session.setAttribute("BEGIN",start+1);
				    session.setAttribute("END", end);
				    session.setAttribute("TNOR",tnor);
				    if(tnor>end){
				    	req.setAttribute("SHOW_NEXT","OK");
				    }
				}
				return am.findForward("showallcontactshome");
			}
	
			public ActionForward showNextContacts(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res)
			throws Exception {
				req.getSession().removeAttribute("CID");
				req.getSession().setAttribute("EDIT", "FALSE");
				System.out.println("showNextContacts()-ContactAction");
				HttpSession session=req.getSession();
				Integer i1=(Integer)session.getAttribute("END");
				start=i1.intValue();
				tnor=contactService.getTotalNumberOfRecords();
				List<ContactTO> clist=contactService.getAllContacts(start, tor);
				if(tnor<1){
					req.setAttribute("NOT_FOUND","No Record available");
					
				}
				else{
					end=start=tor;
					if(end>tnor){
						end=tnor;
					}
					session.setAttribute("CLIST",clist);
					session.setAttribute("BEGIN",start+1);
					session.setAttribute("TNOR",tnor);
					session.setAttribute("END",end);
					setNextPrevious(req);
					
				}
				
				
				
				return am.findForward("showallcontactshome");
			}

			public ActionForward showPreviousContacts(ActionMapping am, ActionForm af,
					HttpServletRequest req, HttpServletResponse res)
					throws Exception {
				req.getSession().removeAttribute("CID");
				req.getSession().setAttribute("EDIT","FALSE");
				System.out.println("showPreviousContacts()-ContactAction");
				HttpSession session=req.getSession();
				Integer i1=(Integer)session.getAttribute("BEGIN");
				start=i1.intValue()-tor-1;
				tnor=contactService.getTotalNumberOfRecords();
				List<ContactTO> clist=contactService.getAllContacts(start, tor);
				if(tnor<1){
					req.setAttribute("NOT_FOUND","No Record available");
				}
				else{
					end=start+tor;
					if(end>tnor){
						end=tnor;
						
					}
					session.setAttribute("CLIST",clist);
					session.setAttribute("BEGIN",start+1);
					session.setAttribute("TNOR",tnor);
					session.setAttribute("END",end);
					setNextPrevious(req);
				}
				
			return am.findForward("showallcontactshome");	
			}
			
			public ActionForward editContact(ActionMapping am, ActionForm af,
					HttpServletRequest req, HttpServletResponse res)
					throws Exception {
			
			System.out.println("editContact()-ContactAction");
			DynaActionForm daf=(DynaActionForm)af;
			String cid=daf.get("cid").toString();
			HttpSession session=req.getSession();
			session.setAttribute("EDIT","TRUE");
			session.setAttribute("CID",cid);
			setNextPrevious(req);
			
			
			
				return am.findForward("showallcontactshome");	
			}
			
			public ActionForward deleteContact(ActionMapping am, ActionForm af,
					HttpServletRequest req, HttpServletResponse res)
					throws Exception {
			
			System.out.println("deleteContact()-ContactAction");
			req.getSession().removeAttribute("CID");
			req.getSession().setAttribute("EDIT","FALSE");
			
			DynaActionForm daf=(DynaActionForm)af;
			String cid=daf.get("cid").toString();
			int x=contactService.deleteContact(cid);
			System.out.println(x);
			if(x>0){
				req.setAttribute("DELETED","Record deleted Successfully");
				
			}
			tnor=contactService.getTotalNumberOfRecords();
			if(tnor<1){
				req.setAttribute("NOT_FOUND","No Record available");
				
			}
			else
			{
				Integer i1=(Integer)req.getSession().getAttribute("BEGIN");
				start=i1.intValue();
				if(tnor<start){
					start=start-tor;
					end=start+tor-1;
					if(end>tnor){
						end=tnor;
						
					}
					List<ContactTO> clist=contactService.getAllContacts(start-1, tor);
					req.getSession().setAttribute("CLIST",clist);
					req.getSession().setAttribute("BEGIN", start);
					req.getSession().setAttribute("END", end);
					req.getSession().setAttribute("TNOR", tnor);
					setNextPrevious(req);
					
				}
				return am.findForward("showallcontactshome");
			}
			HttpSession session=req.getSession();
			session.setAttribute("EDIT","TRUE");
			session.setAttribute("CID",cid);
			setNextPrevious(req);
			return am.findForward("showallcontactshome");	
			}
			
			private void setNextPrevious(HttpServletRequest req) {
				if(start+1>5){
					req.setAttribute("SHOW_PREVIOUS", "OK");
				}
				if(end<tnor){
					req.setAttribute("SHOW_NEXT", "OK");
				}
				
			}
		
		
		
}
