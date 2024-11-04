package aufgabe_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetMain {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://theseppl.github.io/Fallstudie_Kleiderspende_Sebastian_Stark/index.html");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
