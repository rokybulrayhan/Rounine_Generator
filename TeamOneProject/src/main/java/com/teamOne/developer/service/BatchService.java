package com.teamOne.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamOne.developer.dao.BatchRepository;
import com.teamOne.developer.entity.Batch;

@Service
public class BatchService {
	
	@Autowired
	BatchRepository repo;
	
	public List<Batch> getAllBatchList(){
		return repo.findAll();
	}
}
