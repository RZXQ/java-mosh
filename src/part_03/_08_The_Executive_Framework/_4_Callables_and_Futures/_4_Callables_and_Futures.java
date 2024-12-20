package part_03._08_The_Executive_Framework._4_Callables_and_Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/// 1. Future future = executor.submit(Runnable or Callable Object)
/// 2. Calling executor.submit(...) starts the asynchronous execution of the task.
/// 3. future.get() Blocking Behavior:
///    - If the worker thread has not yet completed the task (still sleeping or
///      processing), future.get() blocks the main thread until the worker finishes.
///    - If the worker thread has already completed the task, future.get() returns
///      immediately with the result.

public class _4_Callables_and_Futures {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		try (var executor = Executors.newFixedThreadPool(2)) {

			var future = executor.submit(() -> {
				LongTask.simulate(); // Simulate a long-running task
				return 1; // Callable supports returning a value
			});

			// Demo 1: The worker thread has not yet finished the task.
			// future.get() will block until completion.
			System.out.println("This line prints immediately, no blocking here.");
			System.out.println("ThreadPool task result: " + future.get());
			System.out.println("This line prints after the worker completes.");

			// Demo 2: If the worker thread completes before future.get() is called,
			// then future.get() returns immediately without blocking.
			// To simulate this scenario, you could sleep the main thread long enough
			// for the worker to finish first, then call future.get().
			// Example:
			// Thread.sleep(5000);
			// System.out.println("Main thread waited, worker done.");
			// System.out.println("ThreadPool task result: " + future.get());
			// System.out.println("No blocking now, immediate result.");
		}
	}

}
