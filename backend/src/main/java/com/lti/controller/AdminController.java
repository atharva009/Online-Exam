package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.AdminGetMarksDTO;
import com.lti.beans.AdminLoginDTO;
import com.lti.beans.Marks;
import com.lti.services.AdminService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin-api")
public class AdminController {

	@Autowired
	AdminService service;

//  http://localhost:8090/admin-api/loginAdmin
	@PostMapping("/loginAdmin")
	boolean loginAdmin(@RequestBody AdminLoginDTO admin) {
		System.out.println("controller");
		System.out.println(admin);
		return service.loginAdmin(admin.getAdminId(), admin.getAdminPassword());
	}

	// http://localhost:8090/admin-api/getMarks
	@GetMapping("/getMarks")
	Marks getMarks(@RequestBody AdminGetMarksDTO student) {
		return service.getMarks(student.getStudentId());
	}

	// http://localhost:8090/admin-api/removeStudent/102
	// this is to remove student
	@PostMapping(path = "/removeStudent/{pid}") // , consumes = "application/json"
	boolean removeStudent(@PathVariable("pid") int studentId) {
		System.out.println("Inside conrteoller");
		service.removeStudent(studentId);
		return true;
	}

}
