package com.jlc.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jlc.beans.DownloadBean;
import com.jlc.jdbc.util.DBUtil;

public class JDBCDMDAO implements DMDAO {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	@Override
	public List<DownloadBean> showDownload() {
		List<DownloadBean> list=new ArrayList<DownloadBean>();
		DownloadBean load=null;
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select dname from download where status='enable'");
			rs=ps.executeQuery();
			while(rs.next()){
				load=new DownloadBean();
				load.setDownloadname(rs.getString(1));
				list.add(load);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return list;
	}

	@Override
	public int addDownload(String fileName) {
		int x=0;
		System.out.println(fileName);
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("insert into download(dname,status) values(?,'enable')");
			ps.setString(1, fileName);
			x=ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return x;
	}

	@Override
	public List<DownloadBean> getAllDownload() {
		List<DownloadBean> list=new ArrayList<DownloadBean>();
		DownloadBean load=null;
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select * from download");
			rs=ps.executeQuery();
			while(rs.next()){
				load=new DownloadBean();
				load.setId(rs.getString(1));
				load.setDownloadname(rs.getString(2));
				load.setStatus(rs.getString(3));
				list.add(load);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return list;
	}

	@Override
	public int updateDownload(String id, String dname, String st) {
		int x=0;
		System.out.println(id);
		int d=Integer.parseInt(id);
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("update download set dname=?,status=? where id=?");
			ps.setString(1, dname);
			ps.setString(2, st);
			ps.setInt(3, d);
			x=ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.releaseResuorce(rs, ps, con);
		}
		return x;
	}

}
