package part_03._07_Concurrency_and_Multi_threading._10_Confinement;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo {

	/**
	 * 1. Main entry method to demonstrate multithreaded file downloads. - Creates and
	 * manages threads to download files concurrently. - Uses confinement to prevent race
	 * conditions by keeping each download's status confined to its own thread. - Waits
	 * for all threads to finish and then aggregates the results.
	 */
	public static void show() {
		// 2. List to store all threads, enabling us to wait for each to finish
		List<Thread> threads = new ArrayList<>();
		// 3. List to store each download task for later aggregation of results
		List<DownloadFileTask> tasks = new ArrayList<>();

		// 4. Loop to create and start 10 file download tasks, each in its own thread
		for (int i = 0; i < 10; i++) {
			// 4.1 Create a new task for downloading a file
			var task = new DownloadFileTask();
			// 4.2 Add this task to the list for tracking progress
			tasks.add(task);

			// 4.3 Create a new thread to execute this task
			var thread = new Thread(task);
			thread.start(); // Start the task in a separate thread
			// 4.4 Add this thread to the list so we can wait for it later
			threads.add(thread);
		}

		// 5. Wait for all threads to complete to ensure all downloads are done
		for (Thread thread : threads) {
			try {
				// 5.1 Use `join` to make sure each thread completes before moving on
				thread.join();
			}
			catch (InterruptedException e) {
				// 5.2 Handle any interruption that may occur while waiting
				e.printStackTrace();
			}
		}

		// 6. Aggregate the total bytes downloaded by all tasks
		// - Since each task confined its download status, we safely combine results
		var totalBytes = tasks.stream()
			.map(task -> task.getStatus().getTotalBytes()) // 6.1 Get bytes from each task
			.reduce(Integer::sum); // 6.2 Sum up all bytes

		// 7. Print out the total bytes downloaded by all tasks
		System.out.println(totalBytes); // Use 0 if no tasks were run
	}

}