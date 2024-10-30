package part_02._05_Interfaces._10_Project_MyTube_Video_Platform;

public class VideoDatabase {

	public void store(Video video) {
		System.out.println("Storing video metadata in a SQL database...");
		System.out.println("Title: " + video.getTitle());
		System.out.println("File Name: " + video.getFileName());
		System.out.println("Done!\n");
	}

}
