package aufgabe_1;

import java.io.File;

public class FileData {
	private long totalSize = 0;
	private long subSize = 0;

	public long getFileDatas(String path) {

		File inputPath = new File(path);
		File[] fileArray = inputPath.listFiles();

		if (fileArray != null) {
			System.out.println("\nVerzeichnis: " + path + "\nEnthaltene Dateien: ");
			for (File file : fileArray) {
				if (file.isFile()) {
					System.out.print("	Datei: " + file.getName());
					System.out.println("	Größe: " + file.length() + " Byte");
					subSize = subSize + file.length();
					totalSize = totalSize + file.length();
				}
			}

			System.out.println("Summe der Größe aller Dateien im Verzeichnis = " + subSize + " Byte");
			subSize = 0;

			for (File file : fileArray) {
				if (file.isDirectory()) {
					getFileDatas(file.getAbsolutePath());
				}
			}

		} else {
			System.out.println("Ihre Eingabe ist leider kein gültiger Verzeichnispfad.");
		}

		return totalSize;
	}

}

///Users/sebastianstark/eclipseIU/JAVA2/meineDateien
///Users/sebastianstark/eclipseIU/JAVA2/meineDateien/artikelListe.csv
