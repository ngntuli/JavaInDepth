package com.ngntuli.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HexFormat;

public class IODemo {
	static String inFileStr = "pacman.jpeg";
	static String outFileStr = "pacman-out.jpeg";

	public static void applyEncoding() {
		System.out.println("\nInside applyEncoding ...");
		System.out.println("Default Character Encoding: " + System.getProperty("file.encoding"));

		// Ensure Eclipse property is set as UTF8
		printEncodingDetails("A");
		printEncodingDetails("€"); // Euro (Reference:
									// http://stackoverflow.com/questions/34922333/how-does-java-fit-a-3-byte-unicode-character-into-a-char-type)
		printEncodingDetails("\u1F602"); // Non-BMP Unicode Code Point ~ Tears of Joy Emoji (one of Smiley graphic
											// symbol)
	}

	private static void printEncodingDetails(String symbol) {
		HexFormat hex = HexFormat.of();
		System.out.println("\nSymbol: " + symbol);
		try {
			System.out.println("ASCII: " + Arrays.toString(symbol.getBytes("US-ASCII")));
			System.out.println("ISO-8859-1: " + Arrays.toString(symbol.getBytes("ISO-8859-1")));
			System.out.println("UTF-8: " + Arrays.toString(symbol.getBytes("UTF-8")));
			System.out.println("UTF-16: " + Arrays.toString(symbol.getBytes("UTF-16")));
			System.out.println("UTF-16 BE: " + Arrays.toString(symbol.getBytes("UTF-16BE")));
			System.out.println("UTF-16 LE: " + Arrays.toString(symbol.getBytes("UTF-16LE")));
			System.out.println("UTF-32: " + Arrays.toString(symbol.getBytes("UTF-32")));
			System.out.println("UTF-32 BE: " + Arrays.toString(symbol.getBytes("UTF-32BE")));
			System.out.println("UTF-32 LE: " + Arrays.toString(symbol.getBytes("UTF-32LE")));
			System.out.println("FormatHex: " + hex.formatHex(symbol.getBytes()));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}

	public static void fileMethods() {
		File fileIn = new File(inFileStr);
		System.out.println("File size is " + fileIn.length() + " bytes");
		System.out.println("File name is " + fileIn.getName());
	}

	public static void fileCopyNoBuffer() {
		System.out.println("\nInside fileCopyNoBuffer ...");

		long startTime, elapsedTime; // for speed benchmarking

		try (FileInputStream in = new FileInputStream(inFileStr);
				FileOutputStream out = new FileOutputStream(outFileStr)) {
			startTime = System.nanoTime();
			int byteRead;
			// Read a raw byte, returns an int of 0 to 255.
			while ((byteRead = in.read()) != -1) {
				// Write the least-significant byte of int, drop the upper 3
				// bytes
				out.write(byteRead);
			}
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Most common way to read byte streams from a file
	public static void fileCopyWithBufferAndArray() {
		System.out.println("\nInside fileCopyWithBufferAndArray ...");

		long startTime, elapsedTime; // for speed benchmarking
		startTime = System.nanoTime();
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileStr));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileStr))) {

			byte[] byteBuf = new byte[4000];
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("fileCopyWithBufferAndArray: " + (elapsedTime / 1000000.0) + " msec");
	}

	public static void getProperties() {
		try {
			System.getProperties().list(System.out);
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// applyEncoding();
		// fileMethods();
		// fileCopyNoBuffer();
		// fileCopyWithBufferAndArray();
		getProperties();

	}
}
