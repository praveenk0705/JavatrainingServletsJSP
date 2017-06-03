package com.jlcindia.mail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class MailService {
static Properties props;
static JLCPasswordAuthenticator jlcAuthenticator;
static String fromEmail="pankajsctce@gmail.com";
static String password="9349101410";
static{
	try{
		jlcAuthenticator=new JLCPasswordAuthenticator();
		props=new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
	}catch(Exception e){
		e.printStackTrace();
	}
}
public static void sentMail(String to,String sub,String body){
	try{
		Session session=Session.getDefaultInstance(props, jlcAuthenticator);
		Message message=new MimeMessage(session);
		InternetAddress fromAdd=new InternetAddress(fromEmail);
		InternetAddress toAdd=new InternetAddress(to);
		message.setFrom(fromAdd);
		message.setRecipient(Message.RecipientType.TO, toAdd);
		message.setSubject(sub);
		message.setContent(body,"text/html");
		Transport.send(message);
		System.out.println("Done");
	}catch(Exception e){
		e.printStackTrace();
	}
}
static class JLCPasswordAuthenticator extends Authenticator{
	protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(fromEmail, password);
	}
}
}
