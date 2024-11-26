package part_03._06_Streams._2_Imperative_vs_Functional_Programming;

public class Movie {

	private final int likes;

	private final String title;

	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "Movie{" + "title='" + title + '\'' + ", likes=" + likes + '}';
	}

	public int getLikes() {
		return likes;
	}

}