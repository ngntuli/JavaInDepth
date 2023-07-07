package com.ngntuli.oop.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("\nInside main ...");
		try {
			share();
			System.out.println("After invoking share ...");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("main: FileNotFoundException ...");
		} finally {
			System.out.println("Inside main's finally ...");
		}
		System.out.println("\nEnd of main ...");
	}

	private static void share() throws FileNotFoundException {
		System.out.println("\nInside share ...");

		try {
			String response = HttpConnect.send(1, "hello", "http://www.spring-boot.com");
			System.out.println("After invoking send ...");
			APIParser.parseSendResponseCode(response, "hello", "http://www.spring-boot.com");
		} catch (FileNotFoundException e) {
			System.out.println("Share: FileNotFoundException ...");
			throw e;
		} catch (IOException e) {
			System.out.println("Connecting to a different server ...");
		} catch (APIFormatChangeException e) {
			// Item 77: Do not ignore exceptions
			e.printStackTrace();

			// Item 75: Include failure-capture information in detail messages
			// System.out.println("e.toString(): " + e);
			// System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.getElementName(): " + e.getElementName());

			// Item 73: Throw exceptions appropriate to the abstraction
			// e.getCause().printStackTrace();
		} finally {
			System.out.println("Inside share's finally ...");
		}

		System.out.println("\nEnd of share ...");
	}
}
