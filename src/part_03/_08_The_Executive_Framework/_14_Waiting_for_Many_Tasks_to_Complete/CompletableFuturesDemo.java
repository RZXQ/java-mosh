package part_03._08_The_Executive_Framework._14_Waiting_for_Many_Tasks_to_Complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/// CompletableFuture - Waiting for Tasks to Complete:
///
/// | Method                 | Description                                                                 | Result Type                    | Use Case                                   |
/// |------------------------|-----------------------------------------------------------------------------|--------------------------------|--------------------------------------------|
/// | `CompletableFuture.allOf` | Waits for **all tasks** to complete. Does not return individual results directly. | `CompletableFuture<Void>`      | When all task results are required.        |
/// | `CompletableFuture.anyOf` | Completes when **any one task** finishes and provides its result.         | `CompletableFuture<Object>`    | When the first completed result is sufficient. |
///
/// Key Differences:
/// 1. **allOf**: Use when you need to wait for **all tasks** to finish (e.g., independent computations).
/// 2. **anyOf**: Use when you only need the result of the **first completed task** (e.g., querying multiple sources).
public class CompletableFuturesDemo {

	public static void show() {
		var first = CompletableFuture.supplyAsync(() -> 1);
		var second = CompletableFuture.supplyAsync(() -> 2);
		var third = CompletableFuture.supplyAsync(() -> 3);

		// Wait for all three tasks to finish
		CompletableFuture.allOf(first, second, third).thenRun(() -> {
			try {
				// Retrieve results from all tasks
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
