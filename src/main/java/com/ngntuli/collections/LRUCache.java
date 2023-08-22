package com.ngntuli.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = 1L;
	private static final int MAX_ENTRIES = 2;

	public LRUCache(int initialCapacity, float loadFactor, boolean accessOrder) {
		super(initialCapacity, loadFactor, accessOrder);
	}

	// Invoked by put and putAll after inserting a new entry into the map
	@Override
	public boolean removeEldestEntry(Map.Entry eldest) {
		return size() > MAX_ENTRIES;
		// return false; // same as normal linked hash map
	}
}
