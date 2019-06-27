package com.teamOne.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamOne.developer.dao.CourseRepositroy;
import com.teamOne.developer.dao.PeriodRepository;
import com.teamOne.developer.entity.Course;
import com.teamOne.developer.entity.Period;

@Service
public class PeriodService {
	
	@Autowired
	PeriodRepository repo;
	
	public List<Period> getAllPeriod(){
		return repo.findAll();
	}
}
