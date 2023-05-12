package com.ngntuli.basics;

class StudentTest {

	public static void main(String[] args) {
		int[] studentIds = new int[] { 1001, 1002, 1003 };

		// Creating first student object and setting its state
		Student student1 = new Student(studentIds[0], "Uhando");
		student1.gender = "female";

		// Creating second student object and setting its state
		Student student2 = new Student(studentIds[1], "Charlotte");
		student2.gender = "female";

		// Creating third student object and setting its state
		Student student3 = new Student(studentIds[2], "Nkosinathi");
		student3.gender = "male";

		// Print each students name
		System.out.println("Name of student1: " + student1.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student3: " + student3.name);

		// Update student1's name from Uhando to john by invoking updateProfile method
		student1.updateProfile("Uthando");
		System.out.println("Updated name of student1: " + student1.name);

		Student student4 = student1;
		System.out.println("Name of student4: " + student4.name);

		student4.updateProfile("Doctor");
		System.out.println("Name of student1: " + student1.name);

		student4 = student2;
		System.out.println("Name of student4: " + student4.name);

		student2 = student1;
		System.out.println("Name of student4: " + student4.name);
		System.out.println("Name of student2: " + student2.name);

		student4 = new Student("David");
		System.out.println("Name of student4: " + student4.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student1: " + student1.name);
		System.out.println();
		System.out.println("Name of student1: " + student1.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student3: " + student3.name);
		System.out.println("Name of student4: " + student4.name);

	}

}
