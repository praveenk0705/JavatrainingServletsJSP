package com.sk.struts;

import java.util.ArrayList;
import java.util.HashMap;

public class A {
public static void main(String args[]){
	HashMap hm=new HashMap();
	hm.put("1","xy6");
	hm.put("2","xy4");
	hm.put("3","xy3");
	hm.put("4","xy1");
	
	ArrayList list =new ArrayList();
	list.addAll(hm.entrySet());
	System.out.println(list);
	
	
	System.out.println("hello");
}
}
