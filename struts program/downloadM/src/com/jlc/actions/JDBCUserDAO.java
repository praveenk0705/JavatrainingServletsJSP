package com.jlc.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlc.jdbc.util.DBUtil;

public class JDBCUserDAO implements UserDAO {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	@Override
	public String verifyUser(String un, String pw) {
		String role="";
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select role from user where username=? and password=?");
			ps.setString(1,un);
			ps.setString(2,pw);
			rs=ps.executeQuery();
			while(rs.next()){
			role=rs.getString(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return role;
	}

	@Override
	public int registerUser(String nm, String un, String pw, String rl) {
		int x=0;
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("insert into user(displayname,username,password,role) values(?,?,?,?)");
			ps.setString(1,nm);
			ps.setString(2,un);
			ps.setString(3,pw);
			ps.setString(4,rl);
			x=ps.executeUpdate();
			System.out.println(x);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return x;
	}

}
