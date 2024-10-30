package part_02._05_Interfaces._10_Project_MyTube_Video_Platform;

public class EmailService {

	public void sendEmail(User user) {
		System.out.println("Notifying " + user.getEmail() + "...");
		System.out.println("Done!\n");
	}

}
