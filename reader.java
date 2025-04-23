package Filereader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class reader{
	public static void file(String[] args) throws IOException {
		Path path=Path.of("C:" ,"Users", "USER","OneDrive","Desktop","readme");
		String content=Files.readString(path);
		String String[] words = content.split("\\s+");
		int number=int number=words.length;

		System.out.print("There are" +number +"words in this file");
	}
}
