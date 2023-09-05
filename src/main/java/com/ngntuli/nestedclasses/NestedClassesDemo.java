package com.ngntuli.nestedclasses;

public class NestedClassesDemo {
	public static void main(String[] args) {
		Cache recommendedItems = new Cache(5);

		Bookmark item1 = new Bookmark();
		item1.setId(2000);
		item1.setTitle("Use Final Liberally");

		Bookmark item2 = new Bookmark();
		item2.setId(2001);
		item2.setTitle("How do I import a pre-existing Java project into Eclipse and get up and running?");

		Bookmark item3 = new Bookmark();
		item3.setId(2002);
		item3.setTitle("Interface vs Abstract Class");

		Bookmark item4 = new Bookmark();
		item4.setId(2003);
		item4.setTitle("NIO tutorial by Greg Travis");

		Bookmark item5 = new Bookmark();
		item5.setId(2004);
		item5.setTitle("Virtual Hosting and Tomcat");

		recommendedItems.add(item1);
		recommendedItems.add(item2);
		recommendedItems.add(item3);
		recommendedItems.add(item4);
		recommendedItems.add(item5);

		CacheIterator iterator = recommendedItems.iterator();
		// CacheIterator iterator = recommendedItems.new MyCacheIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}

	}
}
