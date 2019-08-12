package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	public long getId() {
		return id;
	}

	public Employee(long id, String name, int age, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "age")
	private int age;

	public Employee() {
		super();
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Column(name = "active")
	private boolean active;

}
