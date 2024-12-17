package part_03._08_The_Executive_Framework._8_Implementing_an_Asynchronous_API;

public class _8_Implementing_an_Asynchronous_API {

	public static void main(String[] args) {
		var service = new MailService();

		// 1. Demonstration of synchronous method (blocking)
		// service.send();
		// // This will print only after the send() method completes.
		// System.out.println("Hello World");

		// 2. Demonstration of asynchronous method:
		// Call sendAsync() to send the mail asynchronously, allowing other work to
		// continue in parallel.
		service.sendAsync();
		// This will print immediately, without waiting for sendAsync() to finish.
		System.out.println("Hello World");

		// 3. Wait for the asynchronous task to finish (approve mail was sent)
		// Sleep for 5 seconds to ensure the mail is sent before the program ends.
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}