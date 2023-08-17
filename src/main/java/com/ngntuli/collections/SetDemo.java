package com.ngntuli.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

	private static void treeSetDemo() {
		Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book2 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book3 = new Book("Walden", "Henry David Thoreau", 1854);
		Book book4 = new Book("Effective Java", "Joshua Bloch", 2008);

		Set<Book> books = new TreeSet<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);

		for (Book book : books) {
			System.out.println(book);
		}
	}

	public static void main(String[] args) {
		// hashSetDemo();
		// linkedHashSetDemo();
		treeSetDemo();
	}
}
