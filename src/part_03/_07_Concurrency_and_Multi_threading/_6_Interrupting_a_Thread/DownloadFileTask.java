package part_03._07_Concurrency_and_Multi_threading._6_Interrupting_a_Thread;

public class DownloadFileTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (Thread.currentThread().isInterrupted()) {
				return;
			}
			System.out.println(Thread.currentThread().getName() + " is downloading " + i + " bytes");
		}
	}

}