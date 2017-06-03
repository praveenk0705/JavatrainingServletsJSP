package com.jlc.actions;

public interface UserDAO {

	String verifyUser(String un, String pw);

	int registerUser(String nm, String un, String pw, String rl);

}
