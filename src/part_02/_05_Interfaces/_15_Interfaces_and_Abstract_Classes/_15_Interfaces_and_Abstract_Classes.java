package part_02._05_Interfaces._15_Interfaces_and_Abstract_Classes;

/// # Interfaces VS Abstract Classes
/// | Interfaces                      | Abstract Classes                    |
/// |----------------------------------|-------------------------------------|
/// | **(Contracts)**                  | **(Partially-completed Classes)**   |
/// | To build loosely-coupled,        | To share code                       |
/// | extensible, testable applications|                                     |
///
/// # Analogy:
///
/// ### Abstract Class (Person):
///
/// - Represents the general concept of a person.
/// - Contains common attributes and behaviors shared by all people (e.g., `breathe()`, `eat()`, `sleep()`).
/// - Cannot be instantiated on its own—you can't create a generic "Person" without specifying more details.
///
/// ### Extending the Abstract Class:
///
/// - You extend `Person`, inheriting all the common behaviors.
/// - By extending `Person`, you become a specific instance that embodies the general characteristics of a person.
///
/// ### Interfaces (Specific Skill Sets or Training Classes):
///
/// - Represent additional capabilities or skills that are not necessarily shared by all people.
/// - Examples might be `Programmer`, `Musician`, `Athlete`, each defining specific methods like `writeCode()`, `playInstrument()`, or `competeInSport()`.
/// - By "going to training classes," you implement these interfaces, agreeing to fulfill the contracts they define.
///
/// ### Implementing Interfaces:
///
/// - When you implement an interface like `Musician`, you commit to providing behaviors such as `playInstrument()`.
/// - This doesn't affect your status as a `Person`; it adds extra capabilities.
///
/// ---
///
/// ## Visual Representation
///
/// ```java
/// // Abstract Class
/// public abstract class Person {
///     protected String name;
///
///     public Person(String name) {
///         this.name = name;
///     }
///
///     public void breathe() {
///         System.out.println(name + " is breathing.");
///     }
///
///     public void eat() {
///         System.out.println(name + " is eating.");
///     }
///
///     // Abstract method
///     public abstract void introduce();
/// }
///
/// // Interface
/// public interface Musician {
///     void playInstrument();
/// }
///
/// public interface Athlete {
///     void competeInSport();
/// }
///
/// // Class that extends an abstract class and implements interfaces
/// public class You extends Person implements Musician, Athlete {
///     public You(String name) {
///         super(name);
///     }
///
///     @Override
///     public void introduce() {
///         System.out.println("Hi, my name is " + name + ".");
///     }
///
///     @Override
///     public void playInstrument() {
///         System.out.println(name + " is playing an instrument.");
///     }
///
///     @Override
///     public void competeInSport() {
///         System.out.println(name + " is competing in a sport.");
///     }
/// }
///```
/// ## Explanation:
/// - **You** extends `Person`, inheriting common behaviors and providing an implementation for the abstract method `introduce()`.
/// - **You** implements `Musician` and `Athlete`, adding specialized skills.
/// - Now, **You** can do all the general things a `Person` can do, plus the specific actions defined in the interfaces.
///
/// ## Why Your Analogy Works
///
/// ### Inheritance of Common Traits:
/// - By extending `Person`, you inherit all the shared characteristics, just as all humans share certain biological functions.
///
/// ### Acquiring Unique Skills:
/// - By implementing interfaces, you acquire additional skills that are not inherent to all persons.
/// - Interfaces represent optional capabilities that can be "added on" to the basic person.
///
/// ### Flexibility and Extensibility:
/// - Any person can choose to implement different interfaces (skills) without affecting the hierarchy.
/// - This mirrors real life, where people can learn new skills or professions over time.
///
/// ## Extending the Analogy
///
/// ### Multiple Skills (Multiple Interfaces):
/// - Just as you can attend multiple training classes, a class can implement multiple interfaces.
/// - This allows you to have various skills and abilities, making your class versatile.
///
/// ### Others Can Implement the Same Interface:
/// - Other classes (people) can also implement `Musician`, `Athlete`, or any other skill interfaces.
/// - This shows that interfaces define capabilities that can be shared across unrelated classes.
///
/// ## Comparing Abstract Classes and Interfaces in Your Analogy
///
/// | Concept              | In Your Analogy                                                        |
/// |----------------------|------------------------------------------------------------------------|
/// | Abstract Class        | `Person` — the general concept of a human being with common traits     |
/// | Extending             | You inherit from `Person`, gaining all common human behaviors          |
/// | Interface             | Skill sets or training classes (`Musician`, `Athlete`)                 |
/// | Implementing          | You acquire specific skills by implementing interfaces, agreeing to perform certain actions |
/// | Shared Behavior       | All people `breathe()`, `eat()`, `sleep()` (methods from `Person`)     |
/// | Unique Capabilities   | Specific skills like `playInstrument()` or `competeInSport()` (methods from interfaces) |
///
/// ## Key Takeaways
///
/// ### Abstract Classes:
/// - Use them to define a common base with shared attributes and behaviors.
/// - They establish an "is-a" relationship. You **"are a"** person.
///
/// ### Interfaces:
/// - Use them to define capabilities or roles that can be added to any class.
/// - They establish a "can-do" relationship. You **"can"** play music or **"can"** compete in sports.
///
/// ### Extending and Implementing Together:
/// - A class can inherit common traits from an abstract class and also agree to contracts defined by interfaces.
/// - This allows for rich and flexible class designs that mirror real-world relationships.
///
/// ## Enhancing Your Analogy
///
/// ### Profession as an Abstract Class:
/// - You might have an abstract class `Professional` with abstract methods like `work()`.
/// - You could extend `Professional` to become an `Engineer` or `Artist`, providing specific implementations.
///
/// ### Hobbies as Interfaces:
/// - Interfaces like `Painter` or `Dancer` represent hobbies or skills you can acquire.
/// - By implementing these interfaces, you add hobbies to your repertoire without changing your professional role.
///
/// ## Conclusion
/// Your analogy effectively captures the essence of how abstract classes and interfaces function in programming:
/// - **Abstract Classes** provide a blueprint for shared characteristics.
/// - **Interfaces** allow classes to adopt additional behaviors or capabilities.
/// - A class can extend an abstract class to inherit common traits and implement interfaces to gain specific skills.
///
/// **Remember**: Analogies are a powerful tool for understanding complex concepts by relating them to familiar situations. Your analogy not only makes sense but also demonstrates a solid grasp of how abstract classes and interfaces can be used together to create flexible and organized code structures.
public class _15_Interfaces_and_Abstract_Classes {

	public static void main(String[] args) {

	}

}
