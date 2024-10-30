package part_03._06_Streams._13_Grouping_Elements;

public class Movie {

	private final int likes;

	private String title;

	private Genre genre;

	public Movie(String title, int likes, Genre genre) {
		this.title = title;
		this.likes = likes;
		this.genre = genre;
	}

	public int getLikes() {
		return likes;
	}

	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return genre;
	}

}