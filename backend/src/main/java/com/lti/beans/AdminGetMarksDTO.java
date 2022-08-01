package com.lti.beans;

public class AdminGetMarksDTO {
	
	private int studentId;

	public AdminGetMarksDTO() {
		super();
	}

	public AdminGetMarksDTO(int studentId) {
		super();
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "AdminGetMarksDTO [studentId=" + studentId + "]";
	}
	
	

}
