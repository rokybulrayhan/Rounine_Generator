package com.teamOne.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tm1_teacher")
public class Teacher {
	
	private int id;
	private String names;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public Teacher(int id, String names) {
		
		this.id = id;
		this.names = names;
	}
	public Teacher() {
		
	}

	
	
	
	
	
}
