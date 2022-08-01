package com.lti.services;

import com.lti.beans.Marks;

public interface AdminService {

	//LOGIN
	boolean loginAdmin(int adminId, String adminPassword);

	//FETCH MARKS
	Marks getMarks(int studentId);
	
	//REMOVE STUDENT
	boolean removeStudent(int studentId);
}
