package com.rcb.dao;

import java.util.List;

import com.rcb.model.Subject;

public interface SubjectDAO {
	public boolean insertSubject(Subject subject);

	public List<Subject> listAllSubject();

	public boolean deleteSubject(Subject subject);

	public boolean updateSubject(Subject subject);

	public List<Subject> listSelectedSubject(int id);
}
