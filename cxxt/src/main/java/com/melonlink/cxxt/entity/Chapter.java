package com.melonlink.cxxt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_chapter")
public class Chapter {
	
	private Integer chapter_id;
	private String 	chapterOrder;
	private String  chapterName;
	private String  chapterSummary;	
	private Course  course;
	
	
	@Id
	@GenericGenerator(name = "generator", strategy = "native")
	@GeneratedValue(generator = "generator")
	@Column(name = "chapter_id", length=11)
	public Integer getChapter_id() {
		return chapter_id;
	}
	public void setChapter_id(Integer chapter_id) {
		this.chapter_id = chapter_id;
	}
	
	@Column(name = "chapterOrder")
	public String getChapterOrder() {
		return chapterOrder;
	}
	public void setChapterOrder(String chapterOrder) {
		this.chapterOrder = chapterOrder;
	}
	
	@Column(name = "chapterNamer")
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	
	@Column(name = "chapterSummary")
	public String getChapterSummary() {
		return chapterSummary;
	}
	public void setChapterSummary(String chapterSummary) {
		this.chapterSummary = chapterSummary;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	@Cascade({CascadeType.ALL})

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
