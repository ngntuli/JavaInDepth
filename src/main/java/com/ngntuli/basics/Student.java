package com.ngntuli.basics;

class Student {
	// variable declarations
	private int id;
	private String name;
	private String gender = "male";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Constructors
	Student(int id, String name) {
		this(name); // Invoking overloaded constructor. If present, should be first statement
		this.id = id;
	}

	Student(String name) {
		this.name = name;
	}

	// method definitions
	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}
}
