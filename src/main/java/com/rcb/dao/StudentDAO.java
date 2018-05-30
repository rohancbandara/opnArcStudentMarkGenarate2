package com.rcb.dao;

import java.util.List;

import com.rcb.model.Student;

public interface StudentDAO  {
	public boolean insertStudent(Student student);

	public List<Student> listAllStudent();

	public boolean deleteStudent(Student student);

	public boolean updateStudent(Student student);

	public Student getStudent(int id);

	public List<Student> listSelectedStudent(int id);
}
