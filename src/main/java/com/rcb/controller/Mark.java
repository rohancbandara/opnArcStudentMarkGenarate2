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
import com.rcb.model.StudentMark;
import com.rcb.service.StudentMarkService;
import com.rcb.service.StudentMarkServiceImpl;

/**
 * Servlet implementation class Mark
 */
@WebServlet("/mark")
public class Mark extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentMarkService stuMarkService=new StudentMarkServiceImpl();
	StudentMark studentMark=new StudentMark();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mark() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println(request.getParameter("stuId"));
//		List<StudentMark> stuMarks=new ArrayList<>();
//		stuMarks=markService.listSelectedStudentMark(Integer.parseInt(request.getParameter("stuId")));
//		PrintWriter out=response.getWriter();
//		ObjectMapper mapper=new ObjectMapper();
//		mapper.writeValue(out, stuMarks);
//		
//		
//	
//		for (int i = 0; i < stuMarks.size(); i++) {
//			System.out.println(stuMarks.get(i).getSubMark1());
//			
//		
//		}
		

		studentMark.setDate("2018/06/1");
		studentMark.setStudentId(Integer.parseInt(request.getParameter("stuId")));
		studentMark.setSubId1(Integer.parseInt(request.getParameter("subId1")));
		studentMark.setSubMark1(Double.parseDouble(request.getParameter("subMark1")));
		studentMark.setSubId2(Integer.parseInt(request.getParameter("subId2")));
		studentMark.setSubMark2(Double.parseDouble(request.getParameter("subMark2")));
		studentMark.setSubId3(Integer.parseInt(request.getParameter("subId3")));
		studentMark.setSubMark3(Double.parseDouble(request.getParameter("subMark3")));
		studentMark.setSubId4(Integer.parseInt(request.getParameter("subId4")));
		studentMark.setSubMark4(Double.parseDouble(request.getParameter("subMark4")));
		studentMark.setSubId5(Integer.parseInt(request.getParameter("subId5")));
		studentMark.setSubMark5(Double.parseDouble(request.getParameter("subMark5")));
		
		stuMarkService.insertStudentMark(studentMark);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
