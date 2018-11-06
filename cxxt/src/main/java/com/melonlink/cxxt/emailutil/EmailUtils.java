package com.melonlink.cxxt.emailutil;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EmailUtils {
	private static final String FROM="18893092219@163.com";
	public static String sendAccountActivateEmail(String username,String password,String email) {
		Session session=getSession();
		MimeMessage message=new MimeMessage(session);
		try {
			message.setSubject("亲爱的同学：欢迎进入电信学院创新实验室学习！");
			message.setSentDate(new Date());
			message.setFrom(new InternetAddress(FROM));
			message.setRecipient(RecipientType.TO, new InternetAddress(email));
			System.out.println(email+username);
		    message.setContent("<a target='_BLANK' href='http://127.0.0.1:8888/cxxt/activate.jsp?username="+username+"&password="+password+"'target='_blank'>点击激活</a>","text/html;charset=utf-8");
			Transport.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	public static Session getSession() {
		Properties props=new Properties();
		props.setProperty("mail.transport.protocol","smtp");
		props.setProperty("mail.smtp.host","smtp.163.com");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.class",
                 "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.auth","true");
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(FROM, "1148557850foreve");
			}
		});
		return session;
	}
}
