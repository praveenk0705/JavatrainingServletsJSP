package com.jlc.actions;

public class UserServiceImpl implements UserService {

	@Override
	public String verifyUser(String un, String pw) {
		return DAOFactory.getUserDAO().verifyUser(un,pw);
	}

	@Override
	public int registerUser(String nm, String un, String pw, String rl) {
		return DAOFactory.getUserDAO().registerUser(nm,un,pw,rl);
	}

}
