package com.rcb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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
 * Servlet implementation class StudentController
 */
@WebServlet("/studentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService studentService=new StudentServiceImpl();
		List<Student> allStudents=new ArrayList<>();
//		//Collection<Student> allStudents = new ArrayList<Student>();
		allStudents=studentService.listAllStudent();
//		//JSONObject json=new JSONObject();
////		for (int i = 0; i < allStudents.size(); i++) {
////			System.out.println(allStudents.get(i).getStuId());
////			System.out.println(allStudents.get(i).getStuName());
////		}
//		
////		
//		try {
//			//json.put("student", allStudents);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//
//	    response.setContentType("application/json");
//	    response.setCharacterEncoding("UTF-8");
//	    response.getWriter().write(json.toString());
		
		ObjectMapper mapper=new ObjectMapper();
		PrintWriter out=response.getWriter();
		mapper.writeValue(out, allStudents);
	
	
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
