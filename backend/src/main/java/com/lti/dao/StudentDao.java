package com.lti.dao;

import com.lti.beans.Marks;
import com.lti.beans.Student;

public interface StudentDao {
	
	Student registerStudent(Student student);
	
	boolean loginStudent(int studentId, String studentPassword);
	
	Marks getMarks(int studentId);
	
}