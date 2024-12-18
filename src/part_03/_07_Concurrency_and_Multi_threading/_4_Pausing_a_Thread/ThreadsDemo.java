/// Demonstration of multi-threading and daemon threads in Java.
///
/// Key Concepts:
/// 1. A single core executes only one thread at a time by performing one operation at a time.
/// 2. Through time slicing (a scheduling mechanism), the CPU switches rapidly between threads,
///    creating the illusion of simultaneous execution.
/// 3. Daemon threads:
///    - Background threads that do not prevent the JVM from exiting when the main thread finishes.
///    - Typically used for background tasks such as monitoring, logging, or cleanup.

package part_03._07_Concurrency_and_Multi_threading._4_Pausing_a_Thread;

public class ThreadsDemo {

	public static void show() {
		System.out.println(Thread.currentThread().getName() + " started");

		// Create and start 10 child threads
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new DownloadFileTask());

			// Mark the thread as a daemon thread
			// Daemon threads do not block JVM shutdown when the main thread finishes
			thread.setDaemon(true);
			thread.start();
		}

		System.out.println(Thread.currentThread().getName() + " finished");
	}

}