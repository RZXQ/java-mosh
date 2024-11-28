package part_03._06_Streams._11_Reducing_a_Stream;

import java.util.List;

/// This class demonstrates two ways to sum the likes of movies using streams:
/// 1) Using `reduce` without an identity and handling the Optional result.
/// 2) Using `reduce` with an identity to avoid dealing with Optional.
public class StreamsDemo {

    // Entry point for the demonstration
    public static void show() {
        var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

        // 1. Reduce without identity.
        // This approach maps the stream of movies to their likes, and then reduces the stream
        System.out.println(movies.stream().map(Movie::getLikes).reduce(Integer::sum).orElse(0));

        // 2. Reduce with identity.
        // This approach also maps the stream of movies to their likes, and then reduces the
        System.out.println(movies.stream().map(Movie::getLikes).reduce(0, Integer::sum));
    }
}