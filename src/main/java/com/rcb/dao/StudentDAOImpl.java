package com.rcb.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.rcb.model.Student;
import com.rcb.utility.DbConnection;

public class StudentDAOImpl extends DbConnection implements StudentDAO {

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			putData("INSERT INTO tblStudent(stuName,adNo,adStreet,adCity,clId) VALUES ('"
					+ student.getStuName() + "','" + student.getAdNo() + "','" + student.getAdStreet() + "','" + student.getAdCity() + "','" + student.getClID() + "')");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> listAllStudent() {
		// TODO Auto-generated method stub

		List<Student> listStudent = new ArrayList<>();
		try {

			String sql = "SELECT * FROM tblStudent";
			ResultSet rs = getData(sql);
			while (rs.next()) {
				Student stu = new Student();
				stu.setStuId(rs.getInt("stuId"));
				stu.setStuName(rs.getString("stuName"));
				stu.setAdNo(rs.getString("adNo"));
				stu.setAdStreet(rs.getString("adStreet"));
				
				stu.setAdCity(rs.getString("adCity"));
				stu.setClID(rs.getInt("clId"));

				listStudent.add(stu);

			}
			// Testing output
			ArrayList<Student> viewStudents = (ArrayList<Student>) listStudent;
			for (int i = 0; i < viewStudents.size(); i++) {
				System.out.println(viewStudents.get(i).getStuId());
				System.out.println(viewStudents.get(i).getStuName());
				System.out.println("okkk");
			}
			return listStudent;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE FROM tblStudent WHERE stuId='" + student.getStuId() + "'";
			putData(sql);
			System.out.println("delete Ok !");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			String sql = "UPDATE tblStudent set stuName='" + student.getStuName() + "',adNo='" + student.getAdNo()
					+ "',adStreet='" + student.getAdStreet() + "',adCity='"
					+ student.getAdCity() + "',clId='" + student.getClID() + "' WHERE stuId='" + student.getStuId()
					+ "'";
			putData(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student getStudent(int id) {
		// // TODO Auto-generated method stub
		//
		// try {
		// String sql="SELECT * FROM tblStudent WHERE stuId='" + id + "'";
		// ResultSet rs=getData(sql);
		// while(rs.next()) {
		// Student stu=new Student();
		// stu.setStuId(rs.getInt("stuId"));
		// stu.setStuName(rs.getString("stuName"));
		// stu.setAdNo(rs.getString("adNo"));
		// stu.setAdStree1(rs.getString("adStreet1"));
		// stu.setAdStree2(rs.getString("adStreet2"));
		// stu.setAdCity(rs.getString("adCity"));
		// stu.setClID(rs.getInt("clId"));
		//
		// return stu;
		//
		// }
		// } catch (Exception e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// }
		//
		return null;
	}

	@Override
	public List<Student> listSelectedStudent(int id) {
		// TODO Auto-generated method stub
		List<Student> selectedStudent = new ArrayList<>();
		try {
			String sql = "SELECT * FROM tblStudent WHERE stuId='" + id + "'";
			ResultSet rs = getData(sql);
			while (rs.next()) {
				Student stu = new Student();
				stu.setStuId(rs.getInt("stuId"));
				stu.setStuName(rs.getString("stuName"));
				stu.setAdNo(rs.getString("adNo"));
				stu.setAdStreet(rs.getString("adStreet"));
				stu.setAdCity(rs.getString("adCity"));
				stu.setClID(rs.getInt("clId"));

				selectedStudent.add(stu);

			}
			// Testing output
			ArrayList<Student> lastSelectedStudent = (ArrayList<Student>) selectedStudent;
			for (int i = 0; i < lastSelectedStudent.size(); i++) {
				System.out.println(lastSelectedStudent.get(i).getStuId());
				System.out.println(lastSelectedStudent.get(i).getStuName());
			}
			return selectedStudent;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

}
