package part_03._06_Streams._7_Sorting_Streams;

import java.util.Comparator;
import java.util.List;

/// This class demonstrates sorting streams of Movie objects
/// using different approaches:
/// 1. Using a lambda expression in the sorted() method.
/// 2. Using Comparator.comparing() for ascending and descending order.
public class StreamsDemo {

    // Demonstrates sorting a list of movies using various methods
    public static void show() {
        var movies = List.of(new Movie("b", 10), new Movie("a", 20), new Movie("c", 30));

        // 1. Using a lambda expression in the sorted() method to sort by title
        // Sorts the stream of movies by comparing their titles using a lambda expression
        movies.stream().sorted((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())).forEach(m -> System.out.println(m.getTitle()));

        // 2. Using Comparator.comparing():
        // 2.1 Ascending order
        // Sorts the stream of movies in ascending order by their titles using Comparator.comparing
        movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(m -> System.out.println(m.getTitle()));

        // 2.2 Using Comparator.comparing() and reversed() for descending order
        // Sorts the stream of movies in descending order by their titles using Comparator.comparing and reversed
        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed()).forEach(m -> System.out.println(m.getTitle()));
    }
}