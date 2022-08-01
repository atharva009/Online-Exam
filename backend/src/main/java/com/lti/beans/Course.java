package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="COURSES")
public class Course {
	
	@Id
	@Column(name="COURSE_ID")
	private int courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Column(name="COURSE_TOTAL_MARKS")
	private int courseTotalMarks;
	
	@Column(name="COURSE_PASS_MARKS")
	private int coursePassingMarks;
	
	@ManyToOne
	@JoinColumn(name = "ADMIN_ID")
	Admin admin;
	
//	@ManyToOne
//	@JoinColumn(name = "STU_ID")
//	Student student;

	public Course(int courseId, String courseName, int courseTotalMarks, int coursePassingMarks, Admin admin) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTotalMarks = courseTotalMarks;
		this.coursePassingMarks = coursePassingMarks;
		this.admin = admin;
	}

	public Course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseTotalMarks() {
		return courseTotalMarks;
	}

	public void setCourseTotalMarks(int courseTotalMarks) {
		this.courseTotalMarks = courseTotalMarks;
	}

	public int getCoursePassingMarks() {
		return coursePassingMarks;
	}

	public void setCoursePassingMarks(int coursePassingMarks) {
		this.coursePassingMarks = coursePassingMarks;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseTotalMarks=" + courseTotalMarks
				+ ", coursePassingMarks=" + coursePassingMarks + ", admin=" + admin + "]";
	}
	
}
