package com.wrox;

import javax.sql.DataSource;

import conn.Mycon;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmployeeData {
	public static Employee getEmployee(String username)
	throws Exception
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		Employee employee=null;
	
	try
	{
		//conn=dataSource.getConnection();
		conn=Mycon.getConnection();
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from employees where username='"+username+"'");
		if(rs.next())
		{
			employee=new Employee();
			employee.setUsername(rs.getString("username"));
			employee.setPassword(rs.getString("password"));
			employee.setDepid(new Integer(rs.getInt("depid")));
			employee.setRoleid(new Integer(rs.getString("roleid")));
			String name=rs.getString("name");
			employee.setName(name);
			employee.setPhone(rs.getString("phone"));
			employee.setEmail(rs.getString("email"));
		}
		else
		{
			throw new Exception(username+"not found!");
		}
	}
	finally
	{
		if(rs!=null)
		{
			rs.close();
		}
		if(stmt!=null)
		{
			stmt.close();
		}
		
		if(conn!=null)
		{
			conn.close();
		}
	}
	return employee;
	}
	public static ArrayList<Employee> getEmployees()
	{
		Employee employee=null;
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Connection conn=Mycon.getConnection();
		//Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try
		{
			//DataSource dataSource=null;
			
			//conn=dataSource.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from employees");
			
			while(rs.next())
			{
				employee=new Employee();
				employee.setUsername(rs.getString("username"));
				//employee.setName(rs.getString("name"));
				//employee.setRolename(rs.getString("rolename"));
				//employee.setPhone(rs.getString("phone"));
				//employee.setEmail(rs.getString("email"));
				//employee.setRoleid(new Integer(rs.getInt("roleid")));
               // employee.setDepid(new Integer(rs.getInt("depid")));
				//employee.setDepartment(rs.getString("depname"));
				//employees.add(employee);
				System.err.println("Username:"
						+employee.getUsername());
						
			}
		}
		catch(SQLException e)
		{
			System.err.println(e.getMessage());
		}
		
		return employees;
	}
	public static void removeEmployee(String username)
	throws Exception
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			//conn=dataSource.getConnection();
			conn=Mycon.getConnection();
			stmt=conn.createStatement();
			//StringBuffer sqlString=new StringBuffer("delete from employees");
			//sqlString.append("where username='"+username+"'");
			String str="delete from employees where username='"+username+"'";
			stmt.execute(str);
			//stmt.execute(sqlString.toString());
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		}
	}


public static void addEmployee(Employee employee)
throws Exception
{
	
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try
	{
	
		conn=Mycon.getConnection();
		//conn=dataSource.getConnection();
	
		stmt=conn.createStatement();
		String uname=employee.getUsername();
		String pwd=employee.getPassword();
		Integer rid=employee.getRoleid();
		String name=employee.getName();
		String ph=employee.getPhone();
		String email=employee.getEmail();
		Integer depid=employee.getDepid();
		String str="insert into employees values('"+uname+"','"+pwd+"',"+rid+",'"+name+"','"+ph+"','"+email+"',"+depid+")";
		stmt.execute(str);
		/*StringBuffer sqlString=new StringBuffer("insert into employees");
		sqlString.append("values(\""
				+employee.getUsername()+"\",");
		sqlString.append("\""+
				employee.getPassword()+"\",");
		
		sqlString.append("\""
				+employee.getRoleid()+"\",");
		sqlString.append("\""
				+employee.getName()+"\",");
		sqlString.append("\""
				+employee.getPhone()+"\",");
		sqlString.append("\""
				+employee.getEmail()+"\",");
		sqlString.append("\""
				+employee.getDepid()+"\",");
		stmt.execute(sqlString.toString());*/
	}
		
		
	finally
	{
		if(rs!=null)
		{
			rs.close();
		}
		if(stmt!=null)
		{
			stmt.close();
		}
		if(conn!=null)
		{
			conn.close();
		}
	}

}
public static void updateEmployee(Employee employee)throws Exception
		{

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try
{
	System.out.println("2");
	conn=Mycon.getConnection();
	//conn=dataSource.getConnection();
	stmt=conn.createStatement();
	System.out.println("33");
	String uname=employee.getUsername();
	System.out.println(uname);
	System.out.println("hello");
	String pwd=employee.getPassword();
	Integer rid=employee.getRoleid();
	System.out.println("1123");
	String name=employee.getName();
	String ph=employee.getPhone();
	String email=employee.getEmail();
	Integer depid=employee.getDepid();
	String str1="update employees set password='"+pwd+"',roleid="+rid+",name='"+name+"',phone='"+ph+"',email='"+email+"',depid="+depid+" where username='"+uname+"'";
	
	//String str="update employees set password='"+pwd+"' roleid="+rid+",name='"+name+"',phone='"+ph+"',email='"+email+"',depid="+depid+" where username='"+uname+"'";
	System.out.println("3");
	int i=stmt.executeUpdate(str1);
	if(i>0)
	{
		System.out.println("5");
	}
	System.out.println("4");

	/*StringBuffer sqlString=new StringBuffer("update employees");
	sqlString.append("set password='"+employee.getPassword()+"',");
sqlString.append("roleid="+employee.getRoleid()+",");
sqlString.append("name='"+employee.getName()+"',");
sqlString.append("phone='"+employee.getPhone()+"',");
sqlString.append("email='"+employee.getEmail()+"',");
sqlString.append("depid="+employee.getDepid()+" ");
sqlString.append("where username='"+employee.getUsername()+"'");
stmt.execute(sqlString.toString());*/
}
finally
{
	if(rs!=null)
	{
		rs.close();
	}
	if(stmt!=null)
	{
		stmt.close();
	}
	if(conn!=null)
	{
		conn.close();
	}
}
}



}