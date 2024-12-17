package part_03._08_The_Executive_Framework._9_Running_Code_on_Completion;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

	public static void show() {
		// 1. CompletableFuture.supplyAsync():
		// Runs a task asynchronously and provides a result (1 in this case).
		var future = CompletableFuture.supplyAsync(() -> 1);

		// 2. future.thenRun():
		future.thenRun(() -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Done");
		});

		// 3. future.thenRunAsync():
		future.thenRunAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Done");
		});

		// 4. future.thenAccept():
		// The result of the CompletableFuture is passed to the Consumer as an input
		future.thenAccept((result) -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(result);
		});

		// 5. future.thenAcceptAsync():
		future.thenAcceptAsync((result) -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(result);
		});

		try {
			Thread.sleep(2000); // Wait for all asynchronous tasks to finish
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
