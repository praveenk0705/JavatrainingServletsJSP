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

public class RequestProcessAction extends Action
{
	Connection conn=null;
	PreparedStatement pstmt=null;
	String name;
	
	Connection Conn=null;
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
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws
			IOException,ServletException
			{
	   String target=new String("success");
		 
		 RequestProcessForm requestProcess=(RequestProcessForm)form;
		 name=requestProcess.getName();
		 phone=requestProcess.getPhone();
		 email=requestProcess.getEmail();
		 from=requestProcess.getFrom();
		 to=requestProcess.getTo();
		 type=requestProcess.getType();
		 hour=requestProcess.getHour();
		 description=requestProcess.getDescription();
		 datetime=requestProcess.getDatetime();
		 leave=requestProcess.getLeave();
		 comments=requestProcess.getComments();
		 		System.out.println("aaaaaaaaaauuuuuuu");
		
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
		//pstmt=Conn.prepareStatement("update absencerequest set name='cccccccccc' where email='"+email+"'");
       pstmt=Conn.prepareStatement("insert into absencerequest values(?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1,name);
		pstmt.setString(2,phone);
		pstmt.setString(3,email);
		pstmt.setString(4,from );
		pstmt.setString(5,to);
		pstmt.setString(6,type);
		pstmt.setString(7,hour);
		pstmt.setString(8,description);
		pstmt.setString(9,datetime);
		pstmt.setString(10,"request");
		pstmt.setString(11,comments);
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