package com.ngntuli.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	private static void hashSetDemo() {
		Set<String> set1 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("a");

		System.out.println("set1: " + set1);

		Book book1 = new Book("Walden", "Henry Thoreau", 1854);
		Book book2 = new Book("Walden", "Henry Thoreau", 1854);
		Set<Book> set2 = new HashSet<>();
		set2.add(book1);
		set2.add(book2);
		System.out.println("set2: " + set2);
	}

	private static void linkedHashSetDemo() {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Nkosinathi");
		hashSet.add("Ntuli");
		hashSet.add("Charlotte");
		System.out.println("HashSet: " + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Nkosinathi");
		linkedHashSet.add("Ntuli");
		linkedHashSet.add("Charlotte");
		System.out.println("LinkedHashSet: " + linkedHashSet);
	}

	public static void main(String[] args) {
		// hashSetDemo();
		linkedHashSetDemo();
	}
}
