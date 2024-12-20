package part_03._07_Concurrency_and_Multi_threading._10_Confinement;

public class DownloadFileTask implements Runnable {

	private final DownloadStatus status;

	public DownloadFileTask() {
		this.status = new DownloadStatus();
	}

	public DownloadStatus getStatus() {
		return status;
	}

	@Override
	public void run() {
		System.out.println("Downloading a file: " + Thread.currentThread().getName());
		for (int i = 0; i < 10_000; i++) {
			System.out.println("Downloading byte " + i);

			status.incrementTotalBytes();
		}

		System.out.println("Download complete: " + Thread.currentThread().getName());
	}

}