package com.ngntuli.oop.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("\nInside main ...");
		// try {
		share();

		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }

		System.out.println("\nEnd of main ...");
	}

	private static void share() throws IOException {
		System.out.println("\nInside share ...");

		try {
			HttpConnect.send(1, "hello", "http://www.spring-boot.com");
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			System.out.println("Connecting to a different server ...");
		} catch (Exception e) {
			// TODO: handle exception
		} catch (Throwable e) {
			// TODO: handle exception
		}

		System.out.println("\nEnd of share ...");
	}
}
