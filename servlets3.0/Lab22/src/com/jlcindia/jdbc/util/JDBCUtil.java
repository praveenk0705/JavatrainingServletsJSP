package com.jlcindia.jdbc.util;
import java.sql.*;
public abstract class JDBCUtil {
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.out.println("Error in Loading Driver Class\n");
			e.printStackTrace();
		}
	}
public static Connection getMySQLConnection(){
	Connection con=null;
	try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj", "root", "pankaj");
	}catch(Exception e){
		System.out.println("Error in Creating the Connection\n");
		e.printStackTrace();
	}
	return con;
}
public static void cleanup(Connection con,Statement st){
	try{
		if(st != null)
			st.close();
		if(con != null)
			con.close();
	}catch(Exception e){
		System.out.println("Error in closing the resource\n");
		e.printStackTrace();
	}
}
public static void cleanup(Connection con,Statement st,ResultSet rs){
	try{
		if(rs != null)
			rs.close();
		if(st != null)
			st.close();
		if(con != null)
			con.close();
	}catch(Exception e){
		System.out.println("Error in closing the resource\n");
		e.printStackTrace();
	}
}
}
