package part_03._07_Concurrency_and_Multi_threading._3_Starting_a_Thread;

public class ThreadsDemo {

	public static void show() {
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new DownloadFileTask());
			thread.start();
		}

	}

}