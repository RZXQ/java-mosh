package part_03._08_The_Executive_Framework._3_Executors;

import java.util.concurrent.Executors;

/// This class demonstrates the use of a fixed thread pool with Executors.
///
/// Key Points:
/// - A fixed thread pool is created with a limited number of threads.
/// - Tasks exceeding the thread limit are queued internally.
/// - Tasks execute sequentially as threads become available.
/// - The executor's runtime class is ThreadPoolExecutor.
///
/// Shutdown Behavior:
/// - The executor must be explicitly shut down to prevent threads from remaining
///   active and waiting for new tasks.
/// - The shutdown ensures no new tasks are accepted and waits for currently
///   running tasks to complete.
public class _3_Executors {

	public static void main(String[] args) {

		var executor = Executors.newFixedThreadPool(2);
		// Print the runtime class of the ExecutorService: ThreadPoolExecutor
		System.out.println("Executor type: " + executor.getClass().getName());

		try {
			// Submit 10 tasks to the executor
			for (int i = 0; i < 10; i++) {
				executor
					.submit(() -> System.out.println("Executing task in thread: " + Thread.currentThread().getName()));
			}
		}
		finally {
			// Shutdown the executor
			executor.shutdown();
		}
	}

}
