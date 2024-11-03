package aufgabe_4;

public class MainStringStartsEnds {

	public static void main(String[] args) {
		String existingText = "Eiffelturm";
		String startText = "Ei";
		String endText = "urm";
		
		System.out.println("Vergleich mit der Methode startsWith():");
		if (existingText.startsWith(startText)) {
			System.out.println("Der übergebende Teilstring \"" + startText 
					+ "\" ist der Anfang des vorliegenden String \"" + existingText + "\".");
		} else {
			System.out.println("Der übergebende Teilstring \"" + startText 
					+ "\" ist nicht der Anfang des vorliegenden String \"" + existingText + "\".");
		}
		
		System.out.println("\nVergleich mit der Methode endsWith():");
		if (existingText.endsWith(endText)) {
			System.out.println("Der übergebende Teilstring \"" + endText 
					+ "\" ist das Ende des vorliegenden String \"" + existingText + "\".");
		} else {
			System.out.println("Der übergebende Teilstring \"" + endText 
					+ "\" ist nicht das Ende des vorliegenden String \"" + existingText + "\".");
		}
	}
}
