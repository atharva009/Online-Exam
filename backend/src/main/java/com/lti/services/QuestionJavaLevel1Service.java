package com.lti.services;

import java.util.List;

import com.lti.beans.QuestionJavaLevel1;

public interface QuestionJavaLevel1Service extends QuestionService{
	int addQuestion(QuestionJavaLevel1 qjl1);
	
	boolean updateQuestion(QuestionJavaLevel1 qjl1);
	
	boolean removeQuestion(int id);

	List<QuestionJavaLevel1> displayQuestion();

}
