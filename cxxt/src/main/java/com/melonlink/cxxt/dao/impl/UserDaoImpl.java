package com.melonlink.cxxt.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.melonlink.cxxt.dao.UserDao;
import com.melonlink.cxxt.entity.User;
import com.opensymphony.xwork2.ActionContext;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	public void save(User u) {
		getHibernateTemplate().save(u);
	}
	@Override
	public User getByUsername(final String username) {
		return getHibernateTemplate().execute(new HibernateCallback<User>() {
			@Override
			public User doInHibernate(Session session) throws HibernateException {
				String hql = "from User where username = ? ";
					Query query = session.createQuery(hql);
					query.setParameter(0, username);
					User user = (User) query.uniqueResult();
				return user;
			}
		});
	}
	@Override
	public User getEmailByUsername(final String username) {//通过用户名找到邮箱号激活邮箱
		//HQL
		return getHibernateTemplate().execute(new HibernateCallback<User>() {
		@Override
		public User doInHibernate(Session session) throws HibernateException {
		String hql = "from User where username = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, username);
		User user = (User) query.uniqueResult();
		return user;
					}
				});
	}
	@Override
	public void updateEmailername(String username) {//通过用户名修改邮箱激活状态
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		String hql="update User user set user.enabled=1 where user.username ='"+username+"'";
        Query queryupdate=session.createQuery(hql);
		queryupdate.executeUpdate();
        trans.commit();
		}

	@Override
	public void updatePassW(String mail, String password) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		String hql="update User user set user.password='"+password+"' where user.mail ='"+mail+"'";
		Query queryupdate=session.createQuery(hql);
		queryupdate.executeUpdate();
        trans.commit();
	}
	@Override
	public void updateTimeIp(Timestamp loginData, String currentIP) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		String hql="update User user set user.loginData='"+loginData+"',user.currentIP ='"+currentIP+"'";
		Query queryupdate=session.createQuery(hql);
		queryupdate.executeUpdate();
        trans.commit();
	}
	@Override
	public List<User> getAlluserlist(int pageNow, int pageSize) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		String hql="from User";
		Query query=session.createQuery(hql);
		query.setFirstResult((pageNow-1)*pageSize);
		query.setMaxResults(pageSize);
		@SuppressWarnings("unchecked")
		List<User> userlist=query.list();
		trans.commit();
		if (userlist.size() > 0) {
			return userlist;
		}
		return null;
	}
	@Override
	public void saveAdd(User users) {//保存增加用户
		getHibernateTemplate().save(users);
	}
	@Override
	public User findUserByEmail(String currentEmail) {// 根据用户邮箱查询到用户
		return getHibernateTemplate().execute(new HibernateCallback<User>() {
			@Override
			public User doInHibernate(Session session) throws HibernateException {
			String hql = "from User where mail = ? ";
			Query query = session.createQuery(hql);
			query.setParameter(0, currentEmail);
			User user = (User) query.uniqueResult();
			return user;
						}
					});
	}
	@Override
	public void deleteUserByEmail(User currentUser) {// 根据用户邮箱删除用户
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction trans=session.beginTransaction();
		String hql="Delete User user where user.mail ='"+currentUser.getMail()+"'";
		Query queryupdate=session.createQuery(hql);
		queryupdate.executeUpdate();
        trans.commit();
		
	}
}
