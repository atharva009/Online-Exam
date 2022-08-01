package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Course;
import com.lti.beans.EnrollStudentDTO;
import com.lti.beans.Student;

@Repository
public class CourseDaoImpl implements CourseDao {

	@PersistenceContext
	private EntityManager em;
	

	@Override
	@Transactional
	public boolean addCourse(Course c) {
		try
		{
			//Course obj = em.find(Course.class,c.getCourseId());
			em.persist(c);
		}
		catch(Exception e)
		{
			System.out.println("exception: " + e.getMessage());
		}
		return true ;	
	}
	
	@Override
	@Transactional
	public boolean removeCourse(int courseId) {
		System.out.println("course to be removed ");
		Course cobj= em.find(Course.class, courseId);
		try
		{
			em.remove(cobj);
		}
		catch(Exception e)
		{
			System.out.println("exception occured" + e.getMessage());
			System.out.println("Exccution continues");
		}
		return true;
	}
	
	@Override
    public List<Course> displayCourse() {
        System.out.println("this is to display ");
        TypedQuery<Course> qry = em.createQuery("Select c from Course c", Course.class);
        List<Course> cList = qry.getResultList();
        System.out.println(cList);
        return cList;
    }

	@Override
	@Transactional
	public Student enrollCourse(EnrollStudentDTO enrStu) {
		
		Student stuObj = em.find(Student.class, enrStu.getStudentId());
		
		Course courObj = em.find(Course.class, enrStu.getCourseId());
		
		stuObj.setCourses(courObj);
		
		em.persist(stuObj);
		
		return em.find(Student.class, enrStu.getStudentId());
		
	}
	
	
	}
	
		
		
		
		
		
		
		
		
		
		/*if(em.find(Course.class,c.getCourseId())== null){
			em.persist(c);
		}
		else {
			//throw new
			//InvalidCourseException("Course alteady Exist");
		}
		return c;
		}*/
		

    
