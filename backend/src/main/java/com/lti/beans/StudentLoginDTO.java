package com.lti.beans;

public class StudentLoginDTO {
	
	private int studentId;
	private String studentPassword;
	
	public StudentLoginDTO(int studentId, String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentPassword = studentPassword;
	}

	public StudentLoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "StudentLoginDTO [studentId=" + studentId + ", studentPassword=" + studentPassword + "]";
	}
	
}