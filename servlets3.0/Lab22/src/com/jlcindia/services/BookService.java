package com.jlcindia.services;

import java.util.*;
import java.sql.*;
import com.jlcindia.to.BookTo;
import com.jlcindia.jdbc.util.JDBCUtil;

public class BookService {
public List<BookTo> getBooksByCat(String cat){
	List<BookTo> books=new ArrayList<BookTo>();
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try{
		con=JDBCUtil.getMySQLConnection();
		String sql="select * from jlcbooks where cat=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, cat);
		rs=ps.executeQuery();
		while(rs.next()){
			BookTo bto=new BookTo();
			bto.setBid(rs.getInt(1));
			bto.setBname(rs.getString(2));
			bto.setAuthor(rs.getString(3));
			bto.setCost(rs.getDouble(4));
			bto.setCat(rs.getString(5));
			bto.setPub(rs.getString(6));
			bto.setIsbn(rs.getString(7));
			books.add(bto);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(con, ps, rs);
	}
	return books;
}
}
