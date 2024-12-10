package part_03._07_Concurrency_and_Multi_threading._5_Joining_a_Thread;

public class ThreadsDemo {

	public static void show() {
		Thread thread = new Thread(new DownloadFileTask());
		thread.start();

		try {
			thread.join();// Main thread waits for the download thread to finish
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		System.out.println("File is ready to be scanned");
	}

}