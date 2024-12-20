package part_03._08_The_Executive_Framework._3_Executors;

import java.util.concurrent.Executors;

/// This class demonstrates the use of a fixed thread pool with Executors.
///
/// Features of Fixed Thread Pools:
/// - A fixed thread pool is created with a limited number of threads.
/// - Tasks submitted to the thread pool are maintained in a queue and wait for
///   an available thread to execute.
/// - Tasks exceeding the thread limit are queued internally.
/// - Tasks execute sequentially as threads become available.
/// - The executor's runtime class is ThreadPoolExecutor.
///
/// Proper Shutdown Management:
/// - If the executor is not explicitly shut down, threads in the thread pool
///   remain alive and continue waiting for new tasks.
/// - Calling shutdown ensures no new tasks are accepted and allows currently
///   running tasks to complete before shutting down.
///
/// Why use try-finally?
/// - Exceptions might occur during task submission, potentially leaving the
///   executor running.
/// - Using a finally block ensures that the executor is explicitly shut down
///   and released from memory, avoiding resource leaks.
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
