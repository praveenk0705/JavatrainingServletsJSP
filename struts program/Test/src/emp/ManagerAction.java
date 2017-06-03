package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ManagerAction<MangagerForm> extends Action  {


	 private final static String SUCCESS = "success";
	    private final static String FAILURE = "failure";
String name;
String password;
PreparedStatement pstmt=null;
Connection Conn =null;
ResultSet rs=null;


	public ActionForward execute(ActionMapping mapping, ActionForm form,
         HttpServletRequest request, HttpServletResponse response)
         throws Exception 
         {

	 ManagerForm mForm=(ManagerForm)form;
	 name=mForm.getUsername();
	 password=mForm.getPassword();
	 try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} 
	 catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		
	 }  
		try {
		 Conn = DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
		
			int f=0;
     pstmt=Conn.prepareStatement("select * from mlogin");
     
     rs=pstmt.executeQuery();
		while(rs.next())
		{
			if(name.equals(rs.getString(1))&& password.equals(rs.getString(2)))
			{
				f=1;
				break;
				
			}
		}
		
		if(f==1)
		{
			return mapping.findForward(SUCCESS);
		}
		     
		   else 
               {
      return mapping.findForward(FAILURE);
               
}
		}
		
         }



        

		
		
