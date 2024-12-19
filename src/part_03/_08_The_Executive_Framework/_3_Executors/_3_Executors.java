package part_03._08_The_Executive_Framework._3_Executors;

import java.util.concurrent.Executors;

public class _3_Executors {

	public static void main(String[] args) {

		var executor = Executors.newFixedThreadPool(2);

		// Print the runtime class of the ExecutorService
		System.out.println(executor.getClass().getName());

		try {
			executor.submit(() -> System.out.println(Thread.currentThread().getName()));
		}
		finally {
			executor.shutdown();
		}

	}

}
