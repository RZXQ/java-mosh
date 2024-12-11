package part_03._07_Concurrency_and_Multi_threading._10_Confinement;

import java.util.ArrayList;
import java.util.List;

/// Main entry method to demonstrate multithreaded file downloads.
/// -   Creates and manages threads to download files concurrently.
/// -   Uses confinement to prevent race conditions by keeping each
///     download's status confined to its own thread.
/// -   Waits for all threads to finish and then aggregates the results.
public class ThreadsDemo {

	public static void show() {
		// List to store all threads, enabling us to wait for each to finish
		List<Thread> threads = new ArrayList<>();
		// List to store each download task for later aggregation of results
		List<DownloadFileTask> tasks = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			var task = new DownloadFileTask();
			tasks.add(task);

			var thread = new Thread(task);
			thread.start();
			threads.add(thread);
		}

		for (Thread thread : threads) {
			try {
				thread.join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Since each task confined its download status, we safely combine results
		var totalBytes = tasks.stream().map(task -> task.getStatus().getTotalBytes()).reduce(Integer::sum);

		System.out.println(totalBytes);
	}

}