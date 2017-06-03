package com.jlcindia.struts1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil {
	private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/jlcindiadb";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	static{
	try{
	Class.forName(DRIVER_CLASS);
	}catch(ClassNotFoundException e){
	System.out.println("Error occurd durig loading Driver class");
	e.printStackTrace();
	}
	}
	public static Connection getConnection(){
	Connection con=null;
	try{
	con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}catch(Exception e){
	System.out.println("Error in creating the connection");
	e.printStackTrace();
	}
	return con;
	}
	public static void releaseResuorce(Statement st,Connection con){
	try{

	if(st!=null)st.close();
	if(con!=null)con.close();
	}catch(Exception e){
	System.out.println("Error in Closing the resource");
	e.printStackTrace();
	}
	}
public static void releaseResuorce(PreparedStatement ps, Connection con,ResultSet rs
			) {
		
		try{
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
			}
		catch(Exception e){
			System.out.println("Error in Closing the resource");
			e.printStackTrace();
			}
		
	}

}