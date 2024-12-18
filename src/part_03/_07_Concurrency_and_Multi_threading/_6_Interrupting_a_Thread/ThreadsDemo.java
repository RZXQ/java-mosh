package part_03._07_Concurrency_and_Multi_threading._6_Interrupting_a_Thread;
/// In a multithreaded environment, we often need to signal one thread from another to stop or change its behavior.

/// One common approach is to use the `interrupt()` method on a running thread.
///
/// Calling `thread.interrupt()` does not forcibly stop the thread immediately. Instead, it sets an internal "interrupted" flag inside the target thread.
/// If that thread is currently blocked (for example, if it's sleeping or waiting), it will be "woken up" and an `InterruptedException` will be thrown. This is similar to waking someone who is sleeping: they notice the interruption as soon as they are awakened (i.e., they are in a blocking state like `Thread.sleep()`).
///
/// **Blocking example:**
/// `Thread.sleep(1000)` is a blocking call. If the thread is interrupted while sleeping, it immediately stops sleeping and throws an `InterruptedException`. At this point, the thread knows it's been interrupted and can decide to stop or do something else.
///
/// **Non-blocking example:**
/// If a thread is running a loop without any blocking calls (e.g., continuously printing numbers without using `sleep()`), then calling `interrupt()` only sets its interrupted flag. The thread will not automatically stop. The thread must periodically check `Thread.currentThread().isInterrupted()` and, upon detecting the interruption, gracefully exit or take appropriate action. This is similar to someone who is busy working non-stop without lifting their head. Even if you tell them to stop, unless they periodically check for a signal (like looking up for instructions), they won't know they should stop.
///
/// In the code below, we demonstrate starting a thread and then interrupting it. Note that:
/// - The `interrupt` method sends an interrupt request.
/// - It doesn't forcefully stop the thread; the thread must explicitly check and handle this interrupt signal within its code.
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
