package com.teamOne.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamOne.developer.dao.WeekRepositroy;
import com.teamOne.developer.entity.Week;
@Service
public class WeekService {
	
	@Autowired
	WeekRepositroy repo;
	
	public List<Week> getAllWeekList(){
		return repo.findAll();
	}
}
