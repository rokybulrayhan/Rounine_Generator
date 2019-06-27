package com.teamOne.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamOne.developer.dao.CourseRepositroy;
import com.teamOne.developer.entity.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseRepositroy repo;
	
	public List<Course> getAllCourseList(){
		return repo.findAll();
	}
}
