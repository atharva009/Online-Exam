package com.lti.beans;

public class StudentGetMarksDTO {
	private int studentId;

	public StudentGetMarksDTO(int studentId) {
		super();
		this.studentId = studentId;
	}

	public StudentGetMarksDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "StudentMarksDTO [studentId=" + studentId + "]";
	}
	
}