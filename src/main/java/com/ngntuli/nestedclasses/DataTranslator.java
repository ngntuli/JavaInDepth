package com.ngntuli.nestedclasses;

public class DataTranslator {

	public String getBookAsXml(int id, String title, double rating, int fbLikesCount, int xCount) {
		
		class Book {
			private int id;
			private String title;
			private double rating;
			private int fbLikesCount;
			private int tweetCount;

			public Book(int id, String title, double rating, int fbLikesCount, int tweetCount) {
				this.id = id;
				this.title = title;
				this.rating = rating;
				this.fbLikesCount = fbLikesCount;
				this.tweetCount = tweetCount;
			}
		}

		Book book = new Book(id, title, rating, fbLikesCount, xCount);
		return book.title;
	}

}
