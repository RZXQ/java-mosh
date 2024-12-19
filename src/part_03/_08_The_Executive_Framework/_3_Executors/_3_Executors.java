package part_03._08_The_Executive_Framework._3_Executors;

import java.util.concurrent.Executors;

public class _3_Executors {

	public static void main(String[] args) {

		// Create a fixed thread pool with 2 threads
		var executor = Executors.newFixedThreadPool(2);

		// Print the runtime class of the ExecutorService
		// (The actual implementation will be ThreadPoolExecutor)
		System.out.println("Executor type: " + executor.getClass().getName());

		try {
			// Submit 10 tasks to the executor
			for (int i = 0; i < 10; i++) {
				// Explanation:
				// - Fixed thread pool has only 2 threads.
				// - Tasks beyond the thread limit are queued internally by the executor.
				// - Tasks will execute sequentially as threads become available.
				executor
					.submit(() -> System.out.println("Executing task in thread: " + Thread.currentThread().getName()));
			}
		}
		finally {
			// Shutdown the executor:
			// - Ensures that no new tasks will be accepted.
			// - Waits for the currently running tasks to complete before shutting down.
			// - If not explicitly shut down, threads will remain active and keep waiting
			// for new tasks, causing the program to hang.
			executor.shutdown();
		}
	}

}
