package com.rcb.service;

import java.util.List;

import com.rcb.model.Subject;

public interface SubjectService {
	public boolean insertSubject(Subject subject);

	public List<Subject> listAllSubject();

	public boolean deleteSubject(Subject subject);

	public boolean updateSubject(Subject subject);

	public List<Subject> listSelectedSubject(int id);
}
