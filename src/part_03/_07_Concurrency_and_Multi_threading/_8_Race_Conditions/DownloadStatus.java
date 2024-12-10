package part_03._07_Concurrency_and_Multi_threading._8_Race_Conditions;

public class DownloadStatus {

	private int totalBytes;

	public void incrementBytes() {
		this.totalBytes++;
	}

	public int getTotalBytes() {
		return totalBytes;
	}

}