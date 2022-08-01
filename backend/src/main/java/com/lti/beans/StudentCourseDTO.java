package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class StudentCourseDTO {
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentEmail;
	private long studentPhoneNumber;
	private String studentPassword;
	private int courseId;
	
	public StudentCourseDTO(int studentId, String studentFirstName, String studentLastName, String studentEmail,
			long studentPhoneNumber, String studentPassword, int courseId) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentPassword = studentPassword;
		this.courseId = courseId;
	}
	
	public StudentCourseDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	@Override
	public String toString() {
		return "StudentCourseDTO [studentId=" + studentId + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentEmail=" + studentEmail + ", studentPhoneNumber="
				+ studentPhoneNumber + ", studentPassword=" + studentPassword + ", courseId=" + courseId + "]";
	}
	
}
