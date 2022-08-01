package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Marks;
import com.lti.beans.Student;
import com.lti.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao dao;
	
	@Override
	public Student registerStudent(Student student) {
		return dao.registerStudent(student);
	}

	@Override
	public boolean loginStudent(int studentId, String studentPassword) {
		return dao.loginStudent(studentId, studentPassword);
	}

	@Override
	public Marks getMarks(int studentId) {
		return dao.getMarks(studentId);
	}
	
	
	
}