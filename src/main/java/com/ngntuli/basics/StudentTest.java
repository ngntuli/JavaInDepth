package com.ngntuli.basics;

class StudentTest {

	public static void main(String[] args) {
		int[] studentIds = new int[] { 1001, 1002, 1003 };

		// Creating first student object and setting its state
		Student student1 = new Student(studentIds[0], "Uhando", "female");

		// Creating second student object and setting its state
		Student student2 = new Student(studentIds[1], "Charlotte", "female");

		// Creating third student object and setting its state
		Student student3 = new Student(studentIds[2], "Nkosinathi", "other");

		// Print each students name
		System.out.println("Name of student1: " + student1.getName());
		System.out.println("Name of student2: " + student2.getName());
		System.out.println("Name of student3: " + student3.getName());

		// Update student1's name from Uhando to john by invoking updateProfile method
		student1.setName("Uthando");
		System.out.println("Updated name of student1: " + student1.getName());

	}

}
