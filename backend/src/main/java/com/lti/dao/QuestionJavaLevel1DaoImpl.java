package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.QuestionJavaLevel1;

@Repository
public class QuestionJavaLevel1DaoImpl implements QuestionJavaLevel1Dao{

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional
	public int addQuestion(QuestionJavaLevel1 qjl1) {
		System.out.println("Question Java Level 1: dao layer - addQuestion method");
		em.persist(qjl1);
		return qjl1.getQuestionId();
	}
	@Override
	@Transactional
	public boolean updateQuestion(QuestionJavaLevel1 qjl1) {
		System.out.println("Question Java Level 1: dao layer - updateQuestion method");
		try
		{
			em.merge(qjl1);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e.getMessage());
			System.out.println("Execution Continues");
		}
		return true;
	}

	@Override
	@Transactional
	public boolean removeQuestion(int id) {
		System.out.println("Question Java Level 1: dao layer - removeQuestion method");
		QuestionJavaLevel1 qjl1 = em.find(QuestionJavaLevel1.class, id);
		try
		{
			em.remove(qjl1);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e.getMessage());
			System.out.println("Execution Continues");
		}
		return true;
	}

	@Override
	public List<QuestionJavaLevel1> displayQuestion() {
		System.out.println("Question Java level 1: dao layer - displayQuestion method");
		TypedQuery<QuestionJavaLevel1> qry = em.createQuery("Select qjl1 from QuestionJavaLevel1 qjl1", QuestionJavaLevel1.class);
		List<QuestionJavaLevel1> qjList = qry.getResultList();
		System.out.println(qjList);
		return qjList;
	}

}
