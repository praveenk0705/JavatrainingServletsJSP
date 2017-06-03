package com.jlcindia.struts1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import sun.jkernel.DownloadManager;



public class EmployeeData {

	
	public static ArrayList getEmployees()
	{
		Dowload employee=null;
		ArrayList employees=new ArrayList();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		try
		{	
	
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jlcindiadb","root","root");
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		 //con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:oraclesevice","scott","tiger");                    
		
		
			/*
		    System.out.println("1");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from login");
			System.out.println("ResultSet"+rs);
			while(rs.next())
			{
				System.out.println("2");
				employee=new Dowload();
				employee.setUsername(rs.getString("username"));
				
				employees.add(employee);
			}
		}
		catch(Exception e)
		{
			System.out.println("Empdataa"+e);
		}
		
		
		return employees;
		}
*/
			  System.out.println("1");
				stmt=con.createStatement();
				rs=stmt.executeQuery("select * from download");
				System.out.println("ResultSet"+rs);
				while(rs.next())
				{
					System.out.println("2");
					employee=new Dowload();
					employee.setId(rs.getString("id"));
					employee.setDownloadname(rs.getString("downloadname"));
					employee.setStatus(rs.getString("status"));
					employees.add(employee);
				}
			}
			catch(Exception e)
			{
				System.out.println("Empdataa"+e);
			}
			
			
			return employees;
			}
}
