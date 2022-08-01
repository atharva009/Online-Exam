package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION_REFERENCE")
public class QuestionReference {
	@Id
	@Column(name="QUESTION_REFERENCE_ID")
	private int questionID;

	public QuestionReference(int questionID) {
		super();
		this.questionID = questionID;
	}
	
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	Course course;
	
	/*@OneToOne
	@JoinColumn(name="QUESTION_ID")
	QuestionJavaLevel1 qjl1;
	
	@OneToOne
	@JoinColumn(name="QUESTION_ID")
	QuestionJavaLevel2 qjl2;*/
	
	/*@OneToOne
	@JoinColumn(name="QUESTION_ID")
	QuestionPythonLevel1 qpl1;*/
	
	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "QuestionReference [questionID=" + questionID + "]";
	}
}
