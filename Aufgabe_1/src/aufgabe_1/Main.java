package aufgabe_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.print("Bitte geben Sie den Pfad zu Ihrer Datei ein: ");
		Scanner inputScanner = new Scanner(System.in);
		String path = inputScanner.nextLine();

		FileData directory1 = new FileData();
		long totalSize = directory1.getFileDatas(path);

		if (totalSize != 0) {
			System.out.println("\nGesamtgröße des Verzeichnisses: " + path + 
					" inkl. aller Unterverzeichnisse" + " = "
					+ totalSize + " Byte");
		}
		
		inputScanner.close();
	}
}
// Nicht als statische Methode umgesetzt, weil so die versehentliche Summierung mehrerer Größen bei mehreren Anfragen vermeiden lässt.