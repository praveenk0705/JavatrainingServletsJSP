package com.jlcindia.struts1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBCUserDAO implements UserDAO {

	@Override
	public String verifyUser(String un, String pw) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String role="";
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select role from user where username=? and password=?");
			ps.setString(1,un);
			ps.setString(2,pw);
			rs=ps.executeQuery();
			while(rs.next()){
			role=rs.getString("role");
			System.out.println(role);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return role;
	}

}
