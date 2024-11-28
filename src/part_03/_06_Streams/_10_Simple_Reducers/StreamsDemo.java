package part_03._06_Streams._10_Simple_Reducers;

import java.util.Comparator;
import java.util.List;

/// This class demonstrates common stream reduction operations.
///
/// Steps:
/// 1. Create a list of movies.
/// 2. Perform various stream operations like counting, matching, finding, and
///    finding min/max elements, then print the results.
public class StreamsDemo {

    public static void show() {
        var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

        // 1. count(): Count total movies
        System.out.println(movies.stream().count());

        // 2. anyMatch(): Check if any movie has likes > 20
        System.out.println(movies.stream().anyMatch(m -> m.getLikes() > 20));

        // 3. allMatch(): Check if all movies have likes > 20
        System.out.println(movies.stream().allMatch(m -> m.getLikes() > 20));

        // 4. noneMatch(): Check if no movie has likes > 20
        System.out.println(movies.stream().noneMatch(m -> m.getLikes() > 20));

        // 5. findFirst(): Find the first movie title
        System.out.println(movies.stream().findFirst().get().getTitle());

        // 6. findAny(): Find any movie title
        System.out.println(movies.stream().findAny().get().getTitle());

        // 7. max(): Find the max likes
        System.out.println(movies.stream().max(Comparator.comparing(Movie::getLikes)).get().getLikes());

        // 8. min(): Find the min likes
        System.out.println(movies.stream().min(Comparator.comparing(Movie::getLikes)).get().getLikes());
    }

}