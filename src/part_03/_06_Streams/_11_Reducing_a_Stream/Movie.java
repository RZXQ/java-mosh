package part_03._06_Streams._11_Reducing_a_Stream;

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

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Movie{" + "likes=" + likes + ", title='" + title + '\'' + '}';
	}

}