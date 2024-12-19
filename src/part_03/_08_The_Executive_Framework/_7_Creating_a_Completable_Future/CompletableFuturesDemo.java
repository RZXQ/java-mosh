package part_03._08_The_Executive_Framework._7_Creating_a_Completable_Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

	public static void show() {
		// Define a simple Runnable task
		Runnable task = () -> System.out.println("a");

		// Run a Runnable task asynchronously
		CompletableFuture<Void> c1 = CompletableFuture.runAsync(task);

		// Execute a task asynchronously that returns a value
		CompletableFuture<Integer> c2 = CompletableFuture.supplyAsync(() -> 1);

		// Retrieve and print the result (get is a blocking method)
		try {
			System.out.println(c2.get());
		}
		catch (InterruptedException | ExecutionException e) {
			throw new RuntimeException(e);
		}
	}

}
