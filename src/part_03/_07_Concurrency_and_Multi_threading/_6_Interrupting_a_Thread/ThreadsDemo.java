package part_03._07_Concurrency_and_Multi_threading._6_Interrupting_a_Thread;

public class ThreadsDemo {

	public static void show() {
		System.out.println(Thread.class.getName());

		Thread thread = new Thread(new DownloadFileTask());
		thread.start();

		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		// Interrupt the other thread to signal it should stop
		thread.interrupt(); // The 'interrupt' method sends an interrupt request.
		// It doesn't forcefully stop the thread; the thread
		// must explicitly check and handle this interrupt
		// signal within its code.
	}

}