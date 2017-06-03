package com.jlc.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jlc.jdbc.util.DBUtil;

public class JDBCDMDAO implements DMDAO {
	@Override
	public List<String> showDownload(String cat) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<String> list=new ArrayList<String>();
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select dname from downloads where cat=?");
			ps.setString(1,cat);
			rs=ps.executeQuery();
			while(rs.next()){
				list.add(rs.getString(1));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return list;
	}

}
