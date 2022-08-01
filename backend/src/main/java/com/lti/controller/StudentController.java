package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.beans.Marks;
import com.lti.beans.Student;
import com.lti.beans.StudentLoginDTO;
import com.lti.beans.StudentGetMarksDTO;
import com.lti.services.StudentService;

@CrossOrigin(origins = "*")
@RestController	// = @Controller+@ResponseBody
@RequestMapping("/stud-api")
public class StudentController {
	
	@Autowired
	StudentService service;
	
//	http://localhost:8090/stud-api/registerStudent
	@PostMapping("/registerStudent")
	Student registerStudent(@RequestBody Student student) {
		return service.registerStudent(student);
	}
	
//	http://localhost:8090/stud-api/loginStudent
	@PostMapping("/loginStudent")
	boolean loginStudent(@RequestBody StudentLoginDTO student) {
		System.out.println("controller");
		System.out.println(student);
		return service.loginStudent(student.getStudentId(), student.getStudentPassword());
	}
	
//	http://localhost:8090/stud-api/getMarks
	@PostMapping("/getMarks")
	Marks getMarks(@RequestBody StudentGetMarksDTO student) {
		return service.getMarks(student.getStudentId());
	}
	
}