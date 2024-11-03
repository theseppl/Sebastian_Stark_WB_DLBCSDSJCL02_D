package aufgabe_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static String path = "/Users/sebastianstark/eclipseIU/JAVA2/meineDateien/flugdaten1.csv";
	static File file = new File(path);

	public static void main(String[] args) {
		
//		Daten aus einer vorhandenen Datei auslesen.
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
				System.out.println(line);
			}
			
			bufferedReader.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Datei nicht gefunden.");
			e.printStackTrace();
		}

	}

}
