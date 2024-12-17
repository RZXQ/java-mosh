package part_03._08_The_Executive_Framework._20_Solution_Random_Delays;

import part_03._08_The_Executive_Framework._19_Solution_Getting_Many_Quotes.FlightService;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFuturesDemo {

	public static void show() {
		var start = LocalTime.now();
		var service = new FlightService();
		var futures = service.getQuotes()
			.map(future -> future.thenAccept(System.out::println))
			.collect(Collectors.toList());

		CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).thenRun(() -> {
			var end = LocalTime.now();
			var duration = Duration.between(start, end);
			System.out.println("Retrieved all quote in " + duration.toMillis() + " msec.");
		});

		try {
			Thread.sleep(10_000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
