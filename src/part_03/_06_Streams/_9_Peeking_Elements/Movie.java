package part_03._06_Streams._9_Peeking_Elements;

public class Movie {

	private final int likes;

	private final String title;

	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

	@Override
	public String toString() {
		return "Movie{" + "likes=" + likes + ", title='" + title + '\'' + '}';
	}

	public String getTitle() {
		return title;
	}

}