package com.melonlink.cxxt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_courseImg")
public class CourseImg {
	
	private Integer img_id;				//图片主键ID，自增
	private String  imgName;			//图片名称
	private String  imgSummary;			//图片简介
	private String  imgUrl;				//图片获取路径
	private Course  course;				//图片对应课程，一对一关系
	
	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")//主键自增策略
	@Column(name="img_id", length=11, unique=true,nullable=false)
   public Integer getImg_id() {
		return img_id;
	}
	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}
	@Column(name = "imgName", length = 40,unique=true,nullable=false)
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	@Column(name = "imgSummary", length = 40,unique=true,nullable=false)
	public String getImgSummary() {
		return imgSummary;
	}
	public void setImgSummary(String imgSummary) {
		this.imgSummary = imgSummary;
	}
	@Column(name = "imgUrl", length = 30,unique=true,nullable=false)
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course")
	@Cascade({CascadeType.ALL})
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
   
}
