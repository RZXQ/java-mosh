package part_03._08_The_Executive_Framework._20_Solution_Random_Delays;

public class LongTask {

	public static void simulate(int delay) {
		try {
			Thread.sleep(delay);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
