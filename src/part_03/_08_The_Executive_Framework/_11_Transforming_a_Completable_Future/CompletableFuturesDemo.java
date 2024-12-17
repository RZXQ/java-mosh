package part_03._08_The_Executive_Framework._11_Transforming_a_Completable_Future;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

	public static int toFahrenheit(double celsius) {
		return (int) (celsius * 1.8 + 32);
	}

	public static void show() {
		// Create a CompletableFuture that supplies an initial value (20)
		var future = CompletableFuture.supplyAsync(() -> 20);

		// thenApply():
		// - This maps the result (Celsius) to a different type (Fahrenheit).
		//
		// thenAccept():
		// - Consumes the transformed result and performs an action.
		future.thenApply(CompletableFuturesDemo::toFahrenheit).thenAccept(System.out::println);
	}

}
