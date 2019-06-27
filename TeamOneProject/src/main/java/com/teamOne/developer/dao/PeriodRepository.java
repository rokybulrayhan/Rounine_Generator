package com.teamOne.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamOne.developer.entity.Period;
@Repository
public interface PeriodRepository  extends JpaRepository<Period, Integer> {

}