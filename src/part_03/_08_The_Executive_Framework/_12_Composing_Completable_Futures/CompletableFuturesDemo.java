package part_03._08_The_Executive_Framework._12_Composing_Completable_Futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

	// 1. Simulate an asynchronous task to fetch the user's email.
	// CompletableFuture.supplyAsync() runs this task asynchronously.
	public static CompletableFuture<String> getUserEmailAsync() {
		return CompletableFuture.supplyAsync(() -> "email");
	}

	// 2. Simulate an asynchronous task to fetch the user's playlist based on their email.
	public static CompletableFuture<String> getUserPlayListAsync(String email) {
		return CompletableFuture.supplyAsync(() -> "playList");
	}

	public static void show() {
		// 3. Chain two asynchronous tasks:
		// - Step 1: Fetch the user's email asynchronously.
		// - Step 2: Use thenCompose() to fetch the playlist using the retrieved email.
		// thenCompose avoids nested CompletableFutures by flattening the result.
		// - Step 3: Consume the final result (playlist) and print it using thenAccept().
		getUserEmailAsync().thenCompose(CompletableFuturesDemo::getUserPlayListAsync).thenAccept(System.out::println);
	}

}
