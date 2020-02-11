package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uniovi.entities.Teacher;
import com.uniovi.services.TeacherService;

public class TeacherController {

	@Autowired //Inyectar el servicio
	private TeacherService teachersService;
	
	@RequestMapping("/teacher/list")
	public String getList() {
		return teachersService.getTeachers().toString();
	}
	
	@RequestMapping(value="/teacher/add", method=RequestMethod.POST)
	public String setTeacher(@ModelAttribute Teacher teacher){
		teachersService.addTeacher(teacher);
		return "ok";

	}
	
	@RequestMapping("/teacher/details/{id}" )
	public String getDetail(@PathVariable Long id){
		return teachersService.getTeacher(id).toString();
	}
	
	
	@RequestMapping("/teacher/delete/{id}")
	public String deleteTeacher(@PathVariable Long id) {
		teachersService.deleteTeacher(id);
		return "ok";
	}
}
