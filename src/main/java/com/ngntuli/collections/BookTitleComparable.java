package com.ngntuli.collections;

public class BookTitleComparable implements Comparable<Book> {
	private String title;

	public BookTitleComparable(String title) {
		this.title = title;
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}

}
