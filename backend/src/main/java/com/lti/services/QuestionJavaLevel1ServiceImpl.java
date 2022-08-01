package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.QuestionJavaLevel1;
import com.lti.dao.QuestionJavaLevel1Dao;

@Service("questionJavaLevel1Service")
public class QuestionJavaLevel1ServiceImpl implements QuestionJavaLevel1Service{

	@Autowired
	QuestionJavaLevel1Dao qjl1dao;
	@Override
	public int addQuestion(QuestionJavaLevel1 qj) {
		System.out.println("Question Java: Service layer - addQuestion method");
		return(qjl1dao.addQuestion(qj));
	}

	@Override
	public boolean updateQuestion(QuestionJavaLevel1 qjl1) {
		System.out.println("Question Java Level 1: Service layer - updateQuestion method");
		return (qjl1dao.updateQuestion(qjl1));
	}

	@Override
	public boolean removeQuestion(int id) {
		System.out.println("Question Java Level 1: Service layer - removeQuestion method");
		return (qjl1dao.removeQuestion(id));
	}

	@Override
	public List<QuestionJavaLevel1> displayQuestion() {
		System.out.println("Question Java Level 1: Service layer - displayQuestion method");
		return qjl1dao.displayQuestion();
	}
	

}
