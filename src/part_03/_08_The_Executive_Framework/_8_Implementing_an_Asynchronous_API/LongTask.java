package part_03._08_The_Executive_Framework._8_Implementing_an_Asynchronous_API;

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
