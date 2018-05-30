package com.rcb.service;

import java.util.List;

import com.rcb.dao.SubjectDAO;
import com.rcb.dao.SubjectDAOImpl;
import com.rcb.model.Subject;
import com.rcb.utility.DbConnection;

public class SubjectServiceImpl extends DbConnection implements SubjectService {
	SubjectDAO subjectDAO = new SubjectDAOImpl();
	Subject subject = new Subject();

	@Override
	public boolean insertSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectDAO.insertSubject(createSubject(subject));
	}

	@Override
	public List<Subject> listAllSubject() {
		// TODO Auto-generated method stub
		System.out.println("service ok");
		return subjectDAO.listAllSubject();
	}

	@Override
	public boolean deleteSubject(Subject subject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Subject> listSelectedSubject(int id) {
		// TODO Auto-generated method stub
		return subjectDAO.listSelectedSubject(id);
	}

	public Subject createSubject(Subject sub) {
		subject.setSubId(sub.getSubId());
		subject.setSubName(sub.getSubName());
		return subject;

	}

}
