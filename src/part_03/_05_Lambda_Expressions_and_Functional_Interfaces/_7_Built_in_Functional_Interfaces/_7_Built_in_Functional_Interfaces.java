package part_03._05_Lambda_Expressions_and_Functional_Interfaces._7_Built_in_Functional_Interfaces;

///
/// | Functional Interface | Description                                                                  | Method Signature      | Parameters | Return Value | Usage Example                                   |
/// |----------------------|------------------------------------------------------------------------------|-----------------------|------------|--------------|-------------------------------------------------|
/// | **Consumer<T>**      | Represents an operation that accepts a single input argument and returns no result. | `void accept(T t)`    | `T t`      | `void`       | `Consumer<String> printer = System.out::println;` |
/// | **Supplier<T>**      | Represents a supplier of results; it does not accept any input.              | `T get()`             | None       | `T`          | `Supplier<Double> randomValue = Math::random;`    |
/// | **Function<T,R>**    | Represents a function that accepts one argument and produces a result.       | `R apply(T t)`        | `T t`      | `R`          | `Function<Integer, String> intToStr = String::valueOf;` |
/// | **Predicate<T>**     | Represents a boolean-valued function of one argument.                        | `boolean test(T t)`   | `T t`      | `boolean`    | `Predicate<String> isEmpty = String::isEmpty;`     |
///
/// - Consumer: Takes an input of type T and performs an operation without returning any result.
/// - Supplier: Provides a result of type T without accepting any input.
/// - Function: Takes an input of type T and returns a result of type R.
/// - Predicate: Takes an input of type T and returns a boolean value.
public class _7_Built_in_Functional_Interfaces {

}