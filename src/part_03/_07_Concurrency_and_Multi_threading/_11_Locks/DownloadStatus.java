package part_03._07_Concurrency_and_Multi_threading._11_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/// Locking Mechanism
/// - `lock` is a ReentrantLock object that restricts access to `totalBytes`.
/// - Only one thread can modify `totalBytes` at any given time when the lock is
/// acquired.
public class DownloadStatus {

	private final Lock lock = new ReentrantLock();

	private int totalBytes;

	public int getTotalBytes() {
		return totalBytes;
	}

	public void incrementTotalBytes() {
		lock.lock();
		try {
			totalBytes++;
		}
		finally {
			lock.unlock(); // Release the lock in `finally` to avoid deadlock
		}
	}

}