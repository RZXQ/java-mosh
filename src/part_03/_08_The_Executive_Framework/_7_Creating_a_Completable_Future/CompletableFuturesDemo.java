package part_03._08_The_Executive_Framework._7_Creating_a_Completable_Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

	public static void show() {
		// 1. Define a simple Runnable task that prints "a"
		Runnable task = () -> System.out.println("a");

		// 2. CompletableFuture.runAsync():
		// Executes a task asynchronously using the default ForkJoinPool.commonPool().
		CompletableFuture<Void> c1 = CompletableFuture.runAsync(task);

		// 3. CompletableFuture.supplyAsync():
		// Executes a task that returns a value asynchronously. The value here is 1.
		CompletableFuture<Integer> c2 = CompletableFuture.supplyAsync(() -> 1);

		try {
			// 4. Retrieve and print the result of the CompletableFuture using get().
			// This blocks the main thread until the computation is complete and the
			// result is available. Other threads (worker threads) are not blocked by
			// this call.
			System.out.println(c2.get());
		}
		catch (InterruptedException | ExecutionException e) {
			throw new RuntimeException(e);
		}
	}

}
