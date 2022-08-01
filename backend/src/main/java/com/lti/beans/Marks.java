package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "MARKS")
public class Marks {
	
//	@Id
//	@Column(name = "SERIAL_NO")
	private int serial_no;
	
//	@ManyToOne
//	@JoinColumn(name = "STU_ID")
	private int studentId;
	
//	@Column(name = "SCORE")
	private int score;
	
//	@Column(name = "COURSE_ID")
	private int courseId;

	public Marks(int serial_no, int studentId, int score, int courseId) {
		super();
		this.serial_no = serial_no;
		this.studentId = studentId;
		this.score = score;
		this.courseId = courseId;
	}

	public Marks() {
		super();
	}

	public int getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Marks [serial_no=" + serial_no + ", studentId=" + studentId + ", score=" + score + ", courseId="
				+ courseId + "]";
	}
	
}
