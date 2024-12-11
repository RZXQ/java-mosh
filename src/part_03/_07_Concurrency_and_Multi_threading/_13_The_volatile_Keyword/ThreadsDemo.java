package part_03._07_Concurrency_and_Multi_threading._13_The_volatile_Keyword;

public class ThreadsDemo {

	public static void show() {
		var status = new DownloadStatus();

		var thread1 = new Thread(new DownloadFileTask(status));

		// Create the second thread to monitor download progress
		// - This thread continuously checks if the download is complete by calling
		// isDone()
		// - When isDone() returns true, it will print the total bytes downloaded.
		var thread2 = new Thread(() -> {
			while (!status.isDone()) {
			}
			System.out.println(status.getTotalBytes());
		});

		thread1.start();
		thread2.start();
	}

}