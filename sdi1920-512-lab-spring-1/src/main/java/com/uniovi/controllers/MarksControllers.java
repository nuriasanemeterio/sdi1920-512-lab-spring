package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uniovi.entities.Mark;
import com.uniovi.services.MarksService;

@RestController
public class MarksControllers {
	
	@Autowired //Inyectar el servicio
	private MarksService marksService;

	/*
	 * @RequestMapping("/mark/list") public String getList(){ return "Getting List";
	 * }
	 * 
	 * @RequestMapping(value="/mark/add", method=RequestMethod.POST) public String
	 * setMark(){ return "Adding Mark"; }
	 * 
	 * @RequestMapping(value="/mark/add", method=RequestMethod.POST) public String
	 * setMark(@ModelAttribute Mark mark){ return "added: " + mark.getDescription()
	 * +" with score : "+ mark.getScore() +" id: " + mark.getId();
	 * 
	 * }
	 * 
	 * @RequestMapping("/mark/details/{id}" ) public String getDetail(@PathVariable
	 * Long id){ return " Getting Detail: "+id; }
	 */

	
	@RequestMapping("/mark/list")
	public String getList() {
		return marksService.getMarks().toString();
	}
	
	@RequestMapping(value="/mark/add", method=RequestMethod.POST)
	public String setMark(@ModelAttribute Mark mark){
		marksService.addMark(mark);
		return "ok";

	}
	
	@RequestMapping("/mark/details/{id}" )
	public String getDetail(@PathVariable Long id){
		return marksService.getMark(id).toString();
	}
	
	
	@RequestMapping("/mark/delete/{id}")
	public String deleteMark(@PathVariable Long id) {
		marksService.deleteMark(id);
		return "ok";
	}
}



