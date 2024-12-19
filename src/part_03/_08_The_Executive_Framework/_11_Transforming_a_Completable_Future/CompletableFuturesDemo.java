package part_03._08_The_Executive_Framework._11_Transforming_a_Completable_Future;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

	public static int toFahrenheit(double celsius) {
		return (int) (celsius * 1.8 + 32);
	}

	public static void show() {
		var future = CompletableFuture.supplyAsync(() -> 20);

		// thenApply() - Transforms the result from Celsius to Fahrenheit.
		// thenAccept() - Consumes the transformed result (Fahrenheit) and prints it.
		future.thenApply(CompletableFuturesDemo::toFahrenheit).thenAccept(System.out::println);
	}

}
