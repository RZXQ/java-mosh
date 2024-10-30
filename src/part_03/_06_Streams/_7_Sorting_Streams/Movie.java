package part_03._06_Streams._7_Sorting_Streams;

public class Movie {

	private final int likes;
	private String title;

	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

	public String getTitle() {
		return title;
	}

}