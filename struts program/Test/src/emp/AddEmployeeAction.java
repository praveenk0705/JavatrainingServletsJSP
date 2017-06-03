package emp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import emp.MyConn;

public class AddEmployeeAction extends Action {
	Connection conn=null;
	PreparedStatement pstmt=null;
	Connection Conn=null;
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws
			IOException,ServletException
			{
	  
              String target=new String("success");
              EmployeeForm loginForm = (EmployeeForm) form;
              String userName = loginForm.getUsername();
              String password=loginForm.getPassword();
              
              
			
			System.out.println("aaaaaaaaaa"+userName);
			
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
			  
			
			try 
			{
				//pstmt=Conn.prepareStatement("update  employee set name='ppppp'");	
       pstmt=Conn.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1,userName);
			pstmt.setString(2,password);
			int a=pstmt.executeUpdate();
			System.out.println(a+"Record inserted");
			}
		
			catch(Exception e)
			{
				System.out.println("Bad ..........."+e);
			}
			
			
			return(mapping.findForward(target));
			}

}