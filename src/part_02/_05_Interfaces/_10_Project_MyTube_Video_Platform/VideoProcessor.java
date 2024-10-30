package part_02._05_Interfaces._10_Project_MyTube_Video_Platform;

public class VideoProcessor {

	public void process(Video video) {
		var encoder = new VideoEncoder();
		encoder.encode(video);

		var database = new VideoDatabase();
		database.store(video);

		var emailService = new EmailService();
		emailService.sendEmail(video.getUser());
	}

}
