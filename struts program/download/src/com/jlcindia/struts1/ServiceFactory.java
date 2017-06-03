package com.jlcindia.struts1;

import org.apache.struts.actions.DispatchAction;

public class ServiceFactory extends DispatchAction{
	static UserService userService;
	static{
		userService=new UserServiceImpl();
	}
	static DMService dmService;
	static{
		dmService=new DMServiceImpl();
	}


}
