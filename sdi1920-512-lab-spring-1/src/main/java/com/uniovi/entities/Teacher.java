package com.uniovi.entities;


import javax.persistence.*;

@Entity
public class Teacher {

	
	@Id
	@GeneratedValue
	private String name;
	private Long id;
	private String category;
	
	
	public Long getId() {
		return id;
		}
	
	public void setId(Long id) {
		this.id = id;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Teacher(Long id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		}
		public Teacher(){
		}
		@Override
		public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", category=" + category + "]";
		}
	
	
	
}
