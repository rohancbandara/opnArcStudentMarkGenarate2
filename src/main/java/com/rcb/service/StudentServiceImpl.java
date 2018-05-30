package com.rcb.service;

import java.util.List;
import com.rcb.dao.StudentDAO;
import com.rcb.dao.StudentDAOImpl;
import com.rcb.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO = new StudentDAOImpl();
	Student student = new Student();

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		return	studentDAO.insertStudent(createNewStudent(student));

	}

	@Override
	public List<Student> listAllStudent() {
		// TODO Auto-generated method stub

		return studentDAO.listAllStudent();
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentDAO.deleteStudent(createNewStudent(student));
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		System.out.println("updated!!!!!!");
		return studentDAO.updateStudent(createNewStudent(student));
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	private Student createNewStudent(Student stu) {
		student.setStuId(stu.getStuId());
		student.setStuName(stu.getStuName());
		student.setAdNo(stu.getAdNo());
		student.setAdStreet(stu.getAdStreet());
		
		student.setAdCity(stu.getAdCity());
		student.setClID(stu.getClID());
		return student;
	}

	@Override
	public List<Student> listSelectedStudent(int id) {
		// TODO Auto-generated method stub
		return studentDAO.listSelectedStudent(id);
	}

}
