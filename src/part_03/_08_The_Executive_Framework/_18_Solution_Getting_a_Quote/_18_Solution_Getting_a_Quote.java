package part_03._08_The_Executive_Framework._18_Solution_Getting_a_Quote;

public class _18_Solution_Getting_a_Quote {

	public static void main(String[] args) {
		FlightService flightService = new FlightService();
		flightService.getQuote("Site1").thenAccept(System.out::println);

		try {
			Thread.sleep(10_000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
