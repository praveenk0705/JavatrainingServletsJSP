package emp;
import java.sql.*;
public class MyConn {
	 
	public static  Connection getConnection()
	{
		Connection con = null;
	 try
	 {               
	            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	            con= DriverManager.getConnection("jdbc:odbc:global","SCOTT","TIGER");
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		 //con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl","scott","tiger");                    
	 }
	 catch(Exception e)
	 {
	 
		System.out.println(e);
	
	 			
	 }
	
	return con;
	 
	}
}
//Class.forName("oracle.jdbc.driver.OracleDriver");

//con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl","scott","tiger");
