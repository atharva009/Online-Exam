package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;
import com.lti.beans.Marks;
import com.lti.beans.Student;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;

//	Login
	@Override
	public boolean loginAdmin(int adminId, String adminPassword) {
		System.out.println("login dao: " + adminId);

		Admin temp = em.find(Admin.class, adminId);

		System.out.println(temp.getAdminPassword() + " " + temp.getAdminId() + "DATABASE");
		System.out.println(adminId + " " + adminPassword + "PARAMS");

		if (adminPassword.equals(temp.getAdminPassword())) {
			return true;
		} else {
			return false;
		}

	}

	// display student marks
	@Override
	public Marks getMarks(int studentId) {
		Marks studentMarks = em.find(Marks.class, studentId);
		return studentMarks;

	}

	// Remove Records
	@Override
	@Transactional
	public boolean removeStudent(int studentId) {
		System.out.println("Student removed! ");
		Student sobj = em.find(Student.class, studentId);
		try {
			em.remove(sobj);
		} catch (Exception e) {
			System.out.println("exception occured" + e.getMessage());
			System.out.println("Exccution continues");
		}
		return true;
	}

}
