package com.ngntuli.basics;

public class User {

	int id;
	String name;
	int salary;

	User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	User(int id, String name, int salary) {
		this(id, name);
		this.salary = salary;
	}

	public static void main(String[] args) {
		User instructor = new User(1045, "Nkosinathi", 18000);
		System.out.println("Name: " + instructor.name);
	}
}
