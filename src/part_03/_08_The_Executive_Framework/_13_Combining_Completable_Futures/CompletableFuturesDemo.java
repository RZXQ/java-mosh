package part_03._08_The_Executive_Framework._13_Combining_Completable_Futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

	public static void show() {
		var first = CompletableFuture.supplyAsync(() -> "20USD")
			.thenApply(str -> str.replace("USD", ""))
			.thenApply(Integer::parseInt);
		var second = CompletableFuture.supplyAsync(() -> 0.9);

		// Combines the results of two CompletableFutures when both complete.
		first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate).thenAccept(System.out::println);
	}

}
