package com.ngntuli.enums;

public class EnumsDemo {
	public static void main(String[] args) {
		for (BookGenre bookGenre : BookGenre.values()) {
			System.out.println("Name: " + bookGenre); // toString
			System.out.println("name(): " + bookGenre.name());
			System.out.println("Ordinal: " + bookGenre.ordinal());
			System.out.println("Declaring Class: " + bookGenre.getDeclaringClass());
			System.out.println("compareTo(HORROR): " + bookGenre.compareTo(BookGenre.HORROR));
			System.out.println("equals(HORROR): " + bookGenre.equals(BookGenre.HORROR));
			System.out.println("minAgeToRead: " + bookGenre.getMinAgeToRead());
			System.out.println();
		}
		System.out.println("\nBook nested with BookGenre ...");
		for (com.ngntuli.enums.Book.BookGenre bookGenre : Book.BookGenre.values()) {
			System.out.println("Name: " + bookGenre); // toString
			System.out.println("name(): " + bookGenre.name());
			System.out.println("Ordinal: " + bookGenre.ordinal());
			System.out.println("Declaring Class: " + bookGenre.getDeclaringClass());
			System.out.println("compareTo(HORROR): " + bookGenre.compareTo(Book.BookGenre.HORROR));
			System.out.println("equals(HORROR): " + bookGenre.equals(Book.BookGenre.HORROR));
			System.out.println("minAgeToRead: " + bookGenre.getMinAgeToRead());
			System.out.println();
		}
	}
}
