package com.dell.struts1;
import java.util.*;
import java.sql.*;

public class JDBCContactDAO implements ContactDAO {

	

	@Override
	public ContactTO getContactByEmail(String email) {
	ContactTO cto=null;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try{
		con=JDBCUtil.getConnection();
		ps=con.prepareStatement("select * from dellcontacts where email=?");
		ps.setString(1,email);
		rs=ps.executeQuery();
		if(rs.next()){
			cto=new ContactTO();
			cto.setContactId(rs.getString(1));
			cto.setFname(rs.getString(2));
			cto.setLname(rs.getString(3));
			cto.setEmail(rs.getString(4));
			cto.setPhone(rs.getString(5));
			cto.setStatus(rs.getString(6));
		}
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
	finally{
		JDBCUtil.releaseResuorce(ps, con, rs);
	}
		return cto;
	}

	
	

}
