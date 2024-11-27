package part_03._06_Streams._14_Partitioning_Elements;

public class Movie {

	private final int likes;

	private final String title;

	private final Genre genre;

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

	@Override
	public String toString() {
		return "Movie{" + "likes=" + likes + ", title='" + title + '\'' + ", genre=" + genre + '}';
	}

}