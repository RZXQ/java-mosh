package part_02._05_Interfaces._16_When_to_Use_Interfaces;

/// Benefits of Interfaces:
/// 1. Swap implementations:
/// without interface: VideoProcessor -> VideoEncoder
/// with interface: VideoProcessor -> Interfacer <- VideoEncoder
/// 2. Extend your applications:
/// without interface: HttpResponse -> TemplateEngine
/// with interface: HttpResponse -> Interface <- TemplateEngine
/// 3. Test your classes in isolation:
/// with interface: VideoProcessor -> Interface <- EmailService, we can test the VideoProcessor alone, this is called unit testing
public class _16_When_to_Use_Interfaces {

	public static void main(String[] args) {

	}

}
