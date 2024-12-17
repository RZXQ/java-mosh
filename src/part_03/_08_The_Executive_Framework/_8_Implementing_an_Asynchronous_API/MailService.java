package part_03._08_The_Executive_Framework._8_Implementing_an_Asynchronous_API;

import java.util.concurrent.CompletableFuture;

public class MailService {

	public void send() {
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		System.out.println("Mail was sent.");
	}

	// Convert the send() method to an asynchronous version
	public CompletableFuture<Void> sendAsync() {
		// Use CompletableFuture to run the send() method asynchronously
		return CompletableFuture.runAsync(this::send);
	}

}
