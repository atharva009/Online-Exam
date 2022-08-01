package com.lti.beans;

public class QuestionRefereneDTO {
	private int questionId;
	private int courseId;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "QuestionRefereneDTO [questionId=" + questionId + ", courseId=" + courseId + "]";
	}
	public QuestionRefereneDTO(int questionId, int courseId) {
		super();
		this.questionId = questionId;
		this.courseId = courseId;
	}
	public QuestionRefereneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
