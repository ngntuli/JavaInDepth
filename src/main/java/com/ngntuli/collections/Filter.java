package com.ngntuli.collections;

import java.util.function.Consumer;

public class Filter implements Consumer<Object> {

	@Override
	public void accept(Object o) {
		if ((int) o == 1)
			System.out.println(o);

	}

	public static void add(Integer i) {
		System.out.println(i + 7);
	}

	public static void filter(Integer i) {
		if (i == 1)
			System.out.println(i);
	}

}
