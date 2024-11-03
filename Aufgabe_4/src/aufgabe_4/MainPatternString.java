package aufgabe_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPatternString {

    public static void main(String[] args) {
        String text = "Bitte kontaktieren Sie uns bei Fragen unter fragen.steller@fernstudium.de. "
        		+ "Falls Sie technische Unterstützung benötigen, senden Sie eine E-Mail an support@technik.de. "
        		+ "Unser Team steht Ihnen gerne zur Verfügung und hilft Ihnen so schnell wie möglich weiter. "
        		+ "Wir freuen uns auf Ihre Nachricht!";
        
        String lookingFor = "fragen.steller@fernstudium.de";
        
        Pattern pattern = Pattern.compile(lookingFor);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Die gesuchte Mailadresse befindet sich im Text?: " + matcher.find());
    }
}
