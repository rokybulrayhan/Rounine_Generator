package com.teamOne.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamOne.developer.entity.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer>{
}
