package part_02._05_Interfaces._10_Project_MyTube_Video_Platform;

public class Main {

	public static void main(String[] args) {
		var video = new Video();
		video.setFileName("birthday.mp4");
		video.setTitle("Jennifer's birthday");
		video.setUser(new User("john@domain.com"));

		var processor = new VideoProcessor();
		processor.process(video);
	}

}
