package part_03._07_Concurrency_and_Multi_threading._12_The_synchronized_Keyword;

public class DownloadStatus {

	// Lock for synchronizing access to totalBytes
	private final Object totalBytesLock = new Object();

	// Lock for synchronizing access to totalFiles
	private final Object totalFilesLock = new Object();

	private int totalBytes;

	private int totalFiles;

	public int getTotalBytes() {
		return totalBytes;
	}

	public int getTotalFiles() {
		return totalFiles;
	}

	// Increments totalBytes with a synchronized block
	public void incrementTotalBytes() {
		// Synchronizes on totalBytesLock to ensure thread-safe updates to totalBytes
		// Using a dedicated lock prevents unnecessary contention with other locks
		synchronized (totalBytesLock) {
			this.totalBytes++;
		}
	}

	// Increments totalFiles using the synchronized keyword
	// Don't use the synchronized keyword in new codebase
	public synchronized void incrementTotalFiles() {
		// Synchronizes on the current instance (equivalent to synchronized(this))
		// Ensures only one thread can execute this method or other synchronized methods
		// on the same object
		this.totalFiles++;
	}

}
