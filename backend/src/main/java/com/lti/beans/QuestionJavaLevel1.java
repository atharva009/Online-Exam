package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lti.dao.Question;

@Entity
@Table(name="QUESTION_JAVA_LEVEL_1")
public class QuestionJavaLevel1 implements Question{

	@Id
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION_DESCRIPTION")
	private String questionDesc;
	
	@Column(name="QUESTION_OPTION_A")
	private String questionOptionA;
	
	@Column(name="QUESTION_OPTION_B")
	private String questionOptionB;
	
	@Column(name="QUESTION_OPTION_C")
	private String questionOptionC;
	
	@Column(name="QUESTION_OPTION_D")
	private String questionOptionD;
	
	@Column(name="QUESTION_ANSWER")
	private String questionAnswer;
	
	@ManyToOne
	@JoinColumn(name = "COURSE_ID")
	private Course course;

	public QuestionJavaLevel1(int questionId, String questionDesc, String questionOptionA, String questionOptionB,
			String questionOptionC, String questionOptionD, String questionAnswer, Course course) {
		super();
		this.questionId = questionId;
		this.questionDesc = questionDesc;
		this.questionOptionA = questionOptionA;
		this.questionOptionB = questionOptionB;
		this.questionOptionC = questionOptionC;
		this.questionOptionD = questionOptionD;
		this.questionAnswer = questionAnswer;
		this.course = course;
	}

	public QuestionJavaLevel1() {
		super();
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public String getQuestionOptionA() {
		return questionOptionA;
	}

	public void setQuestionOptionA(String questionOptionA) {
		this.questionOptionA = questionOptionA;
	}

	public String getQuestionOptionB() {
		return questionOptionB;
	}

	public void setQuestionOptionB(String questionOptionB) {
		this.questionOptionB = questionOptionB;
	}

	public String getQuestionOptionC() {
		return questionOptionC;
	}

	public void setQuestionOptionC(String questionOptionC) {
		this.questionOptionC = questionOptionC;
	}

	public String getQuestionOptionD() {
		return questionOptionD;
	}

	public void setQuestionOptionD(String questionOptionD) {
		this.questionOptionD = questionOptionD;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "QuestionJavaLevel1 [questionId=" + questionId + ", questionDesc=" + questionDesc + ", questionOptionA="
				+ questionOptionA + ", questionOptionB=" + questionOptionB + ", questionOptionC=" + questionOptionC
				+ ", questionOptionD=" + questionOptionD + ", questionAnswer=" + questionAnswer + ", course=" + course
				+ "]";
	}
	
}
