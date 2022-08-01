package com.lti.dao;

import java.util.List;

import com.lti.beans.QuestionJavaLevel1;

public interface QuestionJavaLevel1Dao extends QuestionDao{
	int addQuestion(QuestionJavaLevel1 qj);
	
	boolean updateQuestion(QuestionJavaLevel1 qjl1);
	
	boolean removeQuestion(int id);

	List<QuestionJavaLevel1> displayQuestion();
}
