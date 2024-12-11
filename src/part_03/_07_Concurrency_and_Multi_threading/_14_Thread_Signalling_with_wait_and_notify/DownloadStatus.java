package part_03._07_Concurrency_and_Multi_threading._14_Thread_Signalling_with_wait_and_notify;

public class DownloadStatus {

	private volatile boolean isDone;

	private int totalBytes;

	public int getTotalBytes() {
		return totalBytes;
	}

	public void incrementTotalBytes() {
		this.totalBytes++;
	}

	public boolean isDone() {
		return isDone;
	}

	public void done() {
		isDone = true;
	}

}