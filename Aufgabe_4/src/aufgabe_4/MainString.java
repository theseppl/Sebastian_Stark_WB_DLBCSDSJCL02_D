package aufgabe_4;

public class MainString {
    public static void main(String[] args) {
        String text = "Bitte kontaktieren Sie uns bei Fragen unter fragen@fernstudium.de. "
        		+ "Falls Sie technische Unterstützung benötigen, senden Sie eine E-Mail an support@technik.de. "
        		+ "Unser Team steht Ihnen gerne zur Verfügung und hilft Ihnen so schnell wie möglich weiter. "
        		+ "Wir freuen uns auf Ihre Nachricht!";
        
//      Die Methode contains().
        if (text.contains("fragen@fernstudium.de")) {
            System.out.println("Die E-Mail-Adresse fragen@fernstudium.de ist im Text enthalten.");
        }
        
//      Die Methode indexOf().
        int index = text.indexOf("support@technik.de");
        if (index != -1) {
            System.out.println("Die E-Mail-Adresse support@technik.de beginnt bei Index: " + index);
        }
        
//      Die Methode substring().
        String email = text.substring(text.indexOf("fragen@fernstudium.de"), text.indexOf(". "));
        System.out.println("Gefundene E-Mail-Adresse: " + email);
    }
}
























