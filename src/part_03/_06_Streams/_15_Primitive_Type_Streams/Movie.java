package part_03._06_Streams._15_Primitive_Type_Streams;

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