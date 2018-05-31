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
 * Servlet implementation class StudentUpdate
 */
@WebServlet("/update")
public class StudentUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService stuService = new StudentServiceImpl();
	Student student = new Student();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			
			student.setStuId(Integer.parseInt(request.getParameter("stuId")));
			student.setStuName(request.getParameter("stuName"));
			student.setAdNo(request.getParameter("adNo"));
			student.setAdStreet(request.getParameter("adStreett"));
			student.setAdCity(request.getParameter("adCity"));
			student.setStuGender(request.getParameter("gender"));
			student.setClID(1);
			
			stuService.updateStudent(student);
			System.out.println(student.getStuId());
		
	}

}
