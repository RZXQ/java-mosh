package part_03._02_Exceptions._10_Re_throwing_Exceptions;

import java.io.IOException;

/// ## Reasons to Re-throw Exceptions
///
/// ### 1. Separation of Concerns
/// - **Local Handling**: The `ExceptionsDemo` class is responsible for handling the specific actions related to `Account` operations. Logging within this class makes sense because it's the immediate context of the error.
/// - **Global Handling**: Higher-level methods like the `main` method are responsible for overarching application flow and global error handling. They are better suited to decide how to handle exceptions on an application-wide scale.
///
/// ### 2. Flexibility and Maintainability
/// - **Evolving Requirements**: Future requirements might necessitate changing how errors are handled globally. By centralizing error handling in higher-level methods, you can easily adapt to these changes without modifying lower-level classes.
/// - **Single Point of Change**: If the error-handling logic needs to change, having it in the `main` method or another high-level context means you only have one place to update.
///
/// ### 3. Preserving Stack Trace and Context
/// - **Debugging**: Re-throwing maintains the full stack trace, providing an accurate depiction of the error's origin and propagation path, which is crucial for debugging complex issues.
/// - **Detailed Logging**: Higher-level methods can log additional context that might not be available in `ExceptionsDemo`.
///
/// ### 4. Broader Error Handling
/// - **Application State**: The `main` method or other higher-level context might have a broader understanding of the application's state and can decide the best course of action, such as shutting down gracefully or rolling back transactions.
/// - **User Interaction**: User-friendly messages and recovery options are better handled at a higher level where the full context of the application is known.
///
/// ## Comparison with Direct Handling
///
/// ### Handling Directly in `ExceptionsDemo`
///
/// ```java
/// package part_03._02_Exceptions._10_Re_throwing_Exceptions;
///
/// import java.io.IOException;
///
/// public class ExceptionsDemo {
///
///	public static void show() {
///		var account = new Account();
///		try {
///			account.deposit(-1);
///		} catch (IOException e) {
///			System.out.println("Logging");
///			System.out.println("An error occurred.");
///		}
///		System.out.println("Hello");
///	}
///
/// }
/// ```
///
/// **Pros**:
/// - Simplifies the `show` method by keeping all logic in one place.
/// - Eliminates the need to handle the exception in the `main` method.
///
/// **Cons**:
/// - Less flexible for future changes in error handling.
/// - Mixes error handling with business logic, violating the separation of concerns.
/// - Limited contextual handling—cannot manage broader application state or user interaction effectively.
///
/// ### Handling Globally in `main`
///
/// ```java
/// package part_03._02_Exceptions._10_Re_throwing_Exceptions;
///
/// public class _10_Re_throwing_Exceptions {
///    public static void main(String[] args) {
///        try {
///            ExceptionsDemo.show();
///        } catch (Exception e) {
///            // Handle the exception broadly.
///            System.out.println("An unexpected error occurred: " + e.getMessage());
///        }
///    }
/// }
/// ```
///
/// **Pros**:
/// - Maintains clean separation between logging (in `ExceptionsDemo`) and global handling (in `main`).
/// - Offers a single point for global error handling strategies.
/// - Flexible and easily maintainable for future changes.
///
/// **Cons**:
/// - Slightly more complex as it involves re-throwing and handling at multiple levels.
///
/// ## Summary
///
/// Handling exceptions solely within `ExceptionsDemo` might seem simpler but limits flexibility and violates separation of concerns. Re-throwing exceptions to a higher-level method like `main` allows for centralized, flexible, and maintainable error handling. This approach ensures that detailed context is preserved for debugging, and broader application state and user interactions are appropriately managed.
///
/// This design not only helps in current scenarios but also prepares the codebase for evolving requirements and more complex error-handling strategies.
///
/// If you need further clarification, feel free to ask!
/// ```
public class ExceptionsDemo {

	public static void show() throws IOException {
		var account = new Account();
		try {
			account.deposit(-1);
		}
		catch (IOException e) {
			System.out.println("Logging");
			throw e;
		}
		System.out.println("Hello");
	}

}
