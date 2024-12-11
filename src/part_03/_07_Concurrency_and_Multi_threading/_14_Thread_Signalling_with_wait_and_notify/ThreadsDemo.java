package part_03._07_Concurrency_and_Multi_threading._14_Thread_Signalling_with_wait_and_notify;

public class ThreadsDemo {

	public static void show() {
		var status = new DownloadStatus();

		// Thread 1: Responsible for downloading the file
		var thread1 = new Thread(new DownloadFileTask(status));

		// Thread 2: Waits for the download to complete and prints total bytes
		var thread2 = new Thread(() -> {
			// Continuously checks if the download is complete
			while (!status.isDone()) {
				synchronized (status) {
					try {
						// Waits for a notification from the download thread
						// - Releases the lock on 'status' and pauses the thread
						// - Re-acquires the lock when notified and resumes execution
						status.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace(); // Logs the interruption
					}
				}
			}
			// Once the download is complete, print the total bytes downloaded
			System.out.println(status.getTotalBytes());
		});

		thread1.start(); // Starts the download process
		thread2.start(); // Starts monitoring the download status
	}

}
