package part_03._05_Lambda_Expressions_and_Functional_Interfaces._7_Built_in_Functional_Interfaces;

/// Four types of functional interfaces in Java:
/// 1. Consumer
/// 2. Supplier
/// 3. Function
/// 4. Predicate
///
/// | Functional Interface | Description                                                                                      | Method Signature                | Usage Example                                                                |
/// |----------------------|--------------------------------------------------------------------------------------------------|---------------------------------|-------------------------------------------------------------------------------|
/// | **Consumer**         | Represents an operation that accepts a single input argument and returns no result              | `void accept(T t)`              | `Consumer<String> printer = System.out::println;`                              |
/// | **Supplier**         | Represents a supplier of results, does not accept any input                                      | `T get()`                       | `Supplier<Double> randomValue = Math::random;`                                 |
/// | **Function**         | Represents a function that accepts one argument and produces a result                           | `R apply(T t)`                  | `Function<Integer, String> intToStr = String::valueOf;`                        |
/// | **Predicate**        | Represents a predicate (boolean-valued function) of one argument                                | `boolean test(T t)`             | `Predicate<String> isEmpty = String::isEmpty;`                                 |
public class _7_Built_in_Functional_Interfaces {

}
