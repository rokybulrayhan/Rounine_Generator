package com.teamOne.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamOne.developer.entity.Room;
@Repository
public interface RoomRepositroy extends JpaRepository<Room, Integer> {

}
/*
 * package com.teamOne.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamOne.developer.entity.Routine;
@Repository
public interface RoutineRepositroy extends JpaRepository<Routine, Integer> {

}


 */

