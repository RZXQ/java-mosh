package part_03._07_Concurrency_and_Multi_threading._4_Pausing_a_Thread;

///  A single core can only execute one thread at a time because it can perform only one operation at a time.
/// However, through time slicing (a mechanism in thread scheduling), the CPU switches rapidly between threads, giving the illusion that multiple threads are running simultaneously.
public class ThreadsDemo {

	public static void show() {
		System.out.println(Thread.currentThread().getName() + " started");

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new DownloadFileTask());

			// The child threads will be marked as daemon threads.
			// Once the main thread finishes, the JVM will terminate immediately, even if
			// the daemon threads are still running.
			thread.setDaemon(true);
			thread.start();
		}
		System.out.println(Thread.currentThread().getName() + " finished");
	}

}
