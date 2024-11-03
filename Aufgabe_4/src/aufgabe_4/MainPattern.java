package aufgabe_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPattern {

    public static void main(String[] args) {
        String text = "Bitte kontaktieren Sie uns bei Fragen unter fragen.steller@fernstudium.de. "
        		+ "Falls Sie technische Unterstützung benötigen, senden Sie eine E-Mail an support@technik.com. "
        		+ "Unser Team steht Ihnen gerne zur Verfügung und hilft Ihnen so schnell wie möglich weiter. "
        		+ "Wir freuen uns auf Ihre Nachricht!";

        String regex = "[A-Za-z.]+@[A-Za-z.]+[A-Za-z]{2,3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Im Text gefundene E-Mail-Adressen: " + matcher.group());
        }
    }
}
