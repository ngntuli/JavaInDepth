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

		// Raw type demo:
		// rawTypeTest();

		List<String> strList1 = Arrays.asList("a", "b", "c");
		List<String> strList2 = Arrays.asList("b", "c", "d");
		// getCommonElementsCount(strList1, strList2);

		// Wildcard
		getCommonElementsCountWithWildcard(strList1, strList2);

		Container<?> someStore = stringStore;
		Object object = someStore.get();
		System.out.println("Stored element: " + object);

		List<Integer> intList1 = Arrays.asList(1, 2);
		List<Integer> intList2 = Arrays.asList(3, 4);
		invalidAggregate(intList1, intList2, new ArrayList());

		// go(new ArrayList<Integer>());
		// go(new Integer[1]);
	}

	// Invariance
	private static void go(List<Number> lNumbers) {

	}

	// Covariance
	private static void go(Number[] numbers) {
		numbers[0] = 42.2;

	}

	private static void invalidAggregate(List<?> list1, List<?> list2, List<?> list3) {
		// list3.addAll(null); // null ok
		// list3.addAll(list2);
	}

	private static int getCommonElementsCountWithWildcard(List<?> list1, List<?> list2) {
		int count = 0;
		for (Object element : list1) {
			if (list2.contains(element)) {
				count++;
			}
		}
		System.out.println("Common elements count: " + count);
		return count;
	}

	private static int getCommonElementsCount(List<String> strList1, List<String> strList2) {
		int count = 0;
		for (Object element : strList1) {
			if (strList2.contains(element)) {
				count++;
			}
		}
		System.out.println("Common elements count: " + count);
		return count;
	}

	private static void rawTypeTest() {
		System.out.println("\nInside rawTypeTest ...");
		int ISBN = 1505297729;
		List<Double> prices = new ArrayList<>();

		HalfIntegrator.getPrice(ISBN, prices);
		Double price = prices.get(0);
	}
}
