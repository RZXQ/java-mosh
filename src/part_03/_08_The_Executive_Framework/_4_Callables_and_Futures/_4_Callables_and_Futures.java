package part_03._08_The_Executive_Framework._4_Callables_and_Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class _4_Callables_and_Futures {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		var executor = Executors.newFixedThreadPool(2);
		try {
			// executor.submit(Callable)
			var future = executor.submit(() -> {
				LongTask.simulate();
				return 1;
			});

			System.out.println("Do more work");

			// future.get()
			System.out.println(future.get());
		}
		finally {
			executor.shutdown();
		}
	}

}
