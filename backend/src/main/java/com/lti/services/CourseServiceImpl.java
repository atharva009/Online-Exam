package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Course;
import com.lti.beans.EnrollStudentDTO;
import com.lti.beans.Student;
import com.lti.dao.CourseDao;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao dao;
	
	
	@Override
    public boolean addCourse(Course c) {
        return dao.addCourse(c);
    }


	@Override
	public boolean removeCourse(int courseId) {
		
		return dao.removeCourse(courseId);
	}


	@Override
	public List<Course> displayCourse() {
		
		return dao.displayCourse();
	}


	@Override
	public Student enrollCourse(EnrollStudentDTO enrStu) {
		return dao.enrollCourse(enrStu);
	}
}
