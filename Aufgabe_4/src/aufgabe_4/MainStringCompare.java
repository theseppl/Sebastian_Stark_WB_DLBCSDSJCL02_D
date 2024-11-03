package aufgabe_4;

public class MainStringCompare {

	public static void main(String[] args) {
		String existingText = "Eiffelturm";
		String comparisonText = "eiffelturm";
		
		System.out.println("Vergleich mit der Methode equals():");
		if (existingText.equals(comparisonText)) {
			System.out.println("Der übergebende String \"" + comparisonText 
					+ "\" entspricht dem vorliegenden String \"" + existingText + "\".");
		} else {
			System.out.println("Der übergebende String \"" + comparisonText 
					+ "\" entspricht nicht dem vorliegenden String \"" + existingText + "\".");
		}
		
		System.out.println("\nVergleich mit der Methode equalsIgnoreCase():");
		if (existingText.equalsIgnoreCase(comparisonText)) {
			System.out.println("Der übergebende String \"" + comparisonText 
					+ "\" entspricht dem vorliegenden String \"" + existingText + "\".");
		} else {
			System.out.println("Der übergebende String \"" + comparisonText 
					+ "\" entspricht nicht dem vorliegenden String \"" + existingText + "\".");
		}
	}
}
