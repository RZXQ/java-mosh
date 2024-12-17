package part_03._08_The_Executive_Framework._18_Solution_Getting_a_Quote;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FlightService {

	public CompletableFuture<Quote> getQuote(String site) {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("Getting a quote from " + site);
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

			var random = new Random();
			var price = 100 + random.nextInt(10);
			return new Quote(site, price);
		});
	}

}
