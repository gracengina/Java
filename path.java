package Monitoring;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class path {
	public static void main(String[] args) throws URISyntaxException, IOException {
		
				Path path=Path.of("C:" ,"Users", "USER","OneDrive","Desktop","readme" ,"readme.txt");
				String content=Files.readString(path);
				String[] words = content.split("\\s+");
				int number=words.length;
				
				System.out.print("There are " + number +" words in this file.");
			        
		        

	}

}
