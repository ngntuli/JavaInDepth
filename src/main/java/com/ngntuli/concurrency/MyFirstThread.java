package com.ngntuli.concurrency;

import java.util.concurrent.TimeUnit;

public class MyFirstThread {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();

		try {
			// Thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Inside main ...");
	}

}
