package part_03._08_The_Executive_Framework._4_Callables_and_Futures;

public class LongTask {

	public static void simulate() {
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
