package com.teamOne.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamOne.developer.dao.TeacherRepositroy;
import com.teamOne.developer.entity.Teacher;
@Service
public class TeacherService {
	
	@Autowired
	TeacherRepositroy repo;
	
	public List<Teacher> getAllTeacherList(){
		return repo.findAll();
	}
}
