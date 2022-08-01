package com.lti.dao;

import com.lti.beans.Marks;

public interface AdminDao {
	
	//LOGIN
	boolean loginAdmin(int adminId, String adminPassword);

	//FETCH MARKS
	Marks getMarks(int studentId);
	
	//REMOVE STUDENT
	boolean removeStudent(int studentId);
}
