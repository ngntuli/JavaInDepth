package com.ngntuli.nestedclasses;

import java.io.StringWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class DataTranslator {

	public String getBookAsXml(int id, String title, double rating, int fbLikesCount, int xCount) {

		class Book {
			private int id;
			private String title;
			private double rating;
			private int fbLikesCount;
			private int xCount;

			public Book(int id, String title, double rating, int fbLikesCount, int xCount) {
				this.id = id;
				this.title = title;
				this.rating = rating;
				this.fbLikesCount = fbLikesCount;
				this.xCount = xCount;
			}
		}

		Book book = new Book(id, title, rating, fbLikesCount, xCount);
		XStream xStream = new XStream(new StaxDriver());
		xStream.alias("book", Book.class);
		StringWriter writer = new StringWriter();
		xStream.marshal(book, new PrettyPrintWriter(writer));

		// return writer.toString();
		return xStream.toXML(book);
	}

}
