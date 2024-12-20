package part_03._08_The_Executive_Framework._7_Creating_a_Completable_Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/// CompletableFuture Overview:
/// 1. runAsync(Runnable): Runs a task asynchronously without returning a value, using ForkJoinPool.commonPool.
/// 2. supplyAsync(Supplier): Runs a task asynchronously and returns a value, using ForkJoinPool.commonPool.
/// 3. Worker thread starts execution immediately when runAsync or supplyAsync is called.
/// 4. get(): Blocks the calling thread to retrieve the result of the computation.
public class CompletableFuturesDemo {

	public static void show() throws ExecutionException, InterruptedException {
		// 1. Run a Runnable task asynchronously
		CompletableFuture<Void> c1 = CompletableFuture.runAsync(() -> System.out.println("a"));

		// 2. Execute a task asynchronously that returns a value
		CompletableFuture<Integer> c2 = CompletableFuture.supplyAsync(() -> 1);
		System.out.println(c2.get()); // get is a blocking method
	}

}
