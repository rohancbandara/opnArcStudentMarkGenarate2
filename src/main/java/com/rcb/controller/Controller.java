package com.rcb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rcb.model.Student;
import com.rcb.model.StudentMark;
import com.rcb.model.Subject;
import com.rcb.model.SubjectMark;
import com.rcb.service.StudentMarkService;
import com.rcb.service.StudentMarkServiceImpl;
import com.rcb.service.StudentService;
import com.rcb.service.StudentServiceImpl;
import com.rcb.service.SubjectService;
import com.rcb.service.SubjectServiceImpl;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		System.out.println(action);
		try {
			switch (action) {
			// Student Controllers
			case "/allStudents":
				allStudents(request, response);
				break;
			case "/insertStudent":
				insertStudent(request, response);
				break;
			case "/updateStudent":
				updateStudent(request, response);
				break;
			case "/deleteStudent":
				deleteStudent(request, response);
				break;
			case "/selectStudent":
				selectStudent(request, response);
				break;

			// Subject Controllers
			case "/allSubjects":
				allSubject(request, response);
				break;
			case "/insertSubject":
				insertSubject(request, response);
				break;
			case "/updateSubject":
				updateSubject(request, response);
				break;
			case "/deleteSubject":
				deleteSubject(request, response);
				break;
			case "/selectSubject":
				selectSubject(request, response);
				break;

			// Student Marks Controllers
			case "/classTop":
				classTop(request,response);
				break;
			case "/allStudentsMark":
				allStudentsMark(request, response);
				break;
			case "/insertStudentMark":
				insertStudentMark(request, response);
				break;
			case "/updateStudentMark":
				updateStudentMark(request, response);
				break;
			case "/deleteStudentMark":
				deleteStudentMark(request, response);
				break;
			case "/selectStudentMark":
				selectStudentMark(request, response);
				break;
			default:
				System.out.println("home");
				break;

			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

	private void classTop(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Student student=new Student();
		StudentMarkService studentMarkService=new StudentMarkServiceImpl();
		student.setClID(2);
		
		studentMarkService.getClassTop(student);
		
		
	}

	private void selectStudentMark(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void deleteStudentMark(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void updateStudentMark(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void insertStudentMark(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	StudentMark studentMark=new StudentMark();
	StudentMarkService stuMarkService = new StudentMarkServiceImpl();
	studentMark.setDate("2018/05/28");
	studentMark.setStudentId(2);
	studentMark.setSubId1(1);
	studentMark.setSubMark1(35);
	studentMark.setSubId2(2);
	studentMark.setSubMark2(35);
	studentMark.setSubId3(3);
	studentMark.setSubMark3(69);
	studentMark.setSubId4(4);
	studentMark.setSubMark4(88);
	studentMark.setSubId5(5);
	studentMark.setSubMark5(85);
	
	stuMarkService.insertStudentMark(studentMark);
	}

	private void allStudentsMark(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void selectSubject(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		SubjectService subService = new SubjectServiceImpl();
		subService.listSelectedSubject(1);
	}

	private void deleteSubject(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void updateSubject(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void insertSubject(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		subject.setSubName("maths");
		SubjectService subService = new SubjectServiceImpl();
		subService.insertSubject(subject);

	}

	private void allSubject(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("control ok");
		SubjectService subService = new SubjectServiceImpl();
		subService.listAllSubject();

	}

	private void selectStudent(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		StudentService stuService = new StudentServiceImpl();
		Student student = new Student();
		student.setStuId(Integer.parseInt(request.getParameter("id")));
		stuService.listSelectedStudent(student.getStuId());

	}

	private void allStudents(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		StudentService stuService = new StudentServiceImpl();

		stuService.listAllStudent();

	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		StudentService stuService = new StudentServiceImpl();
		Student st = new Student();

		st.setStuId(10);
		stuService.deleteStudent(st);
		response.sendRedirect("home");
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		StudentService stuService = new StudentServiceImpl();
		Student st = new Student();
		st.setStuId(3);
		st.setStuName("xxxx");
		st.setAdNo("");
		st.setAdStreet("");
		
		st.setAdCity("");
		st.setClID(1);
		stuService.updateStudent(st);
		response.sendRedirect("home");
	}

	private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentService stuService = new StudentServiceImpl();
		Student st = new Student();

		st.setStuName("CC");
		st.setAdNo("");
		st.setAdStreet("");
		
		st.setAdCity("");
		st.setClID(3);
		st.setStuGender("male");
		stuService.insertStudent(st);
		response.sendRedirect("home");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
