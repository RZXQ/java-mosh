package part_03._08_The_Executive_Framework._19_Solution_Getting_Many_Quotes;

import java.util.stream.Collectors;

public class _19_Solution_Getting_a_Quote {

	public static void main(String[] args) {
		var service = new FlightService();
		service.getQuotes().map(future -> future.thenAccept(System.out::println)).collect(Collectors.toList());

		try {
			Thread.sleep(10_000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
