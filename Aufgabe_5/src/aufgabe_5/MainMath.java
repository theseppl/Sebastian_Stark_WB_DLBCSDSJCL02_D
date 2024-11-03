package aufgabe_5;

// Klassen des Paketes java.math importieren.
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainMath {

	public static void main(String[] args) {
		BigDecimal dividend = new BigDecimal(23456);
		BigDecimal divisor = new BigDecimal(10000);
		
		System.out.println("Division ohne Rundung: " 
		+ dividend.divide(divisor));
		
		System.out.println("Division mit Rundung: " 
		+ dividend.divide(divisor, 2, RoundingMode.HALF_UP));

	}
}
