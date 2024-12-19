package part_03._08_The_Executive_Framework._4_Callables_and_Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/// **"Callable" vs. "Runnable":**
///
/// | **Aspect**            | **Runnable**                                     | **Callable**                                     |
/// |-----------------------|--------------------------------------------------|-------------------------------------------------|
/// | **Primary Use**       | Represents a task to be executed but returns no result. | Represents a task that returns a result.         |
/// | **Method**            | `run()`                                         | `call()`                                        |
/// | **Return Type**       | `void` (does not return anything).              | A generic type `V` (produces a value).          |
/// | **Exception Handling**| Cannot throw checked exceptions.                | Can throw checked exceptions.                   |
/// | **When to Use**       | For fire-and-forget tasks (e.g., logging).       | For tasks that return a result or handle errors.|
///
/// **Key Takeaway:**
/// - Use `Runnable` when the task doesn't require a result or exception handling.
/// - Use `Callable` when you need the task to return a result or handle exceptions.
public class _4_Callables_and_Futures {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		var executor = Executors.newFixedThreadPool(2);

		try {
			// Submit a Callable task that simulates a long operation and returns a value
			var future = executor.submit(() -> {
				System.out.println("Task started in thread: " + Thread.currentThread().getName());
				LongTask.simulate(); // Simulate a long-running task
				return 1; // Callable supports returning a value
			});

			// future.get() blocks the main thread until the task completes and returns a
			// value
			System.out.println("Task result: " + future.get());

			// This line executes after the task has completed
			System.out.println("Main thread continues with other work.");

		}
		finally {
			// Shut down the executor to release resources
			executor.shutdown();
		}
	}

}
