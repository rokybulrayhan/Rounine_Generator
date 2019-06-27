package com.teamOne.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamOne.developer.entity.Week;

@Repository
public interface WeekRepositroy extends JpaRepository<Week, Integer> {

}
