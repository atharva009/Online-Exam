package com.lti.services;

import com.lti.beans.Marks;
import com.lti.beans.Student;
import com.lti.beans.StudentCourseDTO;

public interface StudentService {
	
	Student registerStudent(Student student);
	
	boolean loginStudent(int studentId, String studentPassword);
	
	Marks getMarks(int studentId);
	
}