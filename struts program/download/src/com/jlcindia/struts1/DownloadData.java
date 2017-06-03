package com.jlcindia.struts1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class DownloadData {
public static ArrayList<Download> getEmployees()
	{
		Download download=null;
		ArrayList<Download> downloads=new ArrayList<Download>();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{	
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jlcindiadb","root","root");
			  System.out.println("1");
			  stmt=con.createStatement();
			  rs=stmt.executeQuery("select * from download");
			  System.out.println("ResultSet"+rs);
			  while(rs.next())
				{
					download=new Download();
					download.setId(rs.getString("id"));
					download.setDownloadname(rs.getString("downloadname"));
					download.setStatus(rs.getString("status"));
					downloads.add(download);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception"+e);
			}
			return downloads;
			}
}
