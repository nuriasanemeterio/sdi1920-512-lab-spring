package com.uniovi.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.uniovi.entities.Teacher;
import com.uniovi.repositories.TeacherRepository;

public class TeacherService {

	@Autowired
	private TeacherRepository teachersRepository; 

	public List<Teacher> getTeachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachersRepository.findAll().forEach(teachers::add);
		return teachers;
	}

	public Teacher getTeacher(Long id) {
		//return teachersList.stream().filter(teacher -> teacher.getId().equals(id)).findFirst().get();
		return teachersRepository.findById(id).get();

	
	}

	public void addTeacher(Teacher teacher) {
// Si en Id es null le asignamos el ultimo + 1 de la lista
	
		teachersRepository.save(teacher);
	
	}
	public void deleteTeacher(Long id) {
		teachersRepository.deleteById(id);

	}
}
