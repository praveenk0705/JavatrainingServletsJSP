package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;



public class EmployeeData {

	
	public static Employee getEmployee(String username,HttpServletRequest request)throws Exception
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Employee employee = null;
		try
		{
			/*private static final String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver";
			private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
			private static final String USERNAME="system";
			private static final String PASSWORD="manager";
			static{
				try{
				Class.forName(DRIVER_CLASS);
				}catch(ClassNotFoundException e){
				System.out.println("Error loading in driver class");
				e.printStackTrace();
				}}
				public static Connection getConnection(){
				Connection con=null;
				try{
				con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				}catch(Exception e){
				System.out.println("Error in creating Connection");
				e.printStackTrace();
				}*/
			  Class.forName("oracle.jdbc.driver.OracleDriver");
 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
		      stmt=con.createStatement();
			  rs=stmt.executeQuery("select * from login where username='"+username+"'");
					 
			  	if(rs.next())
			     {
			     
				 employee =new Employee();
				 employee.setUsername(rs.getString("username"));
				 employee.setPassword(rs.getString("password"));
			     }
		}
			 catch(Exception e)
			 {
				 System.out.println("getEmployeeException......."+e);
			 }
		return employee;
		
			 
	}
	
	
	public static void removeEmployee(String username)
	throws Exception
	{
		
		
		Connection con=null;
		Statement stmt=null;
		
		
		try
		{
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			 con = DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			 //con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:oraclesevice","scott","tiger");
stmt=con.createStatement();
stmt.executeUpdate("delete from login where username='"+username+"'");
	
		}
		catch(Exception e)
		{
			System.out.println("REMOVE"+e);
		}
		}
	@SuppressWarnings("unchecked")
	public static ArrayList getEmployees()
	{
		Employee employee=null;
		ArrayList employees=new ArrayList();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		try
		{	
	
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		 //con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:oraclesevice","scott","tiger");                    
		
		
			
		System.out.println("1");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from login");
			System.out.println("ResultSet"+rs);
			while(rs.next())
			{
				System.out.println("2");
				employee=new Employee();
				employee.setUsername(rs.getString("username"));
				employee.setPassword(rs.getString("password"));
				employees.add(employee);
			}
		}
		catch(Exception e)
		{System.out.println("Empdataa"+e);
		
		}
		return employees;
		}

	
public static void addEmployee(Employee employee)throws Exception
{
	Connection con=null;
	Statement stmt=null;
	try
	
	{
		
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 //con = DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
		con=MyConn.getConnection();
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		 //con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:oraclesevice","scott","tiger");
		 stmt=con.createStatement();
		 
		 stmt.executeUpdate("insert into login values("+employee.getUsername()+","+employee.getPassword()+")");
		 
		 
		 
		 		
	
	
	
}

catch(Exception e)
{
	System.out.println("abc");
}
}

public static void UpdateEmployee(Employee employee)throws Exception
{
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 con = DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
		 stmt=con.createStatement();
		stmt.executeUpdate("update login set password='"+employee.getPassword()+"' where  username='"+employee.getUsername()+"'");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

