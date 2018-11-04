package com.melonlink.cxxt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_courseVideo")
public class CourseVideo {
	
	private Integer video_id;							//视频主键ID
	private Integer videoOrder;							//视频顺序
	private String  videoName;							//本集视频名称  
	private String  videoInstructor;					//本视频讲授者
	private String  videoSummary;						//视频内容简介
	private String  videoKeypoints;						//本视频关键知识点
	private String  videoUrl;							//视频存储地址
	private Course  course;								//视频对应课程，多对一关系
	private Chapter chapter;							//视频对应章，多对一关系
	private VideoImg videoImg;							//视频对应的图片，一对一关系
	
	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")//主键自增策略
	@Column(name="video_id", length=11, unique=true,nullable=false)
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	@Column(name = "videoOrder", length = 40,unique=true,nullable=false)
	public Integer getVideoOrder() {
		return videoOrder;
	}
	public void setVideoOrder(Integer videoOrder) {
		this.videoOrder = videoOrder;
	}
	@Column(name = "videoName", length = 40,unique=true,nullable=false)
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	@Column(name = "videoInstructor", length = 40,unique=true,nullable=false)
	public String getVideoInstructor() {
		return videoInstructor;
	}
	public void setVideoInstructor(String videoInstructor) {
		this.videoInstructor = videoInstructor;
	}
	@Column(name = "videoSummary", length = 40,unique=true,nullable=false)
	public String getVideoSummary() {
		return videoSummary;
	}
	public void setVideoSummary(String videoSummary) {
		this.videoSummary = videoSummary;
	}
	@Column(name = "videoKeypoints", length = 40,unique=true,nullable=false)
	public String getVideoKeypoints() {
		return videoKeypoints;
	}
	public void setVideoKeypoints(String videoKeypoints) {
		this.videoKeypoints = videoKeypoints;
	}
	@Column(name = "videoUrl", length = 40,unique=true,nullable=false)
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseVideos")
	@Cascade({CascadeType.ALL})
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chapter")
	@Cascade({CascadeType.ALL})
	public Chapter getChapter() {
		return chapter;
	}
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	@OneToOne(fetch = FetchType.LAZY)//这个属性决定了你在查询的时候，是先查主表记录再查关联记录，还是要把关联表的记录一起查询出来
	@JoinColumn(name = "videoImg")//指定外键
	@Cascade({CascadeType.ALL})
	public VideoImg getVideoImg() {
		return videoImg;
	}
	public void setVideoImg(VideoImg videoImg) {
		this.videoImg = videoImg;
	}
	
}
