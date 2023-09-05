package com.ngntuli.nestedclasses;

public class Cache {
	private Bookmark[] items;
	private int next = 0;

	public Cache(int size) {
		items = new Bookmark[size];
	}

	public void add(Bookmark item) {
		if (next < items.length)
			items[next++] = item;
	}

	public CacheIterator iterator() {
		return new MyCacheIterator();
	}

	private class MyCacheIterator implements CacheIterator {

		private int i;

		@Override
		public boolean hasNext() {
			return i < items.length;
		}

		@Override
		public Bookmark next() {
			return items[i++];
		}
	}
}
