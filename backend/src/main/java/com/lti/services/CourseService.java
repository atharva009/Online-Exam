package com.lti.services;

import java.util.List;

import com.lti.beans.Course;
import com.lti.beans.EnrollStudentDTO;
import com.lti.beans.Student;

public interface CourseService {

	
	boolean addCourse(Course c);
	
	boolean removeCourse(int courseId);
	
	List<Course> displayCourse();
	
	Student enrollCourse(EnrollStudentDTO enrStu);
	

}
