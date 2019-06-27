package com.teamOne.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamOne.developer.dao.RoutineRepositroy;
import com.teamOne.developer.entity.Routine;
@Service
public class RoutineService {
	@Autowired //interface k reference kora
	RoutineRepositroy repo;
	 
	public List<Routine> listAll(){
		return repo.findAll();
	}
	public void save(Routine routine) {
		repo.save(routine);	
	}
	
	public Routine get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);         
	}

}
