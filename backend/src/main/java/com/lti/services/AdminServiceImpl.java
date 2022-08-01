package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Marks;
import com.lti.dao.AdminDao;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao dao;
	
	@Override
	public boolean loginAdmin(int adminId, String adminPassword) {
		return dao.loginAdmin(adminId, adminPassword);
	}

	@Override
    public Marks getMarks(int studentId) {
        return dao.getMarks(studentId);
    }

	@Override
	public boolean removeStudent(int studentId) {
		return dao.removeStudent(studentId);

	}
	
	
	
	
}
