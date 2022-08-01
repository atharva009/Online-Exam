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

import com.lti.beans.QuestionJavaLevel1;
import com.lti.services.QuestionJavaLevel1Service;

@CrossOrigin(origins = "*")
@RequestMapping("/question-api")
@RestController
public class QuestionController {
	
	@Autowired
	QuestionJavaLevel1Service qjl1service;
//	QuestionJavaLevel2Service qjl2service;
//	QuestionPythonLevel1Service qpl1service;
	
	@PostMapping("/addQuestionJavaLevel1")
	public QuestionJavaLevel1 addJQuestionJavaLevel1(@RequestBody QuestionJavaLevel1 qjl1)
	{
		System.out.println(qjl1.getCourse());
		qjl1service.addQuestion(qjl1);
		return qjl1;
	}
	
	@GetMapping("/displayQuestionJavaLevel1")
	public List<QuestionJavaLevel1> getQuestionJavaLevel1()
	{
		List<QuestionJavaLevel1> qjl1List= qjl1service.displayQuestion();
		return qjl1List;
	}
	
	@PostMapping("/updateQuestionJavaLevel1")
	public boolean updateQuestionJavaLevel1(@RequestBody QuestionJavaLevel1 qjl1)
	{
		qjl1service.updateQuestion(qjl1);
		return true;
	}
	
	@PostMapping("/removeQuestionJavaLevel1/{pId}")
	public boolean removeQuestionJavaLevel1(@PathVariable("pId") int id)
	{
		qjl1service.removeQuestion(id);
		return true;
	}
//	@PostMapping("/addQuestionJavaLevel2")
//	public QuestionJavaLevel2 addQuestionJavaLevel2(@RequestBody QuestionJavaLevel2 qjl2)
//	{
//		qjl2service.addQuestion(qjl2);
//		return qjl2;
//	}
//	
//	@GetMapping("/displayQuestionJavaLevel2")
//	public List<QuestionJavaLevel2> getQuestionJavaLevel2()
//	{
//		List<QuestionJavaLevel2> qjl2List= qjl2service.displayQuestion();
//		return qjl2List;
//	}
//	
//	@PostMapping("/updateQuestionJavaLevel2")
//	public boolean updateQuestionJavaLevel2(@RequestBody QuestionJavaLevel2 qjl2)
//	{
//		qjl2service.updateQuestion(qjl2);
//		return true;
//	}
//	
//	@PostMapping("/removeQuestionJavaLevel2/{pId}")
//	public boolean removeQuestionJavaLevel2(@PathVariable("pId") int id)
//	{
//		qjl2service.removeQuestion(id);
//		return true;
//	}
//	@PostMapping("/addQuestionPythonLevel1")
//	public QuestionPythonLevel1 addQuestionPythonLevel1(@RequestBody QuestionPythonLevel1 qpl1)
//	{
//		qpl1service.addQuestion(qpl1);
//		return qpl1;
//	}
//	
//	@GetMapping("/displayQuestionPythonLevel1")
//	public List<QuestionPythonLevel1> getQuestionPythonLevel1()
//	{
//		List<QuestionPythonLevel1> qpl1List= qpl1service.displayQuestion();
//		return qpl1List;
//	}
//	
//	@PostMapping("/updateQuestionPythonLevel1")
//	public boolean updateQuestionPythonLevel1(@RequestBody QuestionPythonLevel1 qjl2)
//	{
//		qpl1service.updateQuestion(qjl2);
//		return true;
//	}
//	
//	@PostMapping("/removeQuestionPythonLevel1/{pId}")
//	public boolean removeQuestionPythonLevel1(@PathVariable("pId") int id)
//	{
//		qpl1service.removeQuestion(id);
//		return true;
//	}
	
}
