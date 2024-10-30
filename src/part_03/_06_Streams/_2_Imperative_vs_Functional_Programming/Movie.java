package part_03._06_Streams._2_Imperative_vs_Functional_Programming;

public class Movie {

	private String title;

	private final int likes;

	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

}