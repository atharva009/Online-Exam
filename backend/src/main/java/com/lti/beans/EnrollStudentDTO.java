package com.lti.beans;

public class EnrollStudentDTO {
	
	private int studentId; 
	private int courseId;
	
	public EnrollStudentDTO(int studentId, int courseId) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
	}

	public EnrollStudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "EnrollStudentDTO [studentId=" + studentId + ", courseId=" + courseId + "]";
	}
	
	
}
