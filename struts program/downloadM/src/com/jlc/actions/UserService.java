package com.jlc.actions;

public interface UserService {

	String verifyUser(String un, String pw);

	int registerUser(String nm, String un, String pw, String rl);


}
