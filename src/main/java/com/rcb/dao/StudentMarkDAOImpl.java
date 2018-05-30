package com.rcb.dao;

import java.sql.ResultSet;
import java.util.List;

import com.rcb.model.Student;
import com.rcb.model.StudentMark;
import com.rcb.utility.DbConnection;

public class StudentMarkDAOImpl extends DbConnection implements StudentMarkDAO {
	Student newSudent = new Student();

	@Override
	public boolean insertStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		try {
			String sql1 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId1()
					+ "','" + studentMark.getSubMark1() + "')";
			String sql2 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId2()
					+ "','" + studentMark.getSubMark2() + "')";
			String sql3 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId3()
					+ "','" + studentMark.getSubMark3() + "')";
			String sql4 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId4()
					+ "','" + studentMark.getSubMark4() + "')";
			String sql5 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId5()
					+ "','" + studentMark.getSubMark5() + "')";

			putData(sql1);
			putData(sql2);
			putData(sql3);
			putData(sql4);
			putData(sql5);

			String sqlUpdateAvg = "UPDATE tblStudent set avg='" + getAvg(studentMark.getStudentId()) + "' WHERE stuId='"
					+ studentMark.getStudentId() + "'";
			putData(sqlUpdateAvg);

			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
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
	public List<StudentMark> listSelectedStudentMark(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getAvg(int id) {
		double avg = 0;
		try {
			String sql = "SELECT AVG(tblstudentmark.stmMark)as avg  FROM tblstudentmark WHERE tblstudentmark.studentId='"
					+ id + "'";
			ResultSet rs = getData(sql);
			while (rs.next()) {
				avg = rs.getDouble("avg");
				return avg;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return 0;
	}

	// testing
	public static void main(String args[]) {
		StudentMarkDAOImpl d = new StudentMarkDAOImpl();
		d.getAvg(1);
		System.out.println(d.getAvg(1));
	}

	@Override
	public Student getClassTop(Student student) {
		// TODO Auto-generated method stub

		try {
			String sql = "SELECT stuName,avgMark  FROM tblstudent  WHERE avgMark = (SELECT MAX(avgMark) FROM tblstudent WHERE  clId='"
					+ student.getClID() + "') ";
			ResultSet rs = getData(sql);
			while (rs.next()) {
				newSudent.setAvgMark(rs.getDouble("avgMark"));
				newSudent.setStuName(rs.getString("stuName"));
			}
			System.out.println(newSudent.getAvgMark());
			System.out.println(newSudent.getStuName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return newSudent;
	}

	@Override
	public StudentMark getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
