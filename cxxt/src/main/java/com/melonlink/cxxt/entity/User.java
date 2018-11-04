package com.melonlink.cxxt.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user")
public class User {
	private Integer uid;
	private String username;
	private String password;
	private String telephone;
	private String mail;
	private String college;
	private String department;
	private String major;	
	private String currentIP;	                                                //当前IP
	private Timestamp createData;                                               //创建时间
	private Timestamp expireData;                                               //终止时间	
	private Timestamp loginData;                                                //登录时间
	private Integer enabled;	                                                //激活邮箱状态

	//使用set集合表达多对多关系
	private Set<Course> userCourses=new HashSet<Course>();						//用户的选课
	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")//主键自增策略
	@Column(name = "uid", length=11)
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}
	@Column(name = "username", length = 8)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password", length = 16, nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "telephone", length = 11)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Column(name = "mail", length = 32)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	@Column(name = "college", length = 64)
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	@Column(name = "department", length = 64)
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Column(name = "major", length = 64)
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Column(name = "currentIP", length = 32)
	public String getCurrentIP() {
		return currentIP;
	}

	public void setCurrentIP(String currentIP) {
		this.currentIP = currentIP;
	}
	@Column(name = "createData", length = 32)
	public Timestamp getCreateData() {
		return createData;
	}

	public void setCreateData(Timestamp createData) {
		this.createData = createData;
	}
	@Column(name = "expireData", length = 32)
	public Timestamp getExpireData() {
		return expireData;
	}

	public void setExpireData(Timestamp expireData) {
		this.expireData = expireData;
	}
	@Column(name = "loginData", length = 32)
	public Timestamp getLoginData() {
		return loginData;
	}

	public void setLoginData(Timestamp loginData) {
		this.loginData = loginData;
	}
	@Column(name = "enabled", length = 32)
	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	@ManyToMany( fetch = FetchType.LAZY,mappedBy="courseUsers")
	@Cascade({CascadeType.DELETE_ORPHAN,CascadeType.ALL})
	public Set<Course> getUserCourses() {
		return userCourses;
	}

	public void setUserCourses(Set<Course> userCourses) {
		this.userCourses = userCourses;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", telephone=" + telephone
				+ ", mail=" + mail + ", college=" + college + ", department=" + department + ", major=" + major
				+ ", currentIP=" + currentIP + ", createData=" + createData + ", expireData=" + expireData
				+ ", loginData=" + loginData + ", enabled=" + enabled + ", userCourses=" + userCourses + "]";
	}
	
}
