package part_03._08_The_Executive_Framework._10_Handling_Exceptions;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

	public static void show() {
		var future = CompletableFuture.supplyAsync(() -> {
			System.out.println("Fetching the current weather...");
			throw new IllegalStateException("Weather service not available.");
		});

		try {
			// Use exceptionally() to handle exceptions and provide a fallback value.
			var temperature = future.exceptionally(ex -> {
				System.out.println("Exception occurred: " + ex);
				return 23; // Fallback value
			}).get();

			System.out.println("Temperature: " + temperature);
		}
		catch (InterruptedException e) {
			throw new RuntimeException("Interrupted while waiting for result", e);
		}
		catch (ExecutionException e) {
			throw new RuntimeException("Error during asynchronous computation", e);
		}
	}

}
