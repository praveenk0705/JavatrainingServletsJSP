package com.jlcindia.struts1;

public class UserServiceImpl implements UserService {

	@Override
	public String verifyUser(String un, String pw) {
		return DAOFactory.getUserDAO().verifyUser(un,pw);
	}

}
