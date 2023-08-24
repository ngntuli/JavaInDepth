package com.ngntuli.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {

		// boolean addAll(Collection<? super T> c, T... elements);
		List<String> list = new ArrayList<>();
		list.add("Ntuli");
		list.add("Nkosinathi");
		list.add("Nkosinathi");

		String[] array = { "Charlotte" };

		Collections.addAll(list, array);

		System.out.println("list: " + list);

		// list.addAll(Arrays.asList(array))

		// static <T extends Comparable<? super T>> void sort(List<T> list)
		Collections.sort(list);

		System.out.println("Sorted list: " + list);

		// <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
		// Needs to be sorted. O(log(n)).
		// If not sorted results are undefined. Might perform an inefficient linear
		// search!!
		// For Sets: HashSet ~ O(1). TreeSet ~ O(log(n)), i.e., same efficiency as
		// binary search
		// Note: List.contains is O(n)
		System.out.println("Is Nkosinathi There? : " + Collections.binarySearch(list, "Nkosinathi"));

		// <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)

		Collections.reverse(list);
		System.out.println("Reverse list: " + list);

		Collections.swap(list, 0, 3);
		System.out.println("After swapping: " + list);

		System.out.println("# Nkosinathi's: " + Collections.frequency(list, "Nkosinathi"));

		Collections.shuffle(list);
		System.out.println("Shuffled list: " + list);

		System.out.println("Max: " + Collections.max(list)); // natural ordering
		System.out.println("Min: " + Collections.min(list));

		// Singleton ~ <T> Set<T> singleton(T o)
		// Returns an immutable set containing only the specified object
		// Others: <T> List<T> singletonList(T o) & <K,V> Map<K,V> singletonMap(K key, V
		// value)
		list.removeAll(Collections.singleton("Nkosinathi"));

		// Unmodifiable View ~ to provide clients with read-only access to internal
		// collections
		Collection<String> unmodifiable = Collections.unmodifiableCollection(list);
		System.out.println("unmodifiable: " + unmodifiable);
		System.out.println("Is Charlotte there?: " + unmodifiable.contains("Charlotte"));
		// unmodifiable.add("Nkosinathi");
		list.add("Nkosinathi");
		System.out.println("unmodifiable 2: " + unmodifiable);
	}
}
