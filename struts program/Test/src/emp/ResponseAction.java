package emp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ResponseAction extends Action {
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	
	Connection Conn=null;
	
	 String email;
	
	 String leave;
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws
			IOException,ServletException
			{
	   String target=new String("success");
		 
		 ResponseForm responseForm=(ResponseForm)form;
		
		 email=responseForm.getEmail();
		 leave=responseForm.getLeave();
		 
		 		System.out.println("aaaaaaaaaa"+email);
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
       
		try {
		 Conn = DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//MyConn.getConnection();
		  
		System.out.println("1");
		try
		{
			
        pstmt=Conn.prepareStatement("update  absencerequest set leave='"+leave+"'" + " where email='" + email +"'");
        //pstmt.setString(10,"leave");
		
		int a=pstmt.executeUpdate();
		System.out.println(a+"Record updated");
		}
	
		catch(Exception e)
		{
			System.out.println("Bad ..........."+e);
		}
		
		
		
		return(mapping.findForward(target));
		}



}
