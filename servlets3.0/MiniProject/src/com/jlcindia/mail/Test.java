package com.jlcindia.mail;

public class Test {
public static void main(String[] args) {
	String toMail="mycutepankaj@gmail.com";
	String sub="mail from pankaj......";
	String body="<font color=red size=8>How are you boss........</font>";
	MailService.sentMail(toMail, sub, body);
}
}
