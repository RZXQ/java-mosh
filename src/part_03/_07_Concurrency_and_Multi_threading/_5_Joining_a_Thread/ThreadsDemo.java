/// Demonstration of multi-threading with thread joining in Java.
///
/// Key Concepts:
/// 1. Thread joining allows one thread to wait for another thread to complete before resuming.
/// 2. The `main` thread joins (waits for) the `download` thread.
/// 3. This ensures that tasks dependent on the completion of another thread execute in the correct order.
package part_03._07_Concurrency_and_Multi_threading._5_Joining_a_Thread;

public class ThreadsDemo {

	public static void show() {
		Thread thread = new Thread(new DownloadFileTask());

		// Start the download thread; it runs in parallel with the main thread.
		thread.start();

		try {
			// The main thread calls `join` on the download thread.
			// This means the main thread will pause here and wait until
			// the download thread has finished execution.
			thread.join();
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		// After the download thread finishes, the main thread resumes and prints this
		// message.
		System.out.println("File is ready to be scanned");
	}

}
