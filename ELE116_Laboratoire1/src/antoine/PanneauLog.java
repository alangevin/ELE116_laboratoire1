package antoine;

import java.awt.Color;

import javax.swing.JPanel;

public class PanneauLog extends JPanel {
	
	public PanneauLog() {
		super.setBounds(0, 100, 700, 600);
		super.setBackground(Color.BLUE);
		super.setLayout(null);
		super.setVisible(true);
		
		ZoneTexte logConsole = new ZoneTexte(0, 10, 10, 680, 560);
		
		TextAreaOutputStream taos = TextAreaOutputStream.getInstance(logConsole);
		
		super.add(logConsole);
	}
}
