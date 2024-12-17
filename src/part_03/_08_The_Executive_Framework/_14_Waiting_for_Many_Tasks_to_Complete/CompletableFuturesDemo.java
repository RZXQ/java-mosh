package part_03._08_The_Executive_Framework._14_Waiting_for_Many_Tasks_to_Complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

	public static void show() {
		var first = CompletableFuture.supplyAsync(() -> 1);
		var second = CompletableFuture.supplyAsync(() -> 2);
		var third = CompletableFuture.supplyAsync(() -> 3);

		// wait for all three tasks to finish
		CompletableFuture.allOf(first, second, third).thenRun(() -> {
			try {
				System.out.println(first.get());
				System.out.println(second.get());
				System.out.println(third.get());
			}
			catch (InterruptedException | ExecutionException e) {
				throw new RuntimeException(e);
			}
			System.out.println("All tasks completed successfully");
		});

	}

}
