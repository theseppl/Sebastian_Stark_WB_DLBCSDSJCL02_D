package aufgabe_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static String path = "flugdaten.csv";
	static File file = new File(path);
	static StringBuffer flightDataBuffer = new StringBuffer();
	static String flightReport;
	static String string;
	static String searchCriteria = "Lufthansa";

	public static void main(String[] args) {

		try {
//			Aufbau der Pipeline
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			System.out.print("Flugnummer \tAbflugort \tZielort \tFlugdatum \t\tFluggesellschaft\n");
			for (int i = 0; i < 88; i++) {
				System.out.print("-");
			}
			System.out.println();
			
//			Zeilenweises Einlesen des Dateiinhaltes
			for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
				
//				Aufbereiten des Dateiinhaltes mittels split(), trim(), contains() und substring()
				String[] flightDataArray = line.split(", ");
				for (int i = 0; i < flightDataArray.length; i++) {
					flightDataArray[i] = flightDataArray[i].trim();
					if (flightDataArray[i].contains("\"")) {
						flightDataArray[i] = flightDataArray[i].substring(flightDataArray[i].indexOf("\"")+1, 
								flightDataArray[i].lastIndexOf("\""));
					}
				}
				
//				Formatieren und Hinzufügen der aufbereiteten Strings zur StringBuffer-Instanz
				for (String string : flightDataArray) {
					if (string.equals(searchCriteria)) {
						for (int i = 0; i < flightDataArray.length; i++) {
							if (i == flightDataArray.length - 1) {
								flightDataBuffer.append(flightDataArray[i] + "\n");
							} else {
								flightDataBuffer.append(flightDataArray[i] + "\t\t");
							}
						}
					}
				}
			}

//			Erstellung eines String-Objektes aus der StringBuffer-Instanz
			flightReport = flightDataBuffer.toString();
			System.out.println(flightReport);

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
