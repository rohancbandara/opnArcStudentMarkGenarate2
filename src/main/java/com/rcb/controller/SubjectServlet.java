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

import com.rcb.model.Subject;
import com.rcb.service.SubjectService;
import com.rcb.service.SubjectServiceImpl;

/**
 * Servlet implementation class SubjectServlet
 */
@WebServlet("/subject")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Subject subject=new Subject();
	SubjectService subService=new SubjectServiceImpl();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Subject> allSubject=new ArrayList<>();
		allSubject=subService.listAllSubject();
		ObjectMapper mapper=new ObjectMapper();
		PrintWriter out=response.getWriter();
		mapper.writeValue(out, allSubject);
		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
