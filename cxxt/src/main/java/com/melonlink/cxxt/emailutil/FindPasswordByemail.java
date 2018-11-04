package com.melonlink.cxxt.emailutil;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class FindPasswordByemail {
	private static final String FROM="innovativelab@qq.com";
	public static void sendFindPasswordEmail(String email){
		Session session=getSession();
		MimeMessage message=new MimeMessage(session);
		try {
			message.setSubject("忘记密码，点击下面“找回密码”找回");
			message.setSentDate(new Date());
			message.setFrom(new InternetAddress(FROM));
			message.setRecipient(RecipientType.TO, new InternetAddress(email));
			message.setContent("<a href='http://132.232.5.13:8082/cxxt/updatePassword.jsp' target='_blank'>找回密码</a>","text/html;charset=utf-8");
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public static Session getSession() {
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol","smtp");
		props.setProperty("mail.smtp.host","smtp.qq.com");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.class",
                 "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.auth","true");
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(FROM, "pqlcorjbldtmheca");
			}
		});
		return session;
	}
}
