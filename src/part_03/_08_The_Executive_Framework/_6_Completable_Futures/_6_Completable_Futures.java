package part_03._08_The_Executive_Framework._6_Completable_Futures;

/// CompletableFuture<T>: An implementation of both Future<T> and CompletionStage<T>.
///
/// 1. CompletableFuture<T> is a powerful class in Java that combines the functionalities
///    of Future<T> and CompletionStage<T>.
///
/// 2. Future<T>:
///    - Represents the result of an asynchronous computation.
///    - Its main limitation is that it requires blocking or polling to retrieve results.
///    - It doesn't support chaining or combining multiple asynchronous tasks easily.
///
/// 3. CompletionStage<T>:
///    - Represents a stage in a pipeline of computations.
///    - Each stage performs an action upon the completion of another stage.
///    - Allows chaining, composition, and orchestration of async tasks in a fluent manner.
///
/// 4. Relationship:
///    - CompletableFuture implements both Future and CompletionStage interfaces.
///    - This combination allows it to bridge the gap between traditional Future-based
///      asynchronous programming and modern, non-blocking, callback-style programming.
///
/// 5. Why use CompletableFuture and CompletionStage:
///    - Overcomes the blocking nature of Future with non-blocking methods.
///    - Supports a declarative style for chaining and composing tasks, such as:
///        - thenApply() to transform results.
///        - thenAccept() to consume results.
///        - thenCompose() to chain dependent tasks.
///        - thenCombine() to combine results from multiple tasks.
///    - Enables complex async workflows without explicit thread management.
///    - Integrates seamlessly with the ForkJoinPool, providing efficient task execution.
///
/// Example Applications:
/// - Asynchronous data retrieval (e.g., fetching data from multiple APIs in parallel).
/// - Task orchestration pipelines (e.g., processing steps in sequence or parallel).
/// - Building non-blocking, responsive applications.
public class _6_Completable_Futures {

}
