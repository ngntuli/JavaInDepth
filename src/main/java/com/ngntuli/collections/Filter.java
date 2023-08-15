package com.ngntuli.collections;

import java.util.function.Consumer;

public class Filter implements Consumer<Object> {

	@Override
	public void accept(Object o) {
		if ((int) o == 1)
			System.out.println(o);

	}

}
