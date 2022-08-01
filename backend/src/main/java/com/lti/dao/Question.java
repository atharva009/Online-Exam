package com.lti.dao;

public interface Question {

	static int questionId=0;
	static String questionDesc = "";
	static String questionOptionA = "";
	static String questionOptionB = "";
	static String questionAnswer = "";
	
	
	int getQuestionId();


	void setQuestionId(int questionId);


	String getQuestionDesc();


	void setQuestionDesc(String questionDesc);


	String getQuestionOptionA();


	void setQuestionOptionA(String questionOptionA);


	String getQuestionOptionB();


	void setQuestionOptionB(String questionOptionB);


	public String getQuestionAnswer();


	public void setQuestionAnswer(String questionAnswer);


	@Override
	public String toString();
	
}
