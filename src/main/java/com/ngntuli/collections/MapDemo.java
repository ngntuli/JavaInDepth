package com.ngntuli.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	private static void hashMapDemo() {
		System.out.println("\nInside hashMapDemo ...");
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Nkosinathi", 33);
		map1.put("Ntuli", 28);
		map1.put("Charlotte", null);

		System.out.println(map1);

		map1.put("Charlotte", 23);
		System.out.println(map1);

		System.out.println("Contains Nkosinathi? " + map1.containsKey("Nkosinathi"));
		System.out.println("Nkosinathi's age: " + map1.get("Nkosinathi"));

		System.out.println("Iterating using keySet ...");
		Set<String> names = map1.keySet();
		for (String name : names) {
			System.out.println("Name: " + name + ", Age: " + map1.get(name));
		}

		System.out.println("Iterating using entrySet ...");
		Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
		for (Map.Entry<String, Integer> mapping : mappings) {
			System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
		}

		names.remove("Charlotte");
		System.out.println(map1);

		Map<String, Map<String, Object>> userProfile = new HashMap<>();

		Map<String, Object> profile = new HashMap<>();
		profile.put("age", 25);
		profile.put("dept", "CS");
		profile.put("city", "CapeTown");

		userProfile.put("Nkosinathi", profile);

		profile = new HashMap<>();
		profile.put("age", 29);
		profile.put("dept", "CS");
		profile.put("city", "Johannesburg");

		userProfile.put("Ntuli", profile);

		System.out.println("userProfile: " + userProfile);

		Map<String, Object> profile1 = userProfile.get("Nkosinathi");
		int age = (Integer) profile1.get("age");
		System.out.println("Age: " + age);
	}

	private static void immutableKeysDemo() {
		System.out.println("\nInside immutableKeysDemo ...");
		List<Integer> list = new ArrayList<>();
		list.add(1);

		Map<List<Integer>, Integer> map = new HashMap<>();
		map.put(list, 1);

		list.add(2);
		System.out.println(map.get(list));

		Student s = new Student(1, null);
		Map<Student, Integer> map2 = new HashMap<>();
		map2.put(s, 1);

		s.setName("Nkosinathi");
		System.out.println(map2.get(s));
	}

//	1. See output with and without commenting get() calls
//	2. See output when accessOrder=false with get() calls. get calls do not have any influence
//	3. Finally, change object type from LRUCache to LinkedHashMap and see output.
//	All 5 mappings will be printed as removeEldestEntry would return false by default
	private static void lruCacheTest() {
		System.out.println("\nInside lruCacheTest ...");
		Map<String, String> lruCache = new LRUCache<>(16, 0.75f, true);
		lruCache.put("a", "A");
		lruCache.put("b", "B");
		System.out.println(lruCache);

		lruCache.get("a"); // multiple gets to "a" will not make a difference
		lruCache.get("a");
		System.out.println(lruCache);
		lruCache.get("b");
		System.out.println(lruCache);

		lruCache.put("c", "C");
		System.out.println(lruCache);
		lruCache.put("d", "D");
		System.out.println(lruCache);
	}

	public static void main(String[] args) {
		// hashMapDemo();
		// immutableKeysDemo();
		lruCacheTest();
	}
}
