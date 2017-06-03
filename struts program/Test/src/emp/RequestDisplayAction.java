package emp; 

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RequestDisplayAction extends Action
{
	
	
	
	Connection conn=null;
	//PreparedStatement pstmt=null;
	Statement  stmt=null;
	
	
	
	 Connection Conn=null;
	 ResultSet rs=null;
	 ResultSet rs1=null;
	
	 String name;
	 String e;
	 String f;
	 String phone;
	 String email;
	 String from;
	String to;
	String type;
	 String hour;
	 String description;
	 String datetime;
	 String leave;
	 String comments;
 public  ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws
			IOException,ServletException
			{
	   String target=new String("success");
		 
		
		 
		RequestDisplayForm requestDisplay=(RequestDisplayForm)form;
		
		 e=requestDisplay.getEmail();
	
		
		System.out.println("aaaaaaaaaayyyyyy");
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			System.out.println("ppppppppppppppp");
		}
       
		try {
		 Conn = DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			
		}
		
		//MyConn.getConnection();
		  
		
		try
		{
	      stmt=Conn.createStatement();		
	    //  stmt.executeUpdate("update absencerequest set leave='Approved' where email='"+e+"'");
		  
	      rs=stmt.executeQuery("select * from absencerequest where email='"+e+"'");
				
				
		
				
		
				
		
rs.next();
	

			name=rs.getString("name");
			
			email=rs.getString("email");
			 phone=rs.getString("phone");
from=rs.getString("frm");
to=rs.getString("oo");
type=rs.getString("type");
hour=rs.getString("hour");
description=rs.getString("description");
datetime=rs.getString("creation");
leave=rs.getString("leave");
comments=rs.getString("comments");



			
				
	
		}
	
		catch(Exception e)
		{
			System.out.println("Bad ..........."+e);
		}
		
			
		if(email==null)
		{
			target=new String("failure");
			
		}
		else
		{
			request.setAttribute("Email", email);
			request.setAttribute("Name",name);
			request.setAttribute("Phone",phone);
			request.setAttribute("From",from);
			request.setAttribute("To",to);
			request.setAttribute("Type",type);
			request.setAttribute("Comments",comments);
		    request.setAttribute("Datetime",datetime);
		    request.setAttribute("Leave",leave);
		    request.setAttribute("Description",description);
		    request.setAttribute("Hour",hour);
		}
		
		System.out.println("Data Fetch Successfuly");
		return(mapping.findForward(target));
		}

}


