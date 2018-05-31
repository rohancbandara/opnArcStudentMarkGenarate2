package com.rcb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.rcb.model.Student;
import com.rcb.service.StudentService;
import com.rcb.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService stuService = new StudentServiceImpl();
	Student student = new Student();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		student.setStuName(request.getParameter("stuName"));
		student.setAdNo(request.getParameter("adNo"));
		student.setAdStreet(request.getParameter("adStreett"));
		student.setAdCity(request.getParameter("adCity"));
		student.setStuGender(request.getParameter("gender"));
		student.setClID(1);

		stuService.insertStudent(student);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> allStudents = new ArrayList<>();
		allStudents = stuService.listAllStudent();
		ObjectMapper mapper = new ObjectMapper();
		PrintWriter out = response.getWriter();
		mapper.writeValue(out, allStudents);

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> selectStudents=new ArrayList<>();
		selectStudents=stuService.listSelectedStudent(Integer.parseInt(request.getParameter("stuId")));
		ObjectMapper mapper=new ObjectMapper();
		PrintWriter out=response.getWriter();
		mapper.writeValue(out, selectStudents);
		
		
		
	}
	

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		student.setStuId(Integer.parseInt(request.getParameter("stuId")));
		stuService.deleteStudent(student);
		
	}

}
