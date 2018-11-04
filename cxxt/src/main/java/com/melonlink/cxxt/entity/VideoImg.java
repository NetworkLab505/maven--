package com.melonlink.cxxt.entity;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_videoImg")
public class VideoImg {
	
	private Integer 	img_id;				//图片主键ID，自增
	private String  	imgName;			//图片名称
	private String  	imgSummary;			//图片简介
	private String  	imgUrl;				//图片获取路径	
	private CourseVideo	courseVideo;		//课程对应视频，和视频一对一关系
	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")
	@Column(name = "img_id", length=11)
	public Integer getImg_id() {
		return img_id;
	}
	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}
	@Column(name = "imgName", length = 32,unique = true, nullable=false)
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	@Column(name = "imgSummary", length = 50, nullable=false)
	public String getImgSummary() {
		return imgSummary;
	}
	public void setImgSummary(String imgSummary) {
		this.imgSummary = imgSummary;
	}
	@Column(name = "imgUrl", length = 50, nullable=false)
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="courseVideo")
	@Cascade({CascadeType.ALL})
	public CourseVideo getCourseVideo() {
		return courseVideo;
	}
	public void setCourseVideo(CourseVideo courseVideo) {
		this.courseVideo = courseVideo;
	}

}
