package aufgabe_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {

	public static void writeToFile(String text, String fileName) {
		File file = new File(fileName);

		try {
			FileWriter filewriter = new FileWriter(file);
			filewriter.write(text);
			filewriter.close();
		} catch (IOException e) {
			System.out.println("Das Schreiben der Datei war leider nicht erfolgreich.");
		}
	}
}