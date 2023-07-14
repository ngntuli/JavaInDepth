package com.ngntuli.oop.interfacedemo;

/**
 * 
 * @author ABC Inc.
 *
 */
public interface C extends A {
	void foobar();

	default void go() {
		System.out.println("C: go");
	}

	default void run() {
		System.out.println("C: run");
	}

	static void staticMethod() {
		System.out.println("C: staticMethod");
	}
}
