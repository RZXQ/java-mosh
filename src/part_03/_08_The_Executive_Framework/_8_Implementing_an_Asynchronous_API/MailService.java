package part_03._08_The_Executive_Framework._8_Implementing_an_Asynchronous_API;

import java.util.concurrent.CompletableFuture;

public class MailService {

	// 1. Synchronous method
	public void send() {
		System.out.println(Thread.currentThread().getName() + " thread: ✉️Sending mail...");
		LongTask.simulate();
		System.out.println(Thread.currentThread().getName() + " thread: ✉️Mail was sent.");
	}

	// 2. Asynchronous method
	public CompletableFuture<Void> sendAsync() {
		return CompletableFuture.runAsync(this::send);
	}

}
