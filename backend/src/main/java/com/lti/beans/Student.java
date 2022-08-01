package com.lti.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class Student {
	
	@Id
	@Column(name="STU_ID")
	private int studentId;
	
	@Column(name="STU_FIRST_NAME")
	private String studentFirstName;
	
	@Column(name="STU_LAST_NAME")
	private String studentLastName;

	@Column(name="STU_EMAIL")
	private String studentEmail;
	
	@Column(name="STU_PHONE")
	private long studentPhoneNumber;
	
	@Column(name="STU_PASSWORD")
	private String studentPassword;
	
	@OneToOne
	Course courses;

	public Student(int studentId, String studentFirstName, String studentLastName, String studentEmail,
			long studentPhoneNumber, String studentPassword, Course courses) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentPassword = studentPassword;
		this.courses = courses;
	}

	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(long studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentEmail=" + studentEmail + ", studentPhoneNumber=" + studentPhoneNumber
				+ ", studentPassword=" + studentPassword + ", courses=" + courses + "]";
	}
	
}