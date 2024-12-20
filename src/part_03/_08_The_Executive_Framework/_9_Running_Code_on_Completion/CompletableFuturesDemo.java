package part_03._08_The_Executive_Framework._9_Running_Code_on_Completion;

import java.util.concurrent.CompletableFuture;

/// CompletableFuture Completion Callbacks:
/// 1. CompletableFuture.supplyAsync(Supplier):
///    - Executes a task asynchronously and returns a result.
///    - By default, runs on ForkJoinPool.commonPool unless a custom executor is provided.
///
/// 2. thenRun(Runnable):
///    - Runs a task when the CompletableFuture completes. Does not use the result of the stage.
///    - Inherits the thread of the previous stage (same thread).
///
/// 3. thenRunAsync(Runnable):
///    - Runs a task asynchronously when the CompletableFuture completes. Does not use the result.
///    - Typically runs on ForkJoinPool.commonPool in a separate thread, unless a custom executor is specified.
///    - However, under certain conditions (e.g., thread starvation or executor behavior),
///      it may run on the same thread as the previous stage.
///
/// 4. thenAccept(Consumer):
///    - Consumes the result of the CompletableFuture using the same thread as the previous stage.
///    - Suitable for lightweight, synchronous operations on the result.
///
/// 5. thenAcceptAsync(Consumer):
///    - Consumes the result of the CompletableFuture asynchronously in a new thread.
///    - Uses ForkJoinPool.commonPool by default unless a custom executor is provided.
///    - Similar to thenRunAsync, it may fall back to the same thread under certain conditions.
///
/// 6. Purpose of these methods:
///    - Enable chaining or attaching additional actions to be performed after an asynchronous task completes.
///    - Provide flexibility for handling results (`thenAccept` / `thenAcceptAsync`) or simply triggering additional
///      processing (`thenRun` / `thenRunAsync`).
///    - Helps in creating non-blocking, fluent asynchronous pipelines.
public class CompletableFuturesDemo {

	public static void show() throws InterruptedException {
		var future = CompletableFuture.supplyAsync(() -> 1);

		// 1. future.thenRun():
		future.thenRun(() -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Done");
		});

		// 2. future.thenRunAsync():
		future.thenRunAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Done");
		});

		// 3. future.thenAccept():
		future.thenAccept((result) -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(result);
		});

		// 4. future.thenAcceptAsync():
		future.thenAcceptAsync((result) -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(result);
		});

		Thread.sleep(2000);
	}

}
