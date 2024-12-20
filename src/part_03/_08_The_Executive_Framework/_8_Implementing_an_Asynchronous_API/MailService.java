package part_03._08_The_Executive_Framework._8_Implementing_an_Asynchronous_API;

import java.util.concurrent.CompletableFuture;

public class MailService {

	// 1. Synchronous method
	public void send() {
		LongTask.simulate();
		System.out.println("Mail was sent.");
	}

	// 2. Asynchronous method
	public CompletableFuture<Void> sendAsync() {
		return CompletableFuture.runAsync(this::send);
	}

}
