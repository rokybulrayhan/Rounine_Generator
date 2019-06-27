package com.teamOne.developer.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamOne.developer.entity.Batch;
import com.teamOne.developer.entity.Course;
import com.teamOne.developer.entity.Period;
import com.teamOne.developer.entity.Room;
import com.teamOne.developer.entity.Routine;
import com.teamOne.developer.entity.Teacher;
import com.teamOne.developer.entity.Week;
import com.teamOne.developer.service.BatchService;
import com.teamOne.developer.service.CourseService;
import com.teamOne.developer.service.PeriodService;
import com.teamOne.developer.service.RoomService;
import com.teamOne.developer.service.RoutineService;
import com.teamOne.developer.service.TeacherService;
import com.teamOne.developer.service.WeekService;

@RestController
public class RoutineRestController {

	@Autowired
	RoutineService  service;
	
	@Autowired
	BatchService  batchService;
	
	@Autowired
	RoomService  roomService;
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	WeekService weekService;
	
	@Autowired
	PeriodService periodService;
	
	
	@GetMapping("/allRoutine")
	public List<Routine> allRoutine(){
		return service.listAll();
	}
	
	@PostMapping("/routineSave")
	public void doSave(@RequestBody Routine r) {
		//
		service.save(r);
	}
	
	@GetMapping("/allBatch")
	public List<Batch> allBatch(){
		return batchService.getAllBatchList();
	}
	
	@GetMapping("/allRoom")
	public List<Room> allRoom(){
		return roomService.getAllRoomList();
	}
	
	@GetMapping("/allTeacher")
	public List<Teacher> allTeacher(){
		return teacherService.getAllTeacherList();
	}
	
	@GetMapping("/allCourse")
	public List<Course> allCourse(){
		return courseService.getAllCourseList();
	}
	
	@GetMapping("/allWeek")
	public List<Week> allWeek(){
		return weekService.getAllWeekList();
	}
	
	@GetMapping("/allPeriod")
	public List<Period> allPeriod(){
		return periodService.getAllPeriod();
	}
	
}
