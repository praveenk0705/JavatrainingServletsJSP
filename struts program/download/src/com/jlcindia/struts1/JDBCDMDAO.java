package com.jlcindia.struts1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class JDBCDMDAO implements DMDAO {
	@Override
	public List<Download> showDownload() {
		Download download=null;
		List<Download> downloads=new ArrayList<Download>();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{	
			  con=DBUtil.getConnection();
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
