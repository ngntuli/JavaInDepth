package com.ngntuli.oop.interfacedemo;

/**
 * 
 * @author Client Inc.
 *
 */
public class TestClient {
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		// Interface demo
		C c = new X();
		// c.foo();
		// c.bar();
		// c.foobar();

		// Clone demo
		// C clone = ((X) c).clone();
		// if (clone != c) {
		// System.out.println("Clone created!!");
		// }

		// Default method demo
		c.go();
		c.run();
	}
}
