package part_03._02_Exceptions._12_Chaining_Exceptions;

import java.io.IOException;

/// | Aspect                | **Exception Inheritance**                                              | **Exception Chaining**                                             |
/// |-----------------------|------------------------------------------------------------------------|--------------------------------------------------------------------|
/// | **Definition**        | Creating a family tree of exception classes using inheritance (`extends`) | Linking exceptions together by specifying one as the cause of another |
/// | **Relationship Type** | **"Is-a"** relationship<br>(One exception **is a type of** another)    | **"Caused by"** relationship<br>(One exception **was caused by** another) |
/// | **Purpose**           | - Organize exceptions into a hierarchy  <br>- Allow catching groups of related exceptions | - Preserve original exception details  <br>- Provide more context when handling exceptions |
/// | **When to Use**       | - Exceptions are closely related  <br>- You need specific exceptions that share common behavior | - An exception occurs because of another exception  <br>- You're handling exceptions from different layers (e.g., I/O and business logic) |
/// | **How to Implement**  | - Create a subclass exception that `extends` a superclass exception    | - Use `initCause()` method or exception constructor to link exceptions |
/// | **Catching Exceptions** | - Can catch the superclass to handle all related exceptions  <br><br>**Example:**<br>`catch (AccountException e)` | - Catch the higher-level exception and retrieve the cause if needed  <br><br>**Example:**<br>`catch (AccountException e) { Throwable cause = e.getCause(); }` |
/// | **Advantages**        | - Simplifies exception handling  <br>- Logical organization of exceptions | - Keeps original error information  <br>- Helps in debugging by showing the root cause |
/// | **Disadvantages**     | - Can become complex if too many subclasses  <br>- Overusing inheritance may clutter code | - Requires extra code to set up the chain  <br>- May need to check `getCause()` to find the original error |
public class Account {

	private float balance;

	public void deposit(float value) throws IOException {
		if (value <= 0) {
			throw new IOException();
		}
	}

	public void withdraw(float value) throws AccountException {
		if (value > balance) {
			throw new AccountException(new InsufficientFundsException());
		}
	}

}
