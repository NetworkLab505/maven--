package com.melonlink.cxxt.dao;


import java.sql.Timestamp;
import java.util.List;

import com.melonlink.cxxt.entity.User;

public interface UserDao {

	void save(User user);//保存注册用户

	User getByUsername(String username);

	User getEmailByUsername(String username);

	void updateEmailername(String username);

	void updatePassW(String mail, String password);

	void updateTimeIp(Timestamp loginData, String currentIP);

	List<User> getAlluserlist(int pageNow, int pageSize);//用户列表

	void saveAdd(User users);//保存增加用户

	User findUserByEmail(String currentEmail);// 根据用户邮箱查询到用户

	void deleteUserByEmail(User currentUser);// 根据用户删除用户

}
