package com.saadath.studentmanagement.model;

public class Student {
	private int id;
	private String name;
	private int age;
	private String department;

	Student(int id, String name, int age, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

//	Setters and getters for id,name,age,department
	public void setId(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}
}
