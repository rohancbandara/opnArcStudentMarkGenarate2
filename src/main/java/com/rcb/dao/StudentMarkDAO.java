package com.rcb.dao;

import java.util.List;

import com.rcb.model.Student;
import com.rcb.model.StudentMark;

public interface StudentMarkDAO {
	public boolean insertStudentMark(StudentMark studentMark);

	public List<StudentMark> listAllStudentMark();

	public boolean deleteStudentMark(StudentMark studentMark);

	public boolean updateStudentMark(StudentMark studentMark);

	public StudentMark getStudent(int id);

	public List<StudentMark> listSelectedStudentMark(int id);

	public Student getClassTop(Student student);
}
