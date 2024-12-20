package part_03._08_The_Executive_Framework._6_Completable_Futures;

/// #  CompletableFuture = Future (Async) + CompletionStage (Chaining)
/// | Aspect            | Future                                           | CompletionStage                               | CompletableFuture                                    |
/// |-------------------|--------------------------------------------------|------------------------------------------------|------------------------------------------------------|
/// | Key Idea          | Represents the result of an async computation    | Represents a stage that triggers actions upon completion of another stage | Combines Future and CompletionStage capabilities      |
/// | Advantages        | Simple handle to async results                  | Enables non-blocking chains of dependent tasks | Offers both a Future’s result handling and a CompletionStage’s chaining and composition |
/// | Limitations       | Blocks on `get()`, lacks chaining and composition | Interface only; needs concrete implementations | N/A (Addresses Future’s limitations and provides a concrete CompletionStage implementation) |
public class _6_Completable_Futures {

}
