package com.jlc.actions;

public class DAOFactory_2 {
	static DMDAO dmDAO;
	static{
		dmDAO=new JDBCDMDAO();
	}
	public static DMDAO getDMDAO(){
		return dmDAO;
	}
	static UserDAO userDAO;
	static{
		userDAO=new JDBCUserDAO();
	}
	public static UserDAO getUserDAO(){
		return userDAO;
	}

}
