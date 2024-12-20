package part_03._08_The_Executive_Framework._8_Implementing_an_Asynchronous_API;

public class _8_Implementing_an_Asynchronous_API {

	public static void main(String[] args) {
		var service = new MailService();

		// 1. Synchronous method (Blocking)
		service.send();
		System.out.println("Main thread: This line is blocked until send() completes.");

		// 2. Asynchronous method (Non-blocking)
		service.sendAsync();
		System.out.println("Main thread: This line executes immediately without waiting for sendAsync().");

		// Wait for the asynchronous task to complete
		try {
			Thread.sleep(5000);// Sleep is used to wait for the async task to finish
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
