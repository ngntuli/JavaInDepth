package com.ngntuli.collections;

import java.util.function.Consumer;

public class Filter implements Consumer<Object> {
	private static int sum = 0;

	@Override
	public void accept(Object o) {
		if ((int) o == 1)
			System.out.println(o);

	}

	public static void add(Integer i) {
		int num1 = sum;
		sum = sum + i;
		System.out.println(num1 + " + " + i + " = " + sum);
	}

	public static void filter(Integer i) {
		if (i == 1)
			System.out.println(i);
	}

}
