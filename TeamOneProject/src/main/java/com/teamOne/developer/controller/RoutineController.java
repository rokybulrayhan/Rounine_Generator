package com.teamOne.developer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamOne.developer.entity.Routine;
import com.teamOne.developer.service.RoutineService;

@Controller
public class RoutineController {
	@Autowired
	private RoutineService service;
	
	@RequestMapping("/")
	public String viewHomepage(Model model) {
		List<Routine> listStudents = service.listAll();
		model.addAttribute("listStudents",listStudents);
		return "index";
	}
}
	