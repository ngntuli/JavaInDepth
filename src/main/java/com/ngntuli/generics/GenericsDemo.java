package com.ngntuli.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericsDemo {
	public static void main(String[] args) {
		Container<String> stringStore = new Store<>();
		stringStore.set("java");
		// stringStore.set(1);
		System.out.println(stringStore.get());

		Container<Integer> integerStore = new Store<>();
		integerStore.set(1);
		System.out.println(integerStore.get());

		Container<List<Integer>> listStore = new Store<>();
		listStore.set(Arrays.asList(1, 2, 3));
		System.out.println(listStore.get());

		// Container<int> intStore = new Store<>();
		List<Number> list = new ArrayList<>();
		list.add(1);
		list.add(22.0);
		// list.add(new String("22.0"));

		List[] array = new ArrayList[2];
		array[0] = new ArrayList();
		// array[1] = new LinkedList();
		System.out.println(Arrays.toString(array));
	}
}
