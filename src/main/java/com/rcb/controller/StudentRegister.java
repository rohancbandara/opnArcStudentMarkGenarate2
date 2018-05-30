package com.rcb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.rcb.model.Student;
import com.rcb.service.StudentService;
import com.rcb.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentRegister
 */
@WebServlet("/studentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student student = new Student();
		student.setStuName(request.getParameter("stuName"));
		student.setAdNo(request.getParameter("adNo"));
		student.setAdStreet(request.getParameter("adStreett"));

		student.setAdCity(request.getParameter("adCity"));
		student.setStuGender(request.getParameter("gender"));
		student.setClID(1);
		StudentService stuService = new StudentServiceImpl();
		stuService.insertStudent(student);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
