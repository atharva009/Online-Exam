package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Marks;
import com.lti.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	private EntityManager em;

//	Register
	@Override
	@Transactional
	public Student registerStudent(Student student) {

		if (em.find(Student.class, student.getStudentId()) == null) {
			em.persist(student);
		}
		else {
//			throw new InvalidStudentException("Student exists!");
		}
		return student;
	}
	
	
//	Login
	@Override
	public boolean loginStudent(int studentId, String studentPassword) {
		
		System.out.println("login dao" + studentId);
		
		
		Student temp = em.find(Student.class, studentId);
		
		System.out.println(temp.getStudentId() + " " + temp.getStudentPassword() + "DATABASE");
		System.out.println(studentId + " " + studentPassword + "PARAMS");
	
		
		if(studentPassword.equals(temp.getStudentPassword())) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
//	Get Student Marks
	@Override
	public Marks getMarks(int studentId) {
		Marks studentMarks = em.find(Marks.class, studentId);
		return studentMarks;
	}

}