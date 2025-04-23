package Filereader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class reader{
	public static void file(String[] args) throws IOException {
		Path path=Path.of("C:" ,"Users", "USER","OneDrive","Desktop","readme");
		String content=Files.readString(path);
		int count=0;
		for(int i:content.toCharArray()) {
			count++;
		}
		System.out.print("There are" +count +"characters in this file");
	}
}