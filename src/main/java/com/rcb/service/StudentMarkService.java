package com.rcb.service;

import java.util.List;

import com.rcb.model.Student;
import com.rcb.model.StudentMark;

public interface StudentMarkService {
	public boolean insertStudentMark(StudentMark studentMark);

	public List<StudentMark> listAllStudentMark();

	public boolean deleteStudentMark(StudentMark studentMark);

	public boolean updateStudentMark(StudentMark studentMark);

	public StudentMark getStudent(int id);

	public List<StudentMark> listSelectedStudentMark(int id);
	
	public boolean getClassTop(Student student);
}
