package com.ngntuli.collections;

import java.util.HashMap;
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

	public static void main(String[] args) {
		hashMapDemo();
	}
}
