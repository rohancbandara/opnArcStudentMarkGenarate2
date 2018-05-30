package com.rcb.service;

import java.util.List;

import com.rcb.model.Student;

public interface StudentService {
	public boolean insertStudent(Student student);

	public List<Student> listAllStudent();

	public boolean deleteStudent(Student student);

	public boolean updateStudent(Student student);

	public Student getStudent(int id);

	public List<Student> listSelectedStudent(int id);
}
