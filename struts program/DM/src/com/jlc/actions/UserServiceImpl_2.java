package com.jlc.actions;

public class UserServiceImpl_2 implements UserService {

	@Override
	public String verifyUser(String un, String pw) {
		return DAOFactory.getUserDAO().verifyUser(un,pw);
	}

}
