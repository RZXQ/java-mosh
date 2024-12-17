package part_03._08_The_Executive_Framework._16_Handling_timeouts;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {

	public static void show() {
		var future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

			return 1;
		});

		try {
			// System.out.println(future.orTimeout(1, TimeUnit.SECONDS).get());
			System.out.println(future.completeOnTimeout(5, 1, TimeUnit.SECONDS).get());
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		catch (ExecutionException e) {
			throw new RuntimeException(e);
		}
	}

}
