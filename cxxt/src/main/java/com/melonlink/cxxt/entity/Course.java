package com.melonlink.cxxt.entity;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_course")
public class Course {
	private Integer course_id;												//主键id自增
	private String 	direcction;												//学习方向
	private String 	subclass;												//子类
	private Integer grade;													//层次
	private String 	courseName;												//课程名称	
	private String 	courseCode;												//课程编号，由课程名称首字母简写和讲授者首字母简写组合
	private String 	speaker;												//课程主讲	
	private String 	courseSummary;											//课程简介
	private String 	ownershipOfCourse;										//课程来源
	private CourseImg courseImg;											//课程图片
	private String 	createTime;												//创建时间	
	private Integer userNumbers;											//选课人数
	private Integer hitCount;												//点击次数
	
	//使用set集合表达一对多关系	
	private Set<CourseVideo> courseVideos=new HashSet<CourseVideo>();		//课程视频
	private Set<Chapter> courseChapters=new HashSet<Chapter>();				//课程章节
	//使用set集合表达多对多关系
	private Set<User> courseUsers=new HashSet<User>();						//选课用户	
	
	

	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")
	@Column(name = "course_id", length=11)
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	
	@Column(name = "direcction")
	public String getDirecction() {
		return direcction;
	}
	public void setDirecction(String direcction) {
		this.direcction = direcction;
	}
	
	@Column(name = "subclass")
	public String getSubclass() {
		return subclass;
	}
	public void setSubclass(String subclass) {
		this.subclass = subclass;
	}
	
	@Column(name = "grade")
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	@Column(name = "courseName")
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Column(name = "courseCode")
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	@Column(name = "speaker")
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	
	@Column(name = "courseSummary")
	public String getCourseSummary() {
		return courseSummary;
	}
	public void setCourseSummary(String courseSummary) {
		this.courseSummary = courseSummary;
	}
	
	@Column(name = "ownershipOfCourse")
	public String getOwnershipOfCourse() {
		return ownershipOfCourse;
	}
	public void setOwnershipOfCourse(String ownershipOfCourse) {
		this.ownershipOfCourse = ownershipOfCourse;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseImg")
	@Cascade({CascadeType.ALL})

	public CourseImg getCourseImg() {
		return courseImg;
	}
	public void setCourseImg(CourseImg courseImg) {
		this.courseImg = courseImg;
	}
	
	@Column(name = "createTime")
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	@Column(name = "userNumbers")
	public Integer getUserNumbers() {
		return userNumbers;
	}
	public void setUserNumbers(Integer userNumbers) {
		this.userNumbers = userNumbers;
	}
	
	@Column(name = "hitCount")
	public Integer getHitCount() {
		return hitCount;
	}
	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}
	
	
	@OneToMany( fetch = FetchType.LAZY,mappedBy = "course")
	@Cascade({CascadeType.DELETE_ORPHAN,CascadeType.ALL})
	public Set<CourseVideo> getCourseVideos() {
		return courseVideos;
	}
	public void setCourseVideos(Set<CourseVideo> courseVideos) {
		this.courseVideos = courseVideos;
	}
	
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "course")
	@Cascade({CascadeType.DELETE_ORPHAN,CascadeType.ALL})
	public Set<Chapter> getCourseChapters() {
		return courseChapters;
	}
	public void setCourseChapters(Set<Chapter> courseChapters) {
		this.courseChapters = courseChapters;
	}
	
	@ManyToMany( fetch = FetchType.LAZY)
	@Cascade({CascadeType.DELETE_ORPHAN,CascadeType.ALL})
	public Set<User> getCourseUsers() {
		return courseUsers;
	}
	public void setCourseUsers(Set<User> courseUsers) {
		this.courseUsers = courseUsers;
	}	
	
}