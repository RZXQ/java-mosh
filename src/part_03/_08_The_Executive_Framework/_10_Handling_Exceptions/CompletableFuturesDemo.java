package part_03._08_The_Executive_Framework._10_Handling_Exceptions;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

	public static void show() {
		// 1. Create a CompletableFuture using supplyAsync().
		// This simulates an asynchronous task that throws an exception.
		var future = CompletableFuture.supplyAsync(() -> {
			System.out.println("Getting the current weather");
			// Simulate an exception being thrown in a separate thread.
			throw new IllegalStateException();
		});

		try {
			// 2. Handle exceptions with exceptionally():
			// - If no exception occurs, the original CompletableFuture result is used.
			// - If an exception occurs, the fallback value (23) is returned.
			// - get() retrieves the result: the original or the fallback value.
			var temperature = future.exceptionally(ex -> {
				System.out.println("Exception occurred: " + ex); // Log the exception
				return 23; // Provide a fallback value
			}).get(); // Block and retrieve the result (or fallback value)

			// 3. Print the result (either the computed value or the fallback).
			System.out.println("Temperature: " + temperature);
		}
		catch (InterruptedException e) {
			// Handle thread interruption during the blocking get() call
			throw new RuntimeException("Thread was interrupted", e);
		}
		catch (ExecutionException e) {
			// Handle exceptions thrown during the asynchronous computation
			throw new RuntimeException("Execution exception occurred", e);
		}
	}

	public static void main(String[] args) {
		show(); // Call the show() method to demonstrate exception handling
	}

}
