package com.melonlink.cxxt.service;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.List;

import com.melonlink.cxxt.entity.User;

public interface UserService {
	public User sendMobile(User user) throws UnsupportedEncodingException ;//发送验证

	void saveUser(User user);

	User getUserBynamePassword(User user);

	User setEmailByusername(String Username);

	void findPasWByemail(String mail);

	void updatePasWByemail(User user);

	public void saveTimeIP(Timestamp loginData, String currentIP);//保存登录时的时间与IP

	public List<User> getAlluserList(int pageNow, int pageSize);//用户列表

	public void saveAddUser(User users);//保存增加用户

	public User findUserByEmail(String currentEmail);// 根据用户邮箱查询到用户

	public void deleteUser(User currentUser);// 根据用户删除用户

}
