package com.rcb.service;

import java.util.List;

import com.rcb.dao.StudentMarkDAO;
import com.rcb.dao.StudentMarkDAOImpl;
import com.rcb.model.Student;
import com.rcb.model.StudentMark;

public class StudentMarkServiceImpl implements StudentMarkService {
	private StudentMarkDAO studentMarkDAO = new StudentMarkDAOImpl();
	StudentMark studentMark = new StudentMark();
	Student student=new Student();

	@Override
	public boolean insertStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		return studentMarkDAO.insertStudentMark(createStudentMark(studentMark));
	}

	@Override
	public List<StudentMark> listAllStudentMark() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudentMark getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentMark> listSelectedStudentMark(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentMark createStudentMark(StudentMark stumark) {
		studentMark.setClId(stumark.getClId());
		studentMark.setDate(stumark.getDate());
		studentMark.setStudentId(stumark.getStudentId());
		studentMark.setSubId1(stumark.getSubId1());
		studentMark.setSubMark1(stumark.getSubMark1());
		studentMark.setSubId2(stumark.getSubId2());
		studentMark.setSubMark2(stumark.getSubMark2());
		studentMark.setSubId3(stumark.getSubId3());
		studentMark.setSubMark3(stumark.getSubMark3());
		studentMark.setSubId4(stumark.getSubId4());
		studentMark.setSubMark4(stumark.getSubMark4());
		studentMark.setSubId5(stumark.getSubId5());
		studentMark.setSubMark5(stumark.getSubMark5());

		return studentMark;
	}
	public Student createStudent(Student stu) {
		student.setClID(stu.getClID());
		return stu;
	}

	@Override
	public boolean getClassTop(Student student) {
		// TODO Auto-generated method stub
		studentMarkDAO.getClassTop(createStudent(student));
		return false;
	}


}
