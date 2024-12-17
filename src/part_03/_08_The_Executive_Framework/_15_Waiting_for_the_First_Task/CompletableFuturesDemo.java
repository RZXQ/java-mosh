package part_03._08_The_Executive_Framework._15_Waiting_for_the_First_Task;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

	public static void show() {
		var first = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			return 20;
		});

		var second = CompletableFuture.supplyAsync(() -> {
			return 20;
		});

		// Use CompletableFuture.anyOf():
		// - It accepts multiple CompletableFutures and returns the result of the fastest
		// one.
		CompletableFuture.anyOf(first, second).thenAccept(System.out::println);
	}

}
