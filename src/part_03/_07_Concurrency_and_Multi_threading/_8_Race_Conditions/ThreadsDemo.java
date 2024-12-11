package part_03._07_Concurrency_and_Multi_threading._8_Race_Conditions;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo {

	public static void show() {
		var status = new DownloadStatus();

		List<Thread> threads = new ArrayList<>();

		for (var i = 0; i < 10; i++) {
			var thread = new Thread(new DownloadFileTask(status));
			thread.start();
			threads.add(thread);
		}

		// wait for all the threads to finish
		for (var thread : threads) {
			try {
				thread.join();
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

		System.out.println(status.getTotalBytes());
	}

}