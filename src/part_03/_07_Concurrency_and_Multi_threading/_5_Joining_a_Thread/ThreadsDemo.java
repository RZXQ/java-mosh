package part_03._07_Concurrency_and_Multi_threading._5_Joining_a_Thread;

public class ThreadsDemo {

	public static void show() {
		Thread thread = new Thread(new DownloadFileTask());

		// Start the download thread; this begins the execution of DownloadFileTask in
		// parallel
		thread.start();

		try {
			// The main thread is calling the join method on the thread object (which
			// represents the download thread).
			// - `join` is not executed by the download thread (`thread`) itself.
			// - Instead, the main thread is the one actively calling `join`.
			// - This means the main thread will pause here and wait for the download
			// thread to finish execution.
			// - The thread object (download thread) is just the "target" that the main
			// thread is waiting on.
			thread.join();

		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		// Once the download thread has finished (the join is complete),
		// the main thread resumes execution and prints this message
		System.out.println("File is ready to be scanned");
	}

}