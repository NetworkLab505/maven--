package com.melonlink.cxxt.service.impl;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.melonlink.cxxt.dao.UserDao;
import com.melonlink.cxxt.emailutil.EmailUtils;
import com.melonlink.cxxt.emailutil.FindPasswordByemail;
import com.melonlink.cxxt.entity.User;
import com.melonlink.cxxt.service.UserService;
import com.melonlink.cxxt.telephoneutil.singlesend;



public class UserServiceImpl implements UserService {
	singlesend sing=new singlesend();
	private UserDao ud;
	private String verificationde1;//发送到手机上的验证码
	private HttpServletRequest request;
	private String verificationde=null;
    //String codeUrl=UUID.randomUUID().toString();
    Matcher m=null;
    Pattern p=Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$"); 
	@Override
	public User sendMobile(User user) throws UnsupportedEncodingException {//注册时发送短信及邮箱
		if(singlesend.isMobileNO(user.getTelephone())==true) {
			m=p.matcher(user.getMail());
			if(m.matches()==true) {	
				user.setEnabled(0);	
	        EmailUtils.sendAccountActivateEmail(user.getUsername(),user.getPassword(),user.getMail());
			}else 
				throw new RuntimeException("邮箱错误!");
			String veri = null;
//		   try {
//			veri = sing.Send(user.getTelephone());
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		    setVerificationde1(veri);
		}
		else 
			throw new RuntimeException("手机号码错误!");
	    System.out.println("发送成功");

		return user;
	}

	@Override
	public void saveUser(User user) {//保存注册用户
		//verificationde = request.getParameter("verificationde");//页面输入的验证码
		System.out.println("保存成功");
		//if(verificationde1.equals(user.getVerificationde())==true)
		ud.save(user);
		//else
			//throw new RuntimeException("验证码错误!");	
	}

	@Override
	public User getUserBynamePassword(User user) {//登录的时候判断密码是否正确，邮箱是否激活
		User existU = ud.getByUsername(user.getUsername());
		if(existU==null){
			throw new RuntimeException("用户名为空!");
		}
		if(!existU.getPassword().equals(user.getPassword())){
			throw new RuntimeException("密码错误！");
		}
		if(existU.getEnabled()!=1)
			throw new RuntimeException("邮箱未激活!");
	    return existU;
	}

	@Override
	public User setEmailByusername(String Username) {//通过用户名找到邮箱发送邮件激活邮箱
		System.out.println(Username);
		User U = ud.getEmailByUsername(Username);
		if(U.getMail()==null) {
			throw new RuntimeException("邮箱为空!");
		}else
		ud.updateEmailername(U.getUsername());
		return U;
	}

	@Override
	public void findPasWByemail(String mail) {//通过邮箱找密码
		m=p.matcher(mail);
		if(m.matches()==true) {
		FindPasswordByemail.sendFindPasswordEmail(mail);
	   }
		else
			throw new RuntimeException("邮箱错误!");	
	}
	@Override
	public void saveTimeIP(Timestamp loginData, String currentIP) {//保存时间与IP
		System.out.println("保存时间与IP");
		ud.updateTimeIp(loginData,currentIP);
	}
	@Override
	public void updatePasWByemail(User user) {//通过邮箱修改密码
		ud.updatePassW(user.getMail(),user.getPassword());
	}
	@Override
	public List<User> getAlluserList(int pageNow, int pageSize) {//用户列表
		List<User> userlist = ud.getAlluserlist(pageNow, pageSize);
		return userlist;
	}
	@Override
	public void saveAddUser(User users) {//保存增加用户
		ud.saveAdd(users);
		
	}
	@Override
	public User findUserByEmail(String currentEmail) {// 根据用户邮箱查询到用户
		User U = ud.findUserByEmail(currentEmail);
		return U;
	}

	@Override
	public void deleteUser(User currentUser) {// 根据用户删除用户
		ud.deleteUserByEmail(currentUser);
		
	}
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	public String getVerificationde1() {
		return verificationde1;
	}

	public void setVerificationde1(String verificationde1) {
		this.verificationde1 = verificationde1;
	}
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
}
