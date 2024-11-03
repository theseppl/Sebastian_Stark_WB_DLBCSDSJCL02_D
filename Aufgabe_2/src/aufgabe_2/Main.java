package aufgabe_2;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static String text;
	static String path;
	static String defaultLocation = "/Users/sebastianstark/";
	static String file;
	static int whichLocation;
	static String sep = File.separator;

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Der Standardspeicherort ist: " + defaultLocation + "\n");
		System.out.println("Speicherort beibehalten? 	Eingabe = 1");
		System.out.println("Speicherort ändern? 		Eingabe = 2");
		System.out.print("Ihre Auswahl (1 oder 2): ");

		try {
			whichLocation = inputScanner.nextInt();
//			nextInt liest keine ganze Zeile, daher muss das Enter in einer zusätzlichen inputScanner verbraucht werden.
			inputScanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("\nSie können nur Zahlenwerte eingeben.");
			inputScanner.nextLine();
		}

		switch (whichLocation) {
		case 1:
			path = defaultLocation;
			break;
		case 2:
			System.out.print("\nBitte geben Sie den Pfad zum Wunschspeicherort ein:");
			path = inputScanner.nextLine();
			break;

		default:
			System.out.print("\nSie können nur 1 oder 2 eingeben.\n");
			path = "";
			break;
		}

		File inputPath = new File(path);
		if (inputPath.isDirectory()) {
			System.out.print("\nBitte geben Sie Ihren Text ein: ");
			text = inputScanner.nextLine();

			System.out.print("\nBitte geben Sie einen Namen für Ihre Datei ein (ohne Dateiendung): ");
			file = sep + inputScanner.nextLine() + ".txt";
			path = path + file;

			FileMaker.writeToFile(text, path);
			System.out.println("Die Datei " + file + " wurde erfolgreich gespeichert.");
		}

		else {
			System.out.println("Ihre Eingabe ist kein gültiger Verzeichnispfad.");
		}

		inputScanner.close();

//		/Users/sebastianstark/eclipseIU/JAVA2/meineDateien/jane.txt

	}
}
