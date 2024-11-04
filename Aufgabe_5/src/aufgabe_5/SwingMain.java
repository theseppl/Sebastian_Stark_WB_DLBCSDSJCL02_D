 package aufgabe_5;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class SwingMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GUI mit dem Paket javax.swing"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100); 
		JCheckBox checkbox = new JCheckBox("Ja zum Fernstudium."); 
		frame.getContentPane().add(checkbox);
		frame.setVisible(true);
	}
}
