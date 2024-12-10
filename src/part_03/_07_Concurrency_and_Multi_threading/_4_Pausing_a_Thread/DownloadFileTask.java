package part_03._07_Concurrency_and_Multi_threading._4_Pausing_a_Thread;

public class DownloadFileTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Downloading a file: " + Thread.currentThread().getName());

		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		System.out.println("Download complete: " + Thread.currentThread().getName());
	}

}
