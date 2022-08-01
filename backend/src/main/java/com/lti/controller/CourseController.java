package com.lti.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Course;
import com.lti.beans.EnrollStudentDTO;
import com.lti.beans.Student;
import com.lti.services.CourseService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/course-api")
public class CourseController {

	@Autowired
	CourseService service;

	// http://localhost:8090/course-api/addCourse
	// this to add course
	@PostMapping(path = "/addCourse") // , consumes = "application/json"
	boolean addCourse(@RequestBody Course c) {
		System.out.println("Inside conrteoller" + c);
		return service.addCourse(c);
	}

	// http://localhost:8090/course-api/removeCourse
	// this is to remove course
	@PostMapping(path = "/removeCourse/{pid}") // , consumes = "applicatioin/json"
	boolean removeCourse(@PathVariable("pid") int courseId) {
		System.out.println("Inside conrteoller");
		service.removeCourse(courseId);
		return true;
	}

	// http://localhost:8090/course-api/displayCourse
	// this is to remove course
	@GetMapping(path = "/displayCourse")
	public List<Course> getCourse() {
		List<Course> cdList = service.displayCourse();
		return cdList;
	}
	
//	http://localhost:8090/course-api/displayCourse
	
	@PostMapping(path = "/enrollCourse") // , consumes = "application/json"
	Student enrollCourse(@RequestBody EnrollStudentDTO enrStu) {
		System.out.println("Inside controller: " + "studentId: " + enrStu.getStudentId() + "courseId: " + enrStu.getCourseId());
		return service.enrollCourse(enrStu);
	}

}
