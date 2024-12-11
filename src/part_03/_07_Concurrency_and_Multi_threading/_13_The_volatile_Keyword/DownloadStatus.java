package part_03._07_Concurrency_and_Multi_threading._13_The_volatile_Keyword;

public class DownloadStatus {

	// Volatile keyword for isDone:
	// Declaring isDone as volatile ensures that updates to this variable are immediately
	// visible to all threads.
	// - Without volatile, each thread could keep a cached copy of isDone and might not
	// see changes made by other threads.
	// - Volatile forces all reads/writes to go directly to main memory, bypassing the
	// thread's local cache.
	private volatile boolean isDone; // Indicates if the download is complete

	private int totalBytes;

	public int getTotalBytes() {
		return totalBytes;
	}

	public void incrementTotalBytes() {
		this.totalBytes++;
	}

	// Getter for isDone with Volatile: Returns the current value of isDone.
	// - Since isDone is volatile, all threads always see the latest value directly from
	// main memory.
	// - This avoids issues of cached values, making it suitable for flags.
	public boolean isDone() {
		return isDone;
	}

	// Setter for isDone
	// Sets isDone to true, indicating that the download is complete.
	// - Due to the volatile keyword, this update is immediately visible to other threads.
	public void done() {
		isDone = true;
	}

}