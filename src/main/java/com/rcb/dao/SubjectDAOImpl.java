package com.rcb.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rcb.model.Subject;
import com.rcb.utility.DbConnection;

public class SubjectDAOImpl extends DbConnection implements SubjectDAO {

	@Override
	public boolean insertSubject(Subject subject) {
		// TODO Auto-generated method stub
		try {
			String sql="INSERT INTO tblSubject(subName) VALUES('"+subject.getSubName()+"')";
			putData(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Subject> listAllSubject() {
		// TODO Auto-generated method stub
		System.out.println("dao ok");
		List<Subject> subjectList = new ArrayList<>();

		try {
			String sql = "SELECT * FROM tblSubject";
			ResultSet rs = getData(sql);
			while (rs.next()) {
				Subject sub = new Subject();
				sub.setSubId(rs.getInt("subId"));
				sub.setSubName(rs.getString("subName"));
				subjectList.add(sub);
			}
			ArrayList<Subject> viewSublecs = (ArrayList<Subject>) subjectList;
			for (int i = 0; i < subjectList.size(); i++) {
				System.out.println(viewSublecs.get(i).getSubId());
				System.out.println(viewSublecs.get(i).getSubName());
			}
			return subjectList;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteSubject(Subject subject) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE FROM tblSubject WHERE subId='" + subject.getSubId() + "'";
			putData(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		try {
			String sql = "UPDATE tblSubject SET subName='" + subject.getSubName() + "' WHERE subId='"
					+ subject.getSubId() + "'";
			putData(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Subject> listSelectedSubject(int id) {
		// TODO Auto-generated method stub
		List<Subject> selectedSubject = new ArrayList<>();
		try {
			String sql = "SELECT * FROM tblSubject WHERE subId='" + id + "'";
			ResultSet rs = getData(sql);
			while (rs.next()) {
				Subject sub = new Subject();
				sub.setSubId(rs.getInt("subId"));
				sub.setSubName(rs.getString("subName"));
				selectedSubject.add(sub);

			}
			// testing output
			ArrayList<Subject> selectSub = (ArrayList<Subject>) selectedSubject;
			for (int i = 0; i < selectSub.size(); i++) {
				System.out.println(selectSub.get(i).getSubId());
				System.out.println(selectSub.get(i).getSubName());
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
