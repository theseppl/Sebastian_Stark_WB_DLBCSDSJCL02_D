package aufgabe_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static String path = "/Users/sebastianstark/eclipseIU/JAVA2/meineDateien/flugdaten2.csv";
	static File file = new File(path);

	public static void main(String[] args) {
		
//		Daten aus einer vorhandenen Datei auslesen.
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
//				System.out.println(line);
				String[] aufteilung = line.split(", ");
				for (String string : aufteilung) {
					if (string.equals("Lufthansa")) {
						for (int i = 0; i < aufteilung.length; i++) {
							if (i == 0) {
								System.out.println("Flugnummer: " + aufteilung[i].trim());
							}
							if (i == 1) {
								System.out.println("Start-Flughafen: " + aufteilung[i].substring(1, 4));
							}
							if (i == 2) {
								System.out.println("Ziel-Flughafen: " + aufteilung[i].substring(1, 4));
							}
							if (i == 3) {
								System.out.println("Flugdatum: " + aufteilung[i]);
							}
							if (i == 4) {
								System.out.println("Fluggesellschaft: " + aufteilung[i] + "\n");
							}
						}
					}
				}
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
